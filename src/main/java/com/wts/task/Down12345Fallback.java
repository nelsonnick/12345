package com.wts.task;

import com.jfinal.kit.PropKit;
import com.wts.entity.model.Fallback;
import com.wts.service.FallbackService;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static com.wts.util.WordUtil.*;
import static com.wts.util.util12345.getDoc;
import static com.wts.util.util12345.getListUrl;

public class Down12345Fallback implements Runnable{

    @Override
    public void run() {
        String url = getListUrl("202", "1");
        String cookie = PropKit.use("config-dev.txt").get("cookie");
        Document doc = getDoc(url,cookie);
        Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
        for (int i = 0; i < trs.size() - 1; i++) {
            Element in = trs.get(i).getElementsByTag("td").get(0).getElementsByTag("input").get(0);
            String value = in.attr("value");
            String order_guid = value.substring(5, 43);
            Fallback fallback = get(order_guid, cookie);
            try {
                save(fallback);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Fallback get(String order_guid, String cookie){
        String url = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?GUID=" +order_guid+ "&IsZDDB=&";
        Document doc = getDoc(url,cookie);
        Element tbody = doc.getElementsByClass("tablebgcolor").get(0).getElementsByTag("tbody").get(0);
        Element td = tbody.getElementsByTag("tr").get(8).getElementsByTag("td").get(1);
        String enclosure = "";
        if (!td.text().equals("")){
            enclosure = "请查看附件";
        }
        Element table = doc.getElementsByClass("tablebgcolor").get(1).getElementsByTag("tbody").get(0);
        String fallback_reason = table.getElementsByTag("tr").get(1).getElementsByTag("td").get(2).text();//回退原因
        String leader_opinions = table.getElementsByTag("tr").get(2).getElementsByTag("td").get(1).text();//领导意见
        String suggestion = table.getElementsByTag("tr").get(3).getElementsByTag("td").get(1).text();//建议
        String fallback_department = table.getElementsByTag("tr").get(4).getElementsByTag("td").get(1).text();//回退部门
        String fallback_time = table.getElementsByTag("tr").get(4).getElementsByTag("td").get(3).text();//回退时间
        String fallback_person = table.getElementsByTag("tr").get(5).getElementsByTag("td").get(1).text();//回退人
        String fallback_phone = table.getElementsByTag("tr").get(5).getElementsByTag("td").get(3).text();//回退联系电话
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
        Fallback fallback = new Fallback();
        fallback.set("order_guid",order_guid)
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

    public void save(Fallback fallback){
        String order_guid = fallback.get("order_guid");
        String order_state = fallback.get("order_state");
        String order_code = fallback.get("order_code");
        String link_person = fallback.get("link_person");
        String link_phone = fallback.get("link_phone");
        String link_address = fallback.get("link_address");
        String business_environment = fallback.get("business_environment");
        String new_supervision = fallback.get("new_supervision");
        String accept_person = fallback.get("accept_person");
        String accept_person_code = fallback.get("accept_person_code");
        String accept_channel = fallback.get("accept_channel");
        String handle_type = fallback.get("handle_type");
        String phone_type = fallback.get("phone_type");
        String write_time = fallback.get("write_time");
        String urgency_degree = fallback.get("urgency_degree");
        String problem_classification = fallback.get("problem_classification");
        String is_secret = fallback.get("is_secret");
        String is_reply = fallback.get("is_reply");
        String reply_remark = fallback.get("reply_remark");
        String problem_description = fallback.get("problem_description");
        String send_person = fallback.get("send_person");
        String send_time = fallback.get("send_time");
        String end_date = fallback.get("end_date");
        String transfer_opinion = fallback.get("transfer_opinion");
        String transfer_process = fallback.get("transfer_process");
        String remark = fallback.get("remark");
        String enclosure = fallback.get("enclosure");
        String fallback_reason = fallback.get("fallback_reason");
        String leader_opinions = fallback.get("leader_opinions");
        String suggestion = fallback.get("suggestion");
        String fallback_department = fallback.get("fallback_department");
        String fallback_time = fallback.get("fallback_time");
        String fallback_person = fallback.get("fallback_person");
        String fallback_phone = fallback.get("fallback_phone");
        System.out.println("已回退工单：" + order_code + "-" + link_person + "-" + send_time);
        FallbackService service = new FallbackService();
        if (service.findNumByGUID(order_guid)==0){
            service.add(fallback);
//            service.add(order_guid,order_state, order_code, link_person,link_phone,link_address,business_environment,new_supervision,accept_person,accept_person_code,accept_channel,handle_type,phone_type,write_time,urgency_degree, problem_classification,is_secret,is_reply,reply_remark,problem_description,send_person,send_time,end_date,transfer_opinion,transfer_process,remark,enclosure,fallback_reason,leader_opinions,suggestion,fallback_department,fallback_time,fallback_person,fallback_phone);
        }
    }


}
