package com.wts.task;

import com.wts.entity.model.Statistic;
import com.wts.util.ParamesAPI;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.cp.api.impl.WxCpServiceImpl;
import me.chanjar.weixin.cp.bean.WxCpMessage;
import me.chanjar.weixin.cp.config.impl.WxCpDefaultConfigImpl;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;

public class Send12345Statistic implements Runnable{

    @Override
    public void run() {
        WxCpDefaultConfigImpl config = new WxCpDefaultConfigImpl();
        config.setCorpId(ParamesAPI.corpId);      // 设置微信企业号的appid
        config.setCorpSecret(ParamesAPI.secret);  // 设置微信企业号的app corpSecret
        config.setAgentId(1000002);     // 设置微信企业号应用ID
        config.setToken("...");       // 设置微信企业号应用的token
        config.setAesKey("...");      // 设置微信企业号应用的EncodingAESKey

        WxCpServiceImpl wxCpService = new WxCpServiceImpl();
        wxCpService.setWxCpConfigStorage(config);
        WxCpMessage message = WxCpMessage
                .TEXT()
                .agentId(1000002)
                //.toUser("@all")
                .toUser("WangTianShuo")
                .content("Hello World")
                .build();
        try {
            wxCpService.messageSend(message);
        } catch (WxErrorException e) {
            e.printStackTrace();
        }


    }

    public void save(String filePath){
        try {
            FileInputStream in = new FileInputStream(filePath);
            XWPFDocument xwpf = new XWPFDocument(in);
            Iterator<XWPFTable> it = xwpf.getTablesIterator();
            XWPFTable table = it.next();
            List<XWPFTableRow> rows=table.getRows();
            String accept_person_code = rows.get(0).getTableCells().get(1).getText();
            String end_date = rows.get(0).getTableCells().get(3).getText();
            String order_code = rows.get(1).getTableCells().get(1).getText();
            String urgency_degree = rows.get(1).getTableCells().get(3).getText();
            String phone_type = rows.get(2).getTableCells().get(1).getText();
            String accept_channel = rows.get(2).getTableCells().get(3).getText();
            String is_reply = rows.get(3).getTableCells().get(1).getText();
            String is_secret = rows.get(3).getTableCells().get(3).getText();
            String link_person = rows.get(4).getTableCells().get(1).getText();
            String link_phone = rows.get(4).getTableCells().get(3).getText();
            String link_address = rows.get(5).getTableCells().get(1).getText();
            String reply_remark = rows.get(6).getTableCells().get(1).getText();
            String problem_classification = rows.get(7).getTableCells().get(1).getText();
            String problem_description = rows.get(8).getTableCells().get(1).getText();
            String transfer_opinion = rows.get(9).getTableCells().get(1).getText();
            String transfer_process = rows.get(10).getTableCells().get(1).getText();
            String enclosure = rows.get(11).getTableCells().get(1).getText();
            String type = rows.get(12).getTableCells().get(1).getText();
            String department = rows.get(12).getTableCells().get(3).getText();
            String order_guid = rows.get(13).getTableCells().get(0).getText();
            String keywords = rows.get(13).getTableCells().get(1).getText();
            Statistic statistic = new Statistic();
            statistic.set("accept_person_code",accept_person_code)
                    .set("end_date",end_date)
                    .set("order_code",order_code)
                    .set("urgency_degree",urgency_degree)
                    .set("phone_type",phone_type)
                    .set("accept_channel",accept_channel)
                    .set("is_reply",is_reply)
                    .set("is_secret",is_secret)
                    .set("link_person",link_person)
                    .set("link_phone",link_phone)
                    .set("link_address",link_address)
                    .set("reply_remark",reply_remark)
                    .set("problem_classification",problem_classification)
                    .set("problem_description",problem_description)
                    .set("transfer_opinion",transfer_opinion)
                    .set("transfer_process",transfer_process)
                    .set("enclosure",enclosure)
                    .set("type",type)
                    .set("department",department)
                    .set("order_guid",order_guid)
                    .set("keywords",keywords)
                    .save();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
