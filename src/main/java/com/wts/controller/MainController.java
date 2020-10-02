package com.wts.controller;

import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.wts.entity.model.Unhandle;
import com.wts.service.UnhandleService;
import com.wts.util.util12345;
import com.wts.util.wxUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static com.wts.util.WordUtil.getUrgencyDegree;
import static com.wts.util.printUtil.printSingleColor;
import static com.wts.util.util12345.*;

public class MainController extends Controller {
    @Inject
    UnhandleService unhandleService;

    public void index() {
        renderText("服务正常");
    }

    public void getFallback() throws IOException {
        String path = "d:\\fallback.txt";
        File file = new File(path);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        file.createNewFile();

        // write
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        List<Record> replyList = Db.find("SELECT order_guid,fallback_department,fallback_person,fallback_time,suggestion,fallback_reason,order_code,link_person FROM fallback");
        for (Record record : replyList) {
            String t = record.get("fallback_reason").toString().substring(0, 1);
            String fallbackType;
            if (t.equals("A")) {
                fallbackType = "其他劳动";
            } else if (t.equals("B")) {
                fallbackType = "区住建局";
            } else if (t.equals("C")) {
                fallbackType = "区社保办";
            } else if (t.equals("D")) {
                fallbackType = "市人社局";
            } else if (t.equals("E")) {
                fallbackType = "各街道办";
            } else {
                fallbackType = "其他部门";
            }
            String fallbackTime;
            if (record.get("fallback_time").toString().equals("")) {
                fallbackTime = wxUtil.getTimeStr("2000/1/1 00:00:00");
            } else {
                System.out.println();
                fallbackTime = wxUtil.getTimeStr(record.get("fallback_time"));
            }
            String a = "{\"_id\":\"" + record.get("order_guid")
                    + "\",\"HotLineWorkNumber\":\"" + record.get("order_code")
                    + "\",\"linkPerson\":\"" + record.get("link_person")
                    + "\",\"fallbackPerson\":\"" + record.get("fallback_person")
                    + "\",\"fallbackReason\":\"" + record.get("fallback_reason").toString().replace("\"", "")
                    + "\",\"fallbackTime\":{\"$date\":\"" + fallbackTime
                    + "\"},\"suggestion\":\"" + record.get("suggestion").toString().replace("\"", "")
                    + "\",\"fallbackDepartment\":\"" + record.get("fallback_department")
                    + "\",\"fallbackType\":\"" + fallbackType
                    + "\"}\n";
            bw.write(a);

        }
        bw.flush();
        bw.close();
        fw.close();
        System.out.println("已回退工单已生成！");
    }

    public void getReply() throws IOException {
        String path = "d:\\reply.txt";
        File file = new File(path);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        file.createNewFile();

        // write    {a20ff39a-0d0a-4bfb-bb8b-682cceef64c6}
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        List<Record> replyList = Db.find("SELECT order_guid,reply_content,reply_person,reply_time,reply_satisfy,order_code,link_person FROM reply");
        for (Record record : replyList) {
            String t = record.get("reply_content").toString().substring(0, 1);
            String replyType;
            if (t.equals("A")) {
                replyType = "劳动关系";
            } else if (t.equals("B")) {
                replyType = "社会保险";
            } else if (t.equals("C")) {
                replyType = "就业创业";
            } else if (t.equals("D")) {
                replyType = "人事人才";
            } else {
                replyType = "其他";
            }
            String replyTime;
            if (record.get("reply_time").toString().equals("")) {
                replyTime = wxUtil.getTimeStr("2000/1/1 00:00:00");
            } else {
                replyTime = wxUtil.getTimeStr(record.get("reply_time"));
            }
            String a = "{\"_id\":\"" + record.get("order_guid")
                    + "\",\"HotLineWorkNumber\":\"" + record.get("order_code")
                    + "\",\"linkPerson\":\"" + record.get("link_person")
                    + "\",\"replyContent\":\"" + record.get("reply_content").toString().replace("\"", "")
                    + "\",\"replyPerson\":\"" + record.get("reply_person")
                    + "\",\"replyTime\":{\"$date\":\"" + replyTime
                    + "\"},\"replySatisfy\":\"" + record.get("reply_satisfy")
                    + "\",\"replyType\":\"" + replyType
                    + "\"}\n";
            bw.write(a);
        }
        bw.flush();
        bw.close();
        fw.close();
        System.out.println("已回复工单已生成！");
    }

    public void getAllwork() throws IOException {
        String path = "d:\\allwork.txt";
        File file = new File(path);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        file.createNewFile();

        // write
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        List<Record> allworkList = Db.find("SELECT order_guid,order_code,link_person,link_phone,write_time,send_time,urgency_degree,is_secret," +
                "is_reply,end_date,problem_description,transfer_opinion,transfer_process,accept_channel FROM allwork");
//        LIMIT 0,3
        for (Record allwork : allworkList) {
            String a = "{\"_id\":\"" + allwork.get("order_guid")
                    + "\",\"HotLineWorkNumber\":\"" + allwork.get("order_code")
                    + "\",\"linkPerson\":\"" + allwork.get("link_person")
                    + "\",\"linkPhone\":\"" + allwork.get("link_phone")
//                    + "\",\"writeTime\":{\"$date\":\"" + getTimeStr(allwork.get("write_time"))
                    + "\",\"sendTime\":{\"$date\":\"" + wxUtil.getTimeStr(allwork.get("send_time"))
                    + "\"},\"urgencyDegree\":\"" + allwork.get("urgency_degree")
                    + "\",\"isSecret\":\"" + allwork.get("is_secret")
                    + "\",\"isReply\":\"" + allwork.get("is_reply")
                    + "\",\"endDate\":\"" + allwork.get("end_date")
                    + "\",\"content\":\"" + wxUtil.getSubStr(allwork.get("problem_description"))
                    + "\",\"remark\":\"" + wxUtil.getSubStr(allwork.get("transfer_opinion"))
                    + "\",\"banliFlow\":\"" + wxUtil.getSubStr(allwork.get("transfer_process"))
                    + "\",\"xxlyId\":\"" + allwork.get("accept_channel")
                    + "\"}\n";
            bw.write(a);
        }
        bw.flush();
        bw.close();
        fw.close();
        System.out.println("全部工单已生成！");
    }

