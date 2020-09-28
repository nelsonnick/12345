package com.wts.util;

import com.jfinal.kit.PropKit;
import com.wts.entity.model.Allwork;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;

import static com.wts.util.WordUtil.getUrgencyDegree;
import static com.wts.util.printUtil.printSingleColor;

public class testUtil {
    public static Allwork getAllwork() {
        String url = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?GUID={9ed36b55-30dc-45c9-aafa-2c05ecb03f69}&IsZDDB=&xxlyid=1";
        try {
            Document doc = Jsoup.parse(new File("D:\\a.html"), "utf-8");
            if (doc == null) {
                printSingleColor(31, 3, "获取的Allwork工单为空-->" + url);
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
            allwork.set("order_guid", "")
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
            printSingleColor(31, 3, "解析Allwork工单错误-->" + url);
            return null;
        }
    }



    public static void sendAllwork(Allwork allwork) {
        String OA_token = oaUtil.getToken();
        if (!OA_token.equals("")) {
            String run_id = oaUtil.getRun_id(OA_token);
            if (!run_id.equals("")) {
                String OA_content = oaUtil.getContent(run_id, allwork.get("order_code"), allwork.get("link_person"), allwork.get("end_date"), allwork.get("urgency_degree"), allwork.get("link_phone"),
                        allwork.get("problem_description"), allwork.get("transfer_opinion"), allwork.get("transfer_process"), "XXX");
                if (!OA_content.equals("")) {
                    oaUtil.inputOA(OA_token, OA_content);
                }
            }

        }

    }

    public static void main(String[] args) throws Exception{
        Allwork allwork = getAllwork();
        sendAllwork(allwork);
    }

}
