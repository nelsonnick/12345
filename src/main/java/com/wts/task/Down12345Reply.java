package com.wts.task;

import com.jfinal.kit.PropKit;
import com.wts.entity.model.Reply;
import com.wts.service.ReplyService;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import static com.wts.util.WordUtil.getUrgencyDegree;
import static com.wts.util.util12345.getDoc;
import static com.wts.util.util12345.getPageUrl;

public class Down12345Reply implements Runnable{

    @Override
    public void run() {
        String url = getPageUrl("201", "1");
        String cookie = PropKit.use("config-dev.txt").get("cookie");
        Document doc = getDoc(url,cookie);
        Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
        for (int i = 0; i < trs.size() - 1; i++) {
            Element in = trs.get(i).getElementsByTag("td").get(0).getElementsByTag("input").get(0);
            String value = in.attr("value");
            String order_guid = value.substring(5, 43);
            Reply reply = get(order_guid, cookie);
            try {
                save(reply);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public Reply get(String order_guid, String cookie){
        String url = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?GUID=" +order_guid+ "&IsZDDB=&";
        Document doc = getDoc(url,cookie);
        Element tbody = doc.getElementsByClass("tablebgcolor").get(0).getElementsByTag("tbody").get(0);
        Element td = tbody.getElementsByTag("tr").get(8).getElementsByTag("td").get(1);
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
        String reply_enclosure = table.getElementsByTag("tr").get(9).getElementsByTag("td").get(1).text();//附件
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

    public void save(Reply reply){
        ReplyService service = new ReplyService();
        if (service.findNumByGUID(reply.get("order_guid"))==0){
            String order_guid = reply.get("order_guid");
            String order_code = reply.get("order_code");
            String link_person = reply.get("link_person");
            String send_time = reply.get("send_time");
            System.out.println("已回复工单：" + order_code + "-" + link_person + "-" + send_time);
            service.add(reply);
//            service.add(order_guid,order_state, order_code, link_person,link_phone,link_address,business_environment,new_supervision,accept_person,accept_person_code,accept_channel,handle_type,phone_type,write_time,urgency_degree, problem_classification,is_secret,is_reply,reply_remark,problem_description,send_person,send_time,end_date,transfer_opinion,transfer_process,remark,enclosure, reply_type, finish_time, reply_satisfy, reply_day, reply_person, reply_phone, reply_content, reply_department, reply_time, subordinate_department, if_nodo, nodo_reason, reply_enclosure, reply_person2, reply_phone2);
        }
    }

}
