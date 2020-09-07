package com.wts.task;

import com.jfinal.kit.PropKit;
import com.wts.entity.model.Allwork;
import com.wts.service.AllworkService;
import com.wts.util.util12345;
import org.apache.log4j.Logger;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static com.wts.util.WordUtil.*;
import static com.wts.util.util12345.getPageUrl;

public class AllworkTask implements Runnable {
    private static final String path = "D:\\当前下载\\";
    private static final Logger logger = Logger.getLogger(Allwork.class);

    @Override
    public void run(){
        String cookie = PropKit.use("config-dev.txt").get("cookie");
        allwork(cookie);
    }
    public void allwork(String cookie) {
        String url = getPageUrl("0", "0");
        Document doc = util12345.getDoc(url, cookie);
        if (doc!=null) {
            Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
            for (int i = 0; i < trs.size() - 1; i++) {
                Element in = trs.get(i).getElementsByTag("td").get(0).getElementsByTag("input").get(0);
                String value = in.attr("value");
                String file_guid, order_guid;
                if (String.valueOf(value.charAt(9)).equals("{")) {
                    file_guid = value.substring(9, 47);
                    order_guid = value.substring(53, 91);
                } else {
                    file_guid = value.substring(8, 46);
                    order_guid = value.substring(51, 89);
                }
                Allwork allwork = getAllwork(file_guid, order_guid, cookie);
                if (allwork != null) {
                    saveAllwork(allwork);
                }
            }
        }
    }
    public Allwork getAllwork(String file_guid, String order_guid, String cookie) {
        String url = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?fileGuid=" + file_guid + "&GUID=" + order_guid + "&IsZDDB=&xxlyid=1";
        try {
            Document doc = util12345.getDoc(url, cookie);
            if (doc==null){
                logger.error("无法获取allwork列表：" + url);
                System.out.println("无法获取allwork列表：" + url);
                return null;
            }
            Element tbody = doc.getElementsByClass("tablebgcolor").get(0).getElementsByTag("tbody").get(0);
            Element td = tbody.getElementsByTag("tr").get(8).getElementsByTag("td").get(1);
            String enclosure = "";
            if (!td.text().trim().equals("")) {
                enclosure = "请查看附件";
            }
            String order_state = tbody.getElementById("gdzt").text();//工单状态
            String order_code = tbody.getElementById("HotLineWorkNumber").text();//工单编号
            String link_person = tbody.getElementById("linkPerson").text();//联系人
            String link_phone = tbody.getElementById("linkPhone").text();//联系电话
            String link_address = tbody.getElementById("address").text();//联系地址
            String business_environment = tbody.getElementById("yshj").text();//营商环境
//        String new_supervision = tbody.getElementById("isNewDuCha").text();//新版督察
            String accept_person = tbody.getElementById("acceptPerson").text();//受理人员
            String accept_person_code = tbody.getElementById("hwyId").text();//受理员编号
            String accept_channel = tbody.getElementById("xxlyId").text();//受理渠道
            String handle_type = tbody.getElementById("sllx").text();//办理类型
            String phone_type = tbody.getElementById("ldlbid").text();//来电类别
            String write_time = tbody.getElementById("writeTime").text();//录入时间
            String urgency_degree = getUrgencyDegree(tbody.getElementById("urgencyDegree"));//紧急程度
            String problem_classification = tbody.getElementById("quesTypeInfo").text();//问题分类
            String is_secret = tbody.getElementById("isSecret").text();//是否保密
            String is_reply = tbody.getElementById("isReply").text();//是否回复
            String reply_remark = tbody.getElementById("hfdh").text();//回复备注
            String problem_description = tbody.getElementById("content").text();//问题描述
            String send_person = tbody.getElementById("sendPerson").text();//发送人
            String send_time = tbody.getElementById("sendTime").text();//发送时间
            String end_date = tbody.getElementById("endDate").text();//办理时限
//            String txlx = tbody.getElementById("txlx").text();//督办类型---暂无
            String transfer_opinion = tbody.getElementById("remark").text();//转办意见
            String transfer_process = tbody.getElementById("banliFlow").text();//转办流程
            String remark = tbody.getElementById("beizhu").text();//备注
            Allwork allwork = new Allwork();
            allwork.set("file_guid", file_guid)
                    .set("order_guid", order_guid)
                    .set("order_state", order_state)
                    .set("order_code", order_code)
                    .set("link_person", link_person)
                    .set("link_phone", link_phone)
                    .set("link_address", link_address)
                    .set("business_environment", business_environment)
//                .set("new_supervision",new_supervision)
                    .set("accept_person", accept_person)
                    .set("accept_person_code", accept_person_code)
                    .set("accept_channel", accept_channel)
                    .set("handle_type", handle_type)
                    .set("phone_type", phone_type)
                    .set("write_time", write_time)
                    .set("urgency_degree", urgency_degree)
                    .set("problem_classification", problem_classification)
                    .set("is_secret", is_secret)
                    .set("is_reply", is_reply)
                    .set("reply_remark", reply_remark)
                    .set("problem_description", problem_description)
                    .set("send_person", send_person)
                    .set("send_time", send_time)
                    .set("end_date", end_date)
                    .set("transfer_opinion", transfer_opinion)
                    .set("transfer_process", transfer_process)
                    .set("enclosure", enclosure)
                    .set("remark", remark);
            return allwork;
        } catch (Exception e) {
            logger.error("time:" + new Date() + ";无法获取allwork工单:"+ url);
            logger.error(e);
            System.out.println("错误的allwork工单：" + url);
            return null;
        }
    }
    public void saveAllwork(Allwork allwork) {
        AllworkService service = new AllworkService();
        if (service.findNumByGUID(allwork.get("order_guid")) == 0) {
            service.add(allwork);
//            String file_guid = allwork.get("file_guid");
            String order_guid = allwork.get("order_guid");
//            String order_state = allwork.get("order_state");
            String order_code = allwork.get("order_code");
            String link_person = allwork.get("link_person");
            String link_phone = allwork.get("link_phone");
            String link_address = allwork.get("link_address");
//            String business_environment = allwork.get("business_environment");
//            String new_supervision = unhandle.get("new_supervision");
//            String accept_person = allwork.get("accept_person");
            String accept_person_code = allwork.get("accept_person_code");
            String accept_channel = allwork.get("accept_channel");
//            String handle_type = allwork.get("handle_type");
            String phone_type = allwork.get("phone_type");
//            String write_time = allwork.get("write_time");
            String urgency_degree = allwork.get("urgency_degree");
            String problem_classification = allwork.get("problem_classification");
            String is_secret = allwork.get("is_secret");
            String is_reply = allwork.get("is_reply");
            String reply_remark = allwork.get("reply_remark");
            String problem_description = allwork.get("problem_description");
//            String send_person = allwork.get("send_person");
            String send_time = allwork.get("send_time");
            String end_date = allwork.get("end_date");
            String transfer_opinion = allwork.get("transfer_opinion");
            String transfer_process = allwork.get("transfer_process");
//            String remark = allwork.get("remark");
            String enclosure = allwork.get("enclosure");
            Map<String, String> map = new HashMap<>();
            map.put("accept_person_code", accept_person_code);
            map.put("end_date", end_date);
            map.put("order_code", order_code);
            map.put("urgency_degree", urgency_degree);
            map.put("phone_type", phone_type);
            map.put("accept_channel", accept_channel);
            map.put("is_reply", is_reply);
            map.put("is_secret", is_secret);
            map.put("link_person", link_person);
            map.put("link_phone", link_phone);
            map.put("link_address", link_address);
            map.put("reply_remark", reply_remark);
            map.put("problem_classification", problem_classification);
            map.put("problem_description", problem_description);
            map.put("transfer_opinion", transfer_opinion);
            map.put("transfer_process", transfer_process);
            map.put("enclosure", enclosure);
            map.put("order_guid", order_guid);
            map.put("phone_time", service.findNumByPhone(allwork.get("link_phone")));
            LocalDate date = LocalDate.now();
            DateTimeFormatter yyyy = DateTimeFormatter.ofPattern("yyyy");
            DateTimeFormatter MM = DateTimeFormatter.ofPattern("MM");
            DateTimeFormatter dd = DateTimeFormatter.ofPattern("dd");
            String path = "D:\\工单备份\\" + date.format(yyyy) + "\\" + date.format(MM) + "\\" + date.format(dd) + "\\";
            logger.info("allwork工单：" + order_code + "-" + link_person + "-" + send_time);
            System.out.println("allwork工单：" + order_code + "-" + link_person + "-" + send_time);
            String personCode = service.getPersonCode();
            CreatWordByModel("D:\\TemplateDoc" + personCode + ".docx", map, path + order_code + "-" + order_guid + ".docx");
            CreatWordByModel("D:\\TemplateDoc.docx", map, AllworkTask.path + order_code + "-" + order_guid + ".docx");
            String printerName = "HP LaserJet 1020";//打印机名包含字串
//            String printerName = "HP LaserJet MFP M227-M231 PCL-6 (V4)";//打印机名包含字串
            printWord(path + order_code + "-" + order_guid + ".docx", printerName);
        }
    }

}
