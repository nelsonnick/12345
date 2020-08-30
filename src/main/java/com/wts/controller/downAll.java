package com.wts.controller;

import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.jfinal.kit.PropKit;
import com.wts.entity.model.Fallback;
import com.wts.entity.model.Reply;
import com.wts.entity.model.Unhandle;
import com.wts.service.*;
import com.wts.util.util12345;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

import static com.wts.util.WordUtil.getUrgencyDegree;
import static com.wts.util.util12345.getDoc;

public class downAll extends Controller {

    @Inject
    UnhandleService unhandleService;
    @Inject
    ReplyService replyService;
    @Inject
    FallbackService fallbackService;

    public void index() {
        String cookie = PropKit.use("config-dev.txt").get("cookie");
        for (int i=1;i<20;i++){
            getPageInfo(i, cookie);
            System.out.println("第" + i + "页已完成");
        }
        renderText("已完成");
    }

    public void getPageInfo(Integer pageNum, String cookie) {
        Document doc = util12345.getPageInfo(pageNum + "", cookie, "-1");
        Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
        for (int i = 0; i < trs.size() - 1; i++) {
            Element in = trs.get(i).getElementsByTag("td").get(0).getElementsByTag("input").get(0);
            String value = in.attr("value");
            String file_guid = "";
            String order_guid = "";
            if (value.length() > 80) {
                if (value.substring(9, 10).equals("{")) {
                    file_guid = value.substring(9, 47);
                    order_guid = value.substring(53, 91);
                } else {
                    file_guid = value.substring(8, 46);
                    order_guid = value.substring(51, 89);
                }
            } else {
                order_guid = value.substring(5, 43);
            }
            save(file_guid, order_guid, cookie);
        }
    }

    public void save(String file_guid, String order_guid, String cookie) {
        String url = "";
        if (file_guid.equals("")){
            url = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?GUID=" + order_guid + "&issend=1&IsZDDB=";
        }else{
            url = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?fileGuid=" + file_guid + "&GUID=" + order_guid + "&IsZDDB=&xxlyid=1";
        }
        Document doc = getDoc(url, cookie);
        System.out.println(url);
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

        if(!unhandleService.has(order_guid)) {
            Unhandle unhandle = new Unhandle();
            unhandle.set("file_guid", file_guid)
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
            unhandleService.add(unhandle);
            System.out.println(order_guid + "---已完成！");
        }else{
            System.out.println(order_guid + "---已存在！");
        }

        List<String> errorList = new ArrayList<>();
        errorList.add("{a846085e-ea93-480f-a23f-a6fcf7221140}");

        errorList.add("{85639357-db7e-4371-85da-3e41f72f43b0}");
        errorList.add("{63f624b7-a007-4a62-9141-3dbd7a48081d}");
        errorList.add("{d0e0c75d-0c99-4dc0-b99c-83f52a085c71}");
        errorList.add("{a55ca4f8-f937-4c5c-8e45-45346d5438e6}");
        errorList.add("{d6d2565b-f8eb-4043-af30-fd9204688011}");
        errorList.add("{3161b5e0-3f4d-4523-b557-e3baaf1b4e0e}");
        errorList.add("{e915c103-45f7-4d59-8664-9c6355b055b9}");
        errorList.add("{770ca00c-8afb-43bb-8bd7-4aacc01bd64b}");
        errorList.add("{9e7fe9d3-364b-4594-a9c9-c023406056f4}");
        errorList.add("{bdd04e23-b3f0-4660-81dc-f64dcbcebefe}");
        errorList.add("{389e9ab8-f949-4ddb-882a-f3f02f4e8bed}");
        if (doc.getElementsByClass("tablebgcolor").size()!=1 && !errorList.contains(order_guid)){
            Element table = doc.getElementsByClass("tablebgcolor").last().getElementsByTag("tbody").get(0);
            if (order_state.equals("已回退")){
                String fallback_reason = table.getElementsByTag("tr").get(1).getElementsByTag("td").get(2).text();//回退理由
                String leader_opinions = table.getElementsByTag("tr").get(2).getElementsByTag("td").get(1).text();//领导意见
                String suggestion = table.getElementsByTag("tr").get(3).getElementsByTag("td").get(1).text();//建议
                String fallback_department = table.getElementsByTag("tr").get(4).getElementsByTag("td").get(1).text();//回退部门
                String fallback_time = table.getElementsByTag("tr").get(4).getElementsByTag("td").get(3).text();//回退时间
                String fallback_person = table.getElementsByTag("tr").get(6).getElementsByTag("td").get(1).text();//回退人
                String fallback_phone = table.getElementsByTag("tr").get(6).getElementsByTag("td").get(3).text();//回退联系电话
                if(!fallbackService.has(order_guid)) {
                    Fallback fallback = new Fallback();
                    fallback.set("order_guid", order_guid)
                            .set("file_guid", file_guid)
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
                            .set("remark", remark)
                            .set("fallback_reason", fallback_reason)
                            .set("leader_opinions", leader_opinions)
                            .set("suggestion", suggestion)
                            .set("fallback_department", fallback_department)
                            .set("fallback_time", fallback_time)
                            .set("fallback_person", fallback_person)
                            .set("fallback_phone", fallback_phone);
                    fallbackService.add(fallback);
                }
            }

            if (order_state.equals("已回复")){
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
                if(!replyService.has(order_guid)) {
                    Reply reply = new Reply();
                    reply.set("order_guid", order_guid)
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
                            .set("remark", remark)
                            .set("reply_type", reply_type)
                            .set("finish_time", finish_time)
                            .set("reply_satisfy", reply_satisfy)
                            .set("reply_day", reply_day)
                            .set("reply_person", reply_person)
                            .set("reply_phone", reply_phone)
                            .set("reply_content", reply_content)
                            .set("reply_department", reply_department)
                            .set("reply_time", reply_time)
                            .set("subordinate_department", subordinate_department)
                            .set("if_nodo", if_nodo)
                            .set("nodo_reason", nodo_reason)
                            .set("reply_enclosure", reply_enclosure)
                            .set("reply_person2", reply_person2)
                            .set("reply_phone2", reply_phone2);
                    replyService.add(reply);
                }
            }

        }


    }

