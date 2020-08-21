package com.wts.controller;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.wts.util.wxUtil;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static com.wts.util.util12345.getDoc;
import static com.wts.util.util12345.getPageUrl;

public class MainController extends Controller {

    public void index() {
        renderText("服务正常");
    }

    public void f() throws IOException {
        String path = "d:\\fallback.txt";
        File file = new File(path);
        if(!file.exists()){
            file.getParentFile().mkdirs();
        }
        file.createNewFile();

        // write
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        List<Record> replyList = Db.find("SELECT order_guid,fallback_department,fallback_person,fallback_time,suggestion,fallback_reason FROM fallback");
        for (Record record : replyList) {
            String t = record.get("fallback_reason").toString().substring(0,1);
            String fallbackType;
            if (t.equals("A")){
                fallbackType = "其他劳动";
            } else if (t.equals("B")){
                fallbackType = "区住建局";
            } else if (t.equals("C")){
                fallbackType = "区社保办";
            } else if (t.equals("D")){
                fallbackType = "市人社局";
            } else if (t.equals("E")){
                fallbackType = "各街道办";
            } else {
                fallbackType = "其他部门";
            }
            String a = "{\"_id\":\"" + record.get("order_guid")
                    + "\",\"fallbackPerson\":\"" + record.get("fallback_person")
                    + "\",\"fallbackReason\":\"" + record.get("fallback_reason")
                    + "\",\"fallbackTime\":{\"$date\":\"" + wxUtil.getTimeStr(record.get("fallback_time"))
                    + "\"},\"suggestion\":\"" + record.get("suggestion")
                    + "\"},\"fallbackDepartment\":\"" + record.get("fallback_department")
                    + "\",\"fallbackType\":\"" + fallbackType
                    + "\"}\n";
            bw.write(a);

        }
        bw.flush();
        bw.close();
        fw.close();
        renderText("已回退工单已生成");
    }

    public void r() throws IOException {
        String path = "d:\\reply.txt";
        File file = new File(path);
        if(!file.exists()){
            file.getParentFile().mkdirs();
        }
        file.createNewFile();

        // write
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        List<Record> replyList = Db.find("SELECT order_guid,reply_content,reply_person,reply_time,reply_satisfy FROM reply");
        for (Record record : replyList) {
            String t = record.get("reply_content").toString().substring(0,1);
            String replyType;
            if (t.equals("A")){
                replyType = "劳动关系";
            } else if (t.equals("B")){
                replyType = "社会保险";
            } else if (t.equals("C")){
                replyType = "就业创业";
            } else if (t.equals("D")){
                replyType = "人事人才";
            } else {
                replyType = "其他";
            }
            String a = "{\"_id\":\"" + record.get("order_guid")
                    + "\",\"replyContent\":\"" + record.get("reply_content")
                    + "\",\"replyPerson\":\"" + record.get("reply_person")
                    + "\",\"replyTime\":{\"$date\":\"" + wxUtil.getTimeStr(record.get("reply_time"))
                    + "\"},\"replySatisfy\":\"" + record.get("reply_satisfy")
                    + "\",\"replyType\":\"" + replyType
                    + "\"}\n";
            bw.write(a);

        }
        bw.flush();
        bw.close();
        fw.close();
        renderText("已回复工单已生成");
    }

    public void u() throws IOException {
        String path = "d:\\unhandle.txt";
        File file = new File(path);
        if(!file.exists()){
            file.getParentFile().mkdirs();
        }
        file.createNewFile();

        // write
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        List<Record> unhandleList = Db.find("SELECT order_guid,order_code,link_person,link_phone,write_time,send_time,urgency_degree,is_secret," +
                "is_reply,end_date,problem_description,transfer_opinion,transfer_process,accept_channel FROM unhandle");
//        "is_reply,end_date,problem_description,transfer_opinion,transfer_process,accept_channel FROM allwork LIMIT 0,1000");
        for (Record unhandle : unhandleList) {
            String a = "{\"_id\":\"" + unhandle.get("order_guid")
                    + "\",\"HotLineWorkNumber\":\"" + unhandle.get("order_code")
                    + "\",\"linkPerson\":\"" + unhandle.get("link_person")
                    + "\",\"linkPhone\":\"" + unhandle.get("link_phone")
//                    + "\",\"writeTime\":{\"$date\":\"" + getTimeStr(unhandle.get("write_time"))
                    + "\",\"sendTime\":{\"$date\":\"" + wxUtil.getTimeStr(unhandle.get("send_time"))
                    + "\"},\"urgencyDegree\":\"" + unhandle.get("urgency_degree")
                    + "\",\"isSecret\":\"" + unhandle.get("is_secret")
                    + "\",\"isReply\":\"" + unhandle.get("is_reply")
                    + "\",\"endDate\":\"" + unhandle.get("end_date")
                    + "\",\"content\":\"" + wxUtil.getSubStr(unhandle.get("problem_description"))
                    + "\",\"remark\":\"" + wxUtil.getSubStr(unhandle.get("transfer_opinion"))
                    + "\",\"banliFlow\":\"" + wxUtil.getSubStr(unhandle.get("transfer_process"))
                    + "\",\"xxlyId\":\"" + unhandle.get("accept_channel")
                    + "\"}\n";
            bw.write(a);
        }
        bw.flush();
        bw.close();
        fw.close();
        renderText("未办理工单已生成！");
    }

}