    // 数据来源：到期工单的第一页
    public void getExpire() throws Exception {
        String path = "d:\\expire.txt";
        File file = new File(path);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        file.createNewFile();
        // write
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        String cookie = PropKit.use("config-dev.txt").get("cookie");
        String url = getPageUrl("11", "X");
        Document doc = util12345.getDoc(url, cookie);
        Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
        for (int i = 0; i < trs.size() - 1; i++) {
            Element in = trs.get(i).getElementsByTag("td").get(0).getElementsByTag("input").get(0);
            String value = in.attr("value");
            String file_guid = "";
            String order_guid = "";
            if (value.substring(9, 10).equals("{")) {
                file_guid = value.substring(9, 47);
                order_guid = value.substring(53, 91);
            } else {
                file_guid = value.substring(8, 46);
                order_guid = value.substring(51, 89);
            }
            String url2 = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?fileGuid=" + file_guid + "&GUID=" + order_guid + "&IsZDDB=&xxlyid=1";
            Document doc2 = util12345.getDoc(url2, cookie);
            Element tbody = doc2.getElementsByClass("tablebgcolor").get(0).getElementsByTag("tbody").get(0);
            String order_code = tbody.getElementById("HotLineWorkNumber").text();//工单编号
            String link_person = tbody.getElementById("linkPerson").text();//联系人
            String end_date = tbody.getElementById("endDate").text();//办理时限
            String a = "{\"_id\":\"" + order_guid
                    + "\",\"HotLineWorkNumber\":\"" + order_code
                    + "\",\"linkPerson\":\"" + link_person
                    + "\",\"endDate\":\"" + end_date
                    + "\"}\n";
            bw.write(a);
        }
        bw.flush();
        bw.close();
        fw.close();
        renderText("到期工单已生成！");
    }

    public void getUnhandle() throws Exception {
        Db.update("truncate table unhandle");
        String cookie = PropKit.use("config-dev.txt").get("cookie");
        getDoc(getPageUrl("0", "0"), cookie);
        for (int i = 1; i < 6; i++) {
            getUnhandlePageInfo(i, cookie);
            printSingleColor(32, 3, "第" + i + "页已完成");
        }
        printSingleColor(32, 3, "未办理工单下载完成！");

        String path = "d:\\unhandle.txt";
        File file = new File(path);
        if(!file.exists()){
            file.getParentFile().mkdirs();
        }
        file.createNewFile();
        // write
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        List<Record> UnhandleList = Db.find("SELECT order_guid,order_code,link_person,end_date FROM unhandle");
        for (Record record : UnhandleList) {
            String a = "{\"_id\":\"" + record.get("order_guid")
                    + "\",\"HotLineWorkNumber\":\"" + record.get("order_code")
                    + "\",\"linkPerson\":\"" + record.get("link_person")
                    + "\",\"endDate\":\"" + record.get("end_date")
                    + "\"}\n";
            bw.write(a);
        }
        bw.flush();
        bw.close();
        fw.close();
        System.out.println("未办理工单已生成！");
    }

    public void getUnhandlePageInfo(Integer pageNum, String cookie) {
        try {
            Document doc = getDocOther(getPageUrl(pageNum + ""), cookie);
            Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
            for (int i = 0; i < trs.size() - 1; i++) {
                Element in = trs.get(i).getElementsByTag("td").get(0).getElementsByTag("input").get(0);
                String value = in.attr("value");
                String file_guid, order_guid;
                if (value.length() > 80) {
                    if (String.valueOf(value.charAt(9)).equals("{")) {
                        file_guid = value.substring(9, 47);
                        order_guid = value.substring(53, 91);
                    } else {
                        file_guid = value.substring(8, 46);
                        order_guid = value.substring(51, 89);
                    }
                } else {
                    file_guid = "";
                    order_guid = value.substring(5, 43);
                }
                saveUnhandle(file_guid, order_guid, cookie);
            }
        } catch (Exception e) {
            printSingleColor(31, 3, "页面信息获取失败，错误页码-->" + pageNum);
        }
    }

    public void saveUnhandle(String file_guid, String order_guid, String cookie) {
        String url;
        if (file_guid.equals("")) {
            url = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?GUID=" + order_guid + "&issend=1&IsZDDB=";
        } else {
            url = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?fileGuid=" + file_guid + "&GUID=" + order_guid + "&IsZDDB=&xxlyid=1";
        }
        try {
            Document doc = util12345.getDoc(url, cookie);
            printSingleColor(35, 3, "当前url-->" + url);
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
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void getAll() throws Exception{
        getFallback();
        getReply();
        getAllwork();
        getUnhandle();
    }

}


