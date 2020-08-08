package com.wts.task;

import com.jfinal.kit.PropKit;
import com.wts.entity.model.Unhandle;
import com.wts.service.AllworkService;
import com.wts.service.UnhandleService;
import com.wts.util.ParamesAPI;
import me.chanjar.weixin.cp.api.impl.WxCpServiceImpl;
import me.chanjar.weixin.cp.bean.WxCpMessage;
import me.chanjar.weixin.cp.config.impl.WxCpDefaultConfigImpl;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import static com.wts.util.WordUtil.*;
import static com.wts.util.others.IpKit.getLocalHostIP;
import static com.wts.util.util12345.getDoc;
import static com.wts.util.util12345.getPageUrl;
import static com.wts.util.wxUtil.*;

public class Down12345Unhandle implements Runnable{

    String path2 = "D:\\当前下载\\";
    @Override
    public void run() {
        String ip = getLocalHostIP();
        String neiwangIP = PropKit.use("config-dev.txt").get("neiwangIP");
        if (ip.equals(neiwangIP)){
            String url = getPageUrl("0", "0");
            String cookie = PropKit.use("config-dev.txt").get("cookie");
            Document doc = getDoc(url,cookie);
            Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
            for (int i = 0; i < trs.size() - 1; i++) {
                Element in = trs.get(i).getElementsByTag("td").get(0).getElementsByTag("input").get(0);
                String value = in.attr("value");
                String file_guid = "";
                String order_guid = "";
                if (value.substring(9,10).equals("{")){
                    file_guid = value.substring(9, 47);
                    order_guid = value.substring(53, 91);
                }else{
                    file_guid = value.substring(8, 46);
                    order_guid = value.substring(51, 89);
                }
                Unhandle unhandle = get(file_guid, order_guid, cookie);
                try {
                    save(unhandle);
//                WxCpDefaultConfigImpl config = new WxCpDefaultConfigImpl();
//                config.setCorpId(ParamesAPI.corpId);      // 设置微信企业号的appid
//                config.setCorpSecret(ParamesAPI.secret);  // 设置微信企业号的app corpSecret
//                config.setAgentId(1000002);     // 设置微信企业号应用ID
//                config.setToken("...");       // 设置微信企业号应用的token
//                config.setAesKey("...");      // 设置微信企业号应用的EncodingAESKey
//                WxCpServiceImpl wxCpService = new WxCpServiceImpl();
//                wxCpService.setWxCpConfigStorage(config);
//                WxCpMessage message = WxCpMessage
//                        .TEXT()
//                        .agentId(1000002)
//                        //.toUser("@all")
//                        .toUser("WangTianShuo")
//                        .content("新工单：" + undo.getOrderCode())
//                        .build();
//                File file = new File(path2 + unhandle.get("order_code") + "-" + order_guid + ".docx");
//                String mediaId = wxCpService.getMediaService().upload("file",file).getMediaId();
//                WxCpMessage message = WxCpMessage
//                        .FILE()
//                        .agentId(1000002)
//                        //.toUser("@all")
//                        .toUser("WangTianShuo")
//                        .mediaId(mediaId)
//                        .build();
//                wxCpService.messageSend(message);
//
//
//                wxCpService.messageSend(message);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Unhandle get(String file_guid, String order_guid, String cookie){
        String url = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?fileGuid="+file_guid+"&GUID=" +order_guid+ "&IsZDDB=&xxlyid=1";
        Document doc = getDoc(url,cookie);
        Element tbody = null;
        try{
            tbody = doc.getElementsByClass("tablebgcolor").get(0).getElementsByTag("tbody").get(0);
        }catch (Exception e){
            System.out.println("未打印工单：" + url);
            System.out.println(doc);
        }
        Element td = tbody.getElementsByTag("tr").get(8).getElementsByTag("td").get(1);
        String enclosure = "";
        if (!td.text().trim().equals("")){
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
        String txlx = tbody.getElementById("txlx").text();//督办类型---暂无
        String transfer_opinion = tbody.getElementById("remark").text();//转办意见
        String transfer_process = tbody.getElementById("banliFlow").text();//转办流程
        String remark = tbody.getElementById("beizhu").text();//备注
        Unhandle unhandle = new Unhandle();
        unhandle.set("file_guid",file_guid)
                .set("order_guid",order_guid)
                .set("order_state",order_state)
                .set("order_code",order_code)
                .set("link_person",link_person)
                .set("link_phone",link_phone)
                .set("link_address",link_address)
                .set("business_environment",business_environment)
//                .set("new_supervision",new_supervision)
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
        return unhandle;

    }

    public void save(Unhandle unhandle) throws Exception {
        UnhandleService service = new UnhandleService();
        AllworkService service2 = new AllworkService();
        if (service.findNumByGUID(unhandle.get("order_guid"))==0){
            service.add(unhandle);
            String file_guid = unhandle.get("file_guid");
            String order_guid = unhandle.get("order_guid");
            String order_state = unhandle.get("order_state");
            String order_code = unhandle.get("order_code");
            String link_person = unhandle.get("link_person");
            String link_phone = unhandle.get("link_phone");
            String link_address = unhandle.get("link_address");
            String business_environment = unhandle.get("business_environment");
//            String new_supervision = unhandle.get("new_supervision");
            String accept_person = unhandle.get("accept_person");
            String accept_person_code = unhandle.get("accept_person_code");
            String accept_channel = unhandle.get("accept_channel");
            String handle_type = unhandle.get("handle_type");
            String phone_type = unhandle.get("phone_type");
            String write_time = unhandle.get("write_time");
            String urgency_degree = unhandle.get("urgency_degree");
            String problem_classification = unhandle.get("problem_classification");
            String is_secret = unhandle.get("is_secret");
            String is_reply = unhandle.get("is_reply");
            String reply_remark = unhandle.get("reply_remark");
            String problem_description = unhandle.get("problem_description");
            String send_person = unhandle.get("send_person");
            String send_time = unhandle.get("send_time");
            String end_date = unhandle.get("end_date");
            String transfer_opinion = unhandle.get("transfer_opinion");
            String transfer_process = unhandle.get("transfer_process");
            String remark = unhandle.get("remark");
            String enclosure = unhandle.get("enclosure");
            service2.add(file_guid, order_guid,order_code,link_person,link_phone,link_address,send_time,problem_description);
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
            map.put("phone_time",service2.findNumByPhone(unhandle.get("link_phone")));
            LocalDate date = LocalDate.now();
            DateTimeFormatter yyyy = DateTimeFormatter.ofPattern("yyyy");
            DateTimeFormatter MM = DateTimeFormatter.ofPattern("MM");
            DateTimeFormatter dd = DateTimeFormatter.ofPattern("dd");
            String path = "D:\\工单备份\\"+date.format(yyyy)+ "\\"+date.format(MM)+ "\\"+date.format(dd)+ "\\";
            System.out.println("待办理工单：" + order_code + "-" + link_person + "-" + send_time);
//            service.add(order_guid,order_state, order_code, link_person,link_phone,link_address,business_environment,new_supervision,accept_person,accept_person_code,accept_channel,handle_type,phone_type,write_time,urgency_degree, problem_classification,is_secret,is_reply,reply_remark,problem_description,send_person,send_time,end_date,transfer_opinion,transfer_process,remark,enclosure);

            String personCode = service.getPersonCode();
            CreatWordByModel("D:\\TemplateDoc"+personCode+".docx", map, path + order_code + "-" + order_guid + ".docx");
            CreatWordByModel("D:\\TemplateDoc.docx", map, path2 + order_code + "-" + order_guid + ".docx");
            String printerName = "HP LaserJet 1020";//打印机名包含字串
//            String printerName = "HP LaserJet MFP M227-M231 PCL-6 (V4)";//打印机名包含字串
            printWord(path + order_code + "-" + order_guid + ".docx",printerName);
            send(unhandle, service2);
        }
    }

    public void send (Unhandle unhandle, AllworkService allworkService) throws Exception{
        Boolean network = goWaiWang();
        if (network) {
            String token = getToken();
            String errcode = addUnhandle(token,
                    unhandle.get("order_guid"),
                    unhandle.get("order_code"),
                    unhandle.get("link_person"),
                    unhandle.get("link_phone"),
                    allworkService.findNumByPhone(unhandle.get("link_phone")),
                    unhandle.get("write_time"),
                    unhandle.get("send_time"),
                    unhandle.get("urgency_degree"),
                    unhandle.get("is_secret"),
                    unhandle.get("is_reply"),
                    unhandle.get("end_date"),
                    unhandle.get("problem_description").toString().substring(0,500),
                    unhandle.get("transfer_opinion").toString().substring(0,500),
                    unhandle.get("transfer_process").toString().substring(0,500),
                    unhandle.get("accept_channel"));
            if (errcode.equals("0")){
                System.out.println("待办理工单已推送：" + unhandle.get("order_code") + "-" + unhandle.get("link_person"));
            } else {
                System.out.println("待办理工单推送失败：" + unhandle.get("order_code") + "-" + unhandle.get("link_person"));
            }
        }
        goNeiWang();
    }
    public static void main(String[] args) {
        String url = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?fileGuid={50b948eb-cdee-44f4-b795-8a3d5423fd38}&GUID={a13bcd62-e598-4753-aa04-701ff8442131}&IsZDDB=&xxlyid=1";
        String cookie = PropKit.use("config-dev.txt").get("cookie");
        Document doc = getDoc(url,cookie);
        Element tbody = null;
        try{
            tbody = doc.getElementsByClass("tablebgcolor").get(0).getElementsByTag("tbody").get(0);
        }catch (Exception e){
            System.out.println("未打印工单：" + url);
            System.out.println(doc);
        }
        Element td = tbody.getElementsByTag("tr").get(8).getElementsByTag("td").get(1);
        String enclosure = "";
        if (!td.text().trim().equals("")){
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
        String txlx = tbody.getElementById("txlx").text();//督办类型---暂无
        String transfer_opinion = tbody.getElementById("remark").text();//转办意见
        String transfer_process = tbody.getElementById("banliFlow").text();//转办流程
        String remark = tbody.getElementById("beizhu").text();//备注
        Unhandle unhandle = new Unhandle();
        unhandle.set("file_guid","{50b948eb-cdee-44f4-b795-8a3d5423fd38}")
                .set("order_guid","{a13bcd62-e598-4753-aa04-701ff8442131}")
                .set("order_state",order_state)
                .set("order_code",order_code)
                .set("link_person",link_person)
                .set("link_phone",link_phone)
                .set("link_address",link_address)
                .set("business_environment",business_environment)
//                .set("new_supervision",new_supervision)
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
        System.out.println(unhandle);;
    }
}
