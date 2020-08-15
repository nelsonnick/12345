package com.wts.task;

import com.jfinal.kit.PropKit;
import com.wts.entity.model.Fallback;
import com.wts.entity.model.Reply;
import com.wts.entity.model.Unhandle;
import com.wts.service.AllworkService;
import com.wts.service.FallbackService;
import com.wts.service.ReplyService;
import com.wts.service.UnhandleService;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.wts.util.WordUtil.*;
import static com.wts.util.others.IpKit.getLocalHostIP;
import static com.wts.util.util12345.getDoc;
import static com.wts.util.util12345.getPageUrl;
import static com.wts.util.wxUtil.*;
import static com.wts.util.wxUtil.goNeiWang;

public class DownAll  implements Runnable{
    String path2 = "D:\\当前下载\\";
    List<Unhandle> unhandleList = new ArrayList<>();
    List<Reply> replyList = new ArrayList<>();
    List<Fallback> fallbackList = new ArrayList<>();

    @Override
    public void run() {
        String ip = getLocalHostIP();
        String neiwangIP = PropKit.use("config-dev.txt").get("neiwangIP");
        String cookie = PropKit.use("config-dev.txt").get("cookie");
        if (ip.equals(neiwangIP)) {
            unhandle(cookie);
            reply(cookie);
            fallback(cookie);
            if (unhandleList.size()!=0 || replyList.size()!=0 || fallbackList.size()!=0) {
                try {
                    Boolean network = goWaiWang();
                    if (network) {
                        for (Unhandle u : unhandleList) {
                            sendUnhandle(u);
                        }
                    for (Reply r : replyList) {
                        sendReply(r);
                    }
                    for (Fallback f : fallbackList) {
                        sendFallback(f);
                    }
                        for (int i = unhandleList.size() - 1; i >= 0; i--) {
                            unhandleList.remove(i);
                        }
                    for (int i = replyList.size() - 1; i >= 0; i--) {
                        replyList.remove(i);
                    }
                    for (int i = fallbackList.size() - 1; i >= 0; i--) {
                        fallbackList.remove(i);
                    }
                    }
                    goNeiWang();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void unhandle(String cookie){
        String url = getPageUrl("0", "0");
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
            Unhandle unhandle = getUnhandle(file_guid, order_guid, cookie);
            try {
                saveUnhandle(unhandle);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public Unhandle getUnhandle(String file_guid, String order_guid, String cookie){
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

    public void saveUnhandle(Unhandle unhandle) throws Exception {
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
//            sendUnhandle(unhandle, service2);
            unhandleList.add(unhandle);
        }
    }

    public void sendUnhandle(Unhandle unhandle) throws Exception {
        String token = getToken();
        String errcode = addUnhandle(token,
                unhandle.get("order_guid"),
                unhandle.get("order_code"),
                unhandle.get("link_person"),
                unhandle.get("link_phone"),
                unhandle.get("write_time"),
                unhandle.get("send_time"),
                unhandle.get("urgency_degree"),
                unhandle.get("is_secret"),
                unhandle.get("is_reply"),
                unhandle.get("end_date"),
                unhandle.get("problem_description"),
                unhandle.get("transfer_opinion"),
                unhandle.get("transfer_process"),
                unhandle.get("accept_channel"));
        if (errcode.equals("0")) {
            System.out.println("待办理工单已推送：" + unhandle.get("order_code") + "-" + unhandle.get("link_person"));
        } else {
            System.out.println("待办理工单推送失败：" + unhandle.get("order_code") + "-" + unhandle.get("link_person"));
        }

    }

    public void reply(String cookie){
        String url = getPageUrl("201", "1");
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
            Reply reply = getReply(file_guid, order_guid, cookie);
            try {
                saveReply(reply);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Reply getReply(String file_guid, String order_guid, String cookie){
        String url = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?fileGuid="+file_guid+"&GUID=" +order_guid+ "&IsZDDB=&xxlyid=1";
        Document doc = getDoc(url,cookie);
        Element tbody = doc.getElementsByClass("tablebgcolor").get(0).getElementsByTag("tbody").get(0);
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
        Element table = doc.getElementsByClass("tablebgcolor").get(1).getElementsByTag("tbody").get(0);
        String reply_type = table.getElementsByTag("tr").get(1).getElementsByTag("td").get(2).text();//答复类型
        String finish_time = table.getElementsByTag("tr").get(1).getElementsByTag("td").get(4).text();//预计完成时间
        String reply_satisfy = table.getElementsByTag("tr").get(2).getElementsByTag("td").get(1).text();//答复来电人情况
        String reply_day = table.getElementsByTag("tr").get(2).getElementsByTag("td").get(3).text();//答复时间
        String reply_person = table.getElementsByTag("tr").get(3).getElementsByTag("td").get(1).text();//答复人
        String reply_phone = table.getElementsByTag("tr").get(3).getElementsByTag("td").get(3).text();//答复电话
        String reply_content = table.getElementsByTag("tr").get(4).getElementsByTag("td").get(1).text();//办理情况
        String reply_department = table.getElementsByTag("tr").get(5).getElementsByTag("td").get(1).text();//回复单位
        String reply_time = table.getElementsByTag("tr").get(5).getElementsByTag("td").get(3).text();//回复时间
        String subordinate_department = table.getElementsByTag("tr").get(6).getElementsByTag("td").get(1).text();//下级办理单位
        String if_nodo = table.getElementsByTag("tr").get(7).getElementsByTag("td").get(1).text();//不再办理
        String nodo_reason = table.getElementsByTag("tr").get(8).getElementsByTag("td").get(1).text();//不再办理原因
        String reply_enclosure = table.getElementsByTag("tr").get(9).getElementsByTag("td").get(1).text().substring(0,0);//附件
        String reply_person2 = table.getElementsByTag("tr").get(10).getElementsByTag("td").get(1).text();//回复联系人
        String reply_phone2 = table.getElementsByTag("tr").get(10).getElementsByTag("td").get(3).text();//回复电话
        Reply reply = new Reply();
        reply.set("order_guid",order_guid)
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
                .set("remark",remark)
                .set("reply_type",reply_type)
                .set("finish_time",finish_time)
                .set("reply_satisfy",reply_satisfy)
                .set("reply_day",reply_day)
                .set("reply_person",reply_person)
                .set("reply_phone",reply_phone)
                .set("reply_content",reply_content)
                .set("reply_department",reply_department)
                .set("reply_time",reply_time)
                .set("subordinate_department",subordinate_department)
                .set("if_nodo",if_nodo)
                .set("nodo_reason",nodo_reason)
                .set("reply_enclosure",reply_enclosure)
                .set("reply_person2",reply_person2)
                .set("reply_phone2",reply_phone2);
        return reply;

    }

    public void saveReply(Reply reply) throws Exception {
        ReplyService service = new ReplyService();
        if (service.findNumByGUID(reply.get("order_guid"))==0){
            String order_guid = reply.get("order_guid");
            String order_code = reply.get("order_code");
            String link_person = reply.get("link_person");
            String send_time = reply.get("send_time");
            System.out.println("已回复工单：" + order_code + "-" + link_person + "-" + send_time);
            service.add(reply);
            replyList.add(reply);
//            sendReply(reply);
//            service.add(order_guid,order_state, order_code, link_person,link_phone,link_address,business_environment,new_supervision,accept_person,accept_person_code,accept_channel,handle_type,phone_type,write_time,urgency_degree, problem_classification,is_secret,is_reply,reply_remark,problem_description,send_person,send_time,end_date,transfer_opinion,transfer_process,remark,enclosure, reply_type, finish_time, reply_satisfy, reply_day, reply_person, reply_phone, reply_content, reply_department, reply_time, subordinate_department, if_nodo, nodo_reason, reply_enclosure, reply_person2, reply_phone2);
        }
    }

    public void sendReply (Reply reply) throws Exception{
        String token = getToken();
        String errcode = addReply(token,
                reply.get("order_guid"),
                reply.get("reply_time"),
                reply.get("reply_person"),
                reply.get("reply_content"));
        if (errcode.equals("0")) {
            System.out.println("已回复工单已推送：" + reply.get("order_code") + "-" + reply.get("link_person"));
        } else {
            System.out.println("已回复工单推送失败：" + reply.get("order_code") + "-" + reply.get("link_person"));
        }

    }

    public void fallback(String cookie){
        String url = getPageUrl("202", "1");
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
            Fallback fallback = getFallback(file_guid, order_guid, cookie);
            try {
                saveFallback(fallback);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Fallback getFallback(String file_guid, String order_guid, String cookie){
        String url = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?fileGuid="+file_guid+"&GUID=" +order_guid+ "&IsZDDB=&xxlyid=1";
        Document doc = getDoc(url,cookie);
        Element tbody = doc.getElementsByClass("tablebgcolor").get(0).getElementsByTag("tbody").get(0);
        Element td = tbody.getElementsByTag("tr").get(8).getElementsByTag("td").get(1);
        String enclosure = "";
        if (!td.text().trim().equals("")){
            enclosure = "请查看附件";
        }
        Element table = doc.getElementsByClass("tablebgcolor").get(1).getElementsByTag("tbody").get(0);
        String fallback_reason = table.getElementsByTag("tr").get(1).getElementsByTag("td").get(2).text();//回退原因
        String leader_opinions = table.getElementsByTag("tr").get(2).getElementsByTag("td").get(1).text();//领导意见
        String suggestion = table.getElementsByTag("tr").get(3).getElementsByTag("td").get(1).text();//建议
        String fallback_department = table.getElementsByTag("tr").get(4).getElementsByTag("td").get(1).text();//回退部门
        String fallback_time = table.getElementsByTag("tr").get(4).getElementsByTag("td").get(3).text();//回退时间
        String fallback_person = table.getElementsByTag("tr").get(6).getElementsByTag("td").get(1).text();//回退人
        String fallback_phone = table.getElementsByTag("tr").get(6).getElementsByTag("td").get(3).text();//回退联系电话
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
        Fallback fallback = new Fallback();
        fallback.set("order_guid",order_guid)
                .set("file_guid",file_guid)
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
                .set("remark",remark)
                .set("fallback_reason",fallback_reason)
                .set("leader_opinions",leader_opinions)
                .set("suggestion",suggestion)
                .set("fallback_department",fallback_department)
                .set("fallback_time",fallback_time)
                .set("fallback_person",fallback_person)
                .set("fallback_phone",fallback_phone);
        return fallback;

    }

    public void saveFallback(Fallback fallback) throws Exception{
        FallbackService service = new FallbackService();
        if (service.findNumByGUID(fallback.get("order_guid"))==0){
            String order_guid = fallback.get("order_guid");
            String order_code = fallback.get("order_code");
            String link_person = fallback.get("link_person");
            String send_time = fallback.get("send_time");
            System.out.println("已回退工单：" + order_code + "-" + link_person + "-" + send_time);
            service.add(fallback);
            fallbackList.add(fallback);
//            sendFallback(fallback);
//            service.add(order_guid,order_state, order_code, link_person,link_phone,link_address,business_environment,new_supervision,accept_person,accept_person_code,accept_channel,handle_type,phone_type,write_time,urgency_degree, problem_classification,is_secret,is_reply,reply_remark,problem_description,send_person,send_time,end_date,transfer_opinion,transfer_process,remark,enclosure,fallback_reason,leader_opinions,suggestion,fallback_department,fallback_time,fallback_person,fallback_phone);
        }
    }

    public void sendFallback (Fallback fallback) throws Exception{
        String token = getToken();
        String errcode = addFallback(token,
                fallback.get("order_guid"),
                fallback.get("fallback_time"),
                fallback.get("fallback_person"),
                fallback.get("fallback_reason"),
                fallback.get("suggestion"),
                fallback.get("fallback_department"));
        if (errcode.equals("0")) {
            System.out.println("已回退工单已推送：" + fallback.get("order_code") + "-" + fallback.get("link_person"));
        } else {
            System.out.println("已回退工单推送失败：" + fallback.get("order_code") + "-" + fallback.get("link_person"));
        }
    }

}