    public void s(){
        List<String> errorList = new ArrayList<>();

        errorList.add("{85639357-db7e-4371-85da-3e41f72f43b0}");//h---shao
        errorList.add("{63f624b7-a007-4a62-9141-3dbd7a48081d}");//t
        errorList.add("{d0e0c75d-0c99-4dc0-b99c-83f52a085c71}");//t
        errorList.add("{a55ca4f8-f937-4c5c-8e45-45346d5438e6}");//t

        errorList.add("{d6d2565b-f8eb-4043-af30-fd9204688011}");//h
        errorList.add("{3161b5e0-3f4d-4523-b557-e3baaf1b4e0e}");//h
        errorList.add("{e915c103-45f7-4d59-8664-9c6355b055b9}");//h
        errorList.add("{770ca00c-8afb-43bb-8bd7-4aacc01bd64b}");//h
        errorList.add("{9e7fe9d3-364b-4594-a9c9-c023406056f4}");//h
        errorList.add("{bdd04e23-b3f0-4660-81dc-f64dcbcebefe}");//h
        errorList.add("{389e9ab8-f949-4ddb-882a-f3f02f4e8bed}");//h

        String cookie = PropKit.use("config-dev.txt").get("cookie");
        String order_guid = "{85639357-db7e-4371-85da-3e41f72f43b0}";
        String url = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?GUID=" + order_guid + "&issend=1&IsZDDB=";
        Document doc = getDoc(url, cookie);
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

        Element table = doc.getElementsByClass("tablebgcolor").last().getElementsByTag("tbody").get(0);
        String info = table.getElementsByTag("tr").get(1).getElementsByTag("td").get(0).text();
        if (info.equals("回复信息")){
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
            if(!replyService.has(order_guid)) {
                Reply reply = new Reply();
                reply.set("order_guid", order_guid)
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
                        .set("remark", remark)
                        .set("reply_type", reply_type)
                        .set("finish_time", finish_time)
                        .set("reply_satisfy", reply_satisfy)
                        .set("reply_day", reply_day)
                        .set("reply_person", reply_person)
                        .set("reply_phone", reply_phone)
                        .set("reply_content", reply_content)
                        .set("reply_department", reply_department)
                        .set("reply_time", reply_time)
                        .set("subordinate_department", subordinate_department)
                        .set("if_nodo", if_nodo)
                        .set("nodo_reason", nodo_reason)
                        .set("reply_enclosure", reply_enclosure)
                        .set("reply_person2", reply_person2)
                        .set("reply_phone2", reply_phone2);
                replyService.add(reply);
            }
        }

        if(info.equals("部门回退")){
            String fallback_reason = table.getElementsByTag("tr").get(1).getElementsByTag("td").get(2).text();//回退理由
            String leader_opinions = table.getElementsByTag("tr").get(2).getElementsByTag("td").get(1).text();//领导意见
            String suggestion = table.getElementsByTag("tr").get(3).getElementsByTag("td").get(1).text();//建议
            String fallback_department = table.getElementsByTag("tr").get(4).getElementsByTag("td").get(1).text();//回退部门
            String fallback_time = table.getElementsByTag("tr").get(4).getElementsByTag("td").get(3).text();//回退时间
            String fallback_person = table.getElementsByTag("tr").get(6).getElementsByTag("td").get(1).text();//回退人
            String fallback_phone = table.getElementsByTag("tr").get(6).getElementsByTag("td").get(3).text();//回退联系电话
            if(!fallbackService.has(order_guid)) {
                Fallback fallback = new Fallback();
                fallback.set("order_guid", order_guid)
                        .set("file_guid", "")
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
                        .set("remark", remark)
                        .set("fallback_reason", fallback_reason)
                        .set("leader_opinions", leader_opinions)
                        .set("suggestion", suggestion)
                        .set("fallback_department", fallback_department)
                        .set("fallback_time", fallback_time)
                        .set("fallback_person", fallback_person)
                        .set("fallback_phone", fallback_phone);
                fallbackService.add(fallback);
            }
        }

        System.out.println(info);
        renderText("11111");
    }
}
