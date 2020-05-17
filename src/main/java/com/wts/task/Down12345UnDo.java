package com.wts.task;

import com.jfinal.kit.PropKit;
import com.wts.entity.model.Undo;
import com.wts.service.UndoService;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import static com.wts.util.WordUtil.*;
import static com.wts.util.util12345.getDoc;
import static com.wts.util.util12345.getListUrl;

public class Down12345UnDo implements Runnable{

    @Override
    public void run() {
        String url = getListUrl("0", "0");
        String cookie = PropKit.use("config-dev.txt").get("cookie");
        Document doc = getDoc(url,cookie);
        Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
        for (int i = 0; i < trs.size() - 1; i++) {
            Element in = trs.get(i).getElementsByTag("td").get(0).getElementsByTag("input").get(0);
            String value = in.attr("value");
            String order_guid = value.substring(5, 43);
            Undo undo = get(order_guid, cookie);
            try {
                save(undo);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Undo get(String order_guid, String cookie){
        String url = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?GUID=" +order_guid+ "&IsZDDB=&";
        Document doc = getDoc(url,cookie);
        Element tbody = doc.getElementsByClass("tablebgcolor").get(0).getElementsByTag("tbody").get(0);
        Element td = tbody.getElementsByTag("tr").get(9).getElementsByTag("td").get(1);
        String enclosure = "";
        if (!td.text().equals("")){
            enclosure = "请查看附件";
        }
        String order_state = tbody.getElementById("gdzt").text();//工单状态
        String order_code = tbody.getElementById("HotLineWorkNumber").text();//工单编号
        String link_person = tbody.getElementById("linkPerson").text();//联系人
        String link_phone = tbody.getElementById("linkPhone").text();//联系电话
        String link_address = tbody.getElementById("address").text();//联系地址
        String business_environment = tbody.getElementById("yshj").text();//营商环境
        String new_supervision = tbody.getElementById("isNewDuCha").text();//新版督察
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
        String txlx = tbody.getElementById("txlx").text();//督办类型---暂无
        String transfer_opinion = tbody.getElementById("remark").text();//转办意见
        String transfer_process = tbody.getElementById("banliFlow").text();//转办流程
        String remark = tbody.getElementById("beizhu").text();//备注
        Undo undo = new Undo();
        undo.set("order_guid",order_guid)
                .set("order_state",order_state)
                .set("order_code",order_code)
                .set("link_person",link_person)
                .set("link_phone",link_phone)
                .set("link_address",link_address)
                .set("business_environment",business_environment)
                .set("new_supervision",new_supervision)
                .set("accept_person",accept_person)
                .set("accept_person_code",accept_person_code)
                .set("accept_channel",accept_channel)
                .set("handle_type",handle_type)
                .set("phone_type",phone_type)
                .set("write_time",write_time)
                .set("urgency_degree",urgency_degree)
                .set("problem_classification",problem_classification)
                .set("is_secret",is_secret)
                .set("is_reply",is_reply)
                .set("reply_remark",reply_remark)
                .set("problem_description",problem_description)
                .set("send_person",send_person)
                .set("send_time",send_time)
                .set("end_date",end_date)
                .set("transfer_opinion",transfer_opinion)
                .set("transfer_process",transfer_process)
                .set("enclosure",enclosure)
                .set("remark",remark);
         return undo;

    }

    public void save(Undo undo) throws Exception {
        LocalDate date = LocalDate.now();
        DateTimeFormatter yyyy = DateTimeFormatter.ofPattern("yyyy");
        DateTimeFormatter MM = DateTimeFormatter.ofPattern("MM");
        DateTimeFormatter dd = DateTimeFormatter.ofPattern("dd");
        String order_guid = undo.get("order_guid");
        String order_state = undo.get("order_state");
        String order_code = undo.get("order_code");
        String link_person = undo.get("link_person");
        String link_phone = undo.get("link_phone");
        String link_address = undo.get("link_address");
        String business_environment = undo.get("business_environment");
        String new_supervision = undo.get("new_supervision");
        String accept_person = undo.get("accept_person");
        String accept_person_code = undo.get("accept_person_code");
        String accept_channel = undo.get("accept_channel");
        String handle_type = undo.get("handle_type");
        String phone_type = undo.get("phone_type");
        String write_time = undo.get("write_time");
        String urgency_degree = undo.get("urgency_degree");
        String problem_classification = undo.get("problem_classification");
        String is_secret = undo.get("is_secret");
        String is_reply = undo.get("is_reply");
        String reply_remark = undo.get("reply_remark");
        String problem_description = undo.get("problem_description");
        String send_person = undo.get("send_person");
        String send_time = undo.get("send_time");
        String end_date = undo.get("end_date");
        String transfer_opinion = undo.get("transfer_opinion");
        String transfer_process = undo.get("transfer_process");
        String remark = undo.get("remark");
        String enclosure = undo.get("enclosure");
        Map<String, String> map = new HashMap<String, String>();
        map.put("accept_person_code",accept_person_code);
        map.put("end_date",end_date);
        map.put("order_code",order_code);
        map.put("urgency_degree",urgency_degree);
        map.put("phone_type",phone_type);
        map.put("accept_channel",accept_channel);
        map.put("is_reply",is_reply);
        map.put("is_secret",is_secret);
        map.put("link_person",link_person);
        map.put("link_phone",link_phone);
        map.put("link_address",link_address);
        map.put("reply_remark",reply_remark);
        map.put("problem_classification",problem_classification);
        map.put("problem_description",problem_description);
        map.put("transfer_opinion",transfer_opinion);
        map.put("transfer_process",transfer_process);
        map.put("enclosure",enclosure);
        map.put("order_guid",order_guid);
        String path = "D:\\工单备份\\"+date.format(yyyy)+ "\\"+date.format(MM)+ "\\"+date.format(dd)+ "\\";
        String path2 = "D:\\当前下载\\";
        System.out.println("待办理工单：" + order_code + "-" + link_person + "-" + send_time);
        UndoService service = new UndoService();
        if (service.findNumByGUID(order_guid)==0){
            service.add(undo);
//            service.add(order_guid,order_state, order_code, link_person,link_phone,link_address,business_environment,new_supervision,accept_person,accept_person_code,accept_channel,handle_type,phone_type,write_time,urgency_degree, problem_classification,is_secret,is_reply,reply_remark,problem_description,send_person,send_time,end_date,transfer_opinion,transfer_process,remark,enclosure);
            CreatWordByModel("D:\\TemplateDoc.docx", map, path + order_code + "-" + order_guid + ".docx");
            CreatWordByModel("D:\\TemplateDoc.docx", map, path2 + order_code + "-" + order_guid + ".docx");
            String printerName = "HP LaserJet 1020";//打印机名包含字串
            printWord(path + order_code + "-" + order_guid + ".docx",printerName);
        }
    }

}