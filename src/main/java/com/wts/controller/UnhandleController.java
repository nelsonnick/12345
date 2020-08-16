package com.wts.controller;

import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.wts.entity.model.Unhandle;
import com.wts.service.AllworkService;
import com.wts.service.UnhandleService;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.wts.util.wxUtil.addUnhandle;
import static com.wts.util.wxUtil.getToken;

public class UnhandleController extends Controller {

    @Inject
    UnhandleService service;

    public void index() throws IOException {
        String path = "d:\\test3.txt";
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
                    + "\",\"writeTime\":{\"$date\":\"" + getTimeStr(unhandle.get("write_time"))
                    + "\"},\"sendTime\":{\"$date\":\"" + getTimeStr(unhandle.get("send_time"))
                    + "\"},\"urgencyDegree\":\"" + unhandle.get("urgency_degree")
                    + "\",\"isSecret\":\"" + unhandle.get("is_secret")
                    + "\",\"isReply\":\"" + unhandle.get("is_reply")
                    + "\",\"endDate\":\"" + unhandle.get("end_date")
                    + "\",\"content\":\"" + getSubStr(unhandle.get("problem_description"))
                    + "\",\"remark\":\"" + getSubStr(unhandle.get("transfer_opinion"))
                    + "\",\"banliFlow\":\"" + getSubStr(unhandle.get("transfer_process"))
                    + "\",\"xxlyId\":\"" + unhandle.get("accept_channel")
                    + "\"}\n";
            bw.write(a);
        }
        bw.flush();
        bw.close();
        fw.close();
        renderText("未办理工单");
    }

    public void get() {
        Unhandle entity = service.findByGUID(getPara("GUID"));
        setSessionAttr("entity", entity);
        render("/detail.html");
    }

    public void saveToWeixin() throws Exception {
        String token = getToken();
        List<Record> unhandleList = Db.find("SELECT order_guid,order_code,link_person,link_phone,write_time,send_time,urgency_degree,is_secret," +
                "is_reply,end_date,problem_description,transfer_opinion,transfer_process,accept_channel FROM unhandle");
//		List<Unhandle> unhandleList = service.findAll();
        for (Record unhandle : unhandleList) {
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
        renderText("已完成");
    }

    public static String getSubStr(String str){
        if(str.length()<500){
            return str.replace("\n","").replace("\r","").replace("\t","").replace("\"","").replace("\\","");
        }else{
            return str.substring(0, 499).replace("\n","").replace("\r","").replace("\t","").replace("\"","").replace("\\","");
        }
    }


    public static String getTimeStr(String str){
        return str.replace(" ","T")
                .replace("/1/", "-01-")
                .replace("/2/", "-02-")
                .replace("/3/", "-03-")
                .replace("/4/", "-04-")
                .replace("/5/", "-05-")
                .replace("/6/", "-06-")
                .replace("/7/", "-07-")
                .replace("/8/", "-08-")
                .replace("/9/", "-09-")
                .replace("-1T", "-01T")
                .replace("-2T", "-02T")
                .replace("-3T", "-03T")
                .replace("-4T", "-04T")
                .replace("-5T", "-05T")
                .replace("-6T", "-06T")
                .replace("-7T", "-07T")
                .replace("-8T", "-08T")
                .replace("-9T", "-09T")
                + ".882Z";
    }
}


