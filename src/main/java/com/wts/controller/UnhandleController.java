package com.wts.controller;

import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.wts.entity.model.Unhandle;
import com.wts.service.AllworkService;
import com.wts.service.UnhandleService;

import java.util.ArrayList;
import java.util.List;

import static com.wts.util.wxUtil.addUnhandle;
import static com.wts.util.wxUtil.getToken;

public class UnhandleController extends Controller {

    @Inject
    UnhandleService service;

    public void index() {
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

}


