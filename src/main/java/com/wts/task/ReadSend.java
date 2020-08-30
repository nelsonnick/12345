package com.wts.task;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wts.entity.model.Allwork;
import com.wts.entity.model.Fallback;
import com.wts.entity.model.Reply;
import com.wts.util.oaUtil;
import com.wts.util.util12345;

import java.io.*;

import static com.wts.util.wxUtil.*;
import static com.wts.util.wxUtil.deleteUnhandle;

public class ReadSend implements Runnable {
    private static final String downPath = "D:\\12345\\";
    @Override
    public void run(){
        if (util12345.hasDirectory()){
            String weixinToken = getToken();
            if (!weixinToken.equals("")) {
                readAllworkText(weixinToken);
                readReplyText(weixinToken);
                readFallbackText(weixinToken);
                readUnhandleAddText(weixinToken);
                readUnhandleDeleteText(weixinToken);
            }
        }
    }
    public void sendAllwork(Allwork allwork, String weixinToken) {
        String errcode = addAllwork(weixinToken,
                allwork.get("order_guid"),
                allwork.get("order_code"),
                allwork.get("link_person"),
                allwork.get("link_phone"),
                allwork.get("send_time"),
                allwork.get("urgency_degree"),
                allwork.get("is_secret"),
                allwork.get("is_reply"),
                allwork.get("end_date"),
                allwork.get("problem_description"),
                allwork.get("transfer_opinion"),
                allwork.get("transfer_process"),
                allwork.get("accept_channel"));
        String err = addUnhandle(weixinToken,
                allwork.get("order_guid"),
                allwork.get("order_code"),
                allwork.get("link_person"),
                allwork.get("end_date"));
        String OA_token = oaUtil.getToken();
        String run_id = oaUtil.getRun_id(OA_token);
        String OA_content = oaUtil.getContent(run_id, allwork.get("order_code"), allwork.get("link_person"), allwork.get("end_date"), allwork.get("urgency_degree"), allwork.get("link_phone"),
                allwork.get("problem_description"), allwork.get("transfer_opinion"), allwork.get("transfer_process"), "XXX");
        oaUtil.inputOA(OA_token, OA_content);
        sendMessageToWeiXin("收到新工单：" + allwork.get("order_code"), "WangTianShuo");
        if (errcode.equals("0") && err.equals("0")) {
            System.out.println("待办理工单已推送：" + allwork.get("order_code") + "-" + allwork.get("link_person"));
        } else {
            System.out.println("待办理工单推送失败：" + allwork.get("order_code") + "-" + allwork.get("link_person"));
        }
    }

    public void readAllworkText(String weixinToken){
        File file = new File(downPath + "allwork.txt");
        BufferedReader reader = null; //
        InputStream in = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            while((tempString = reader.readLine())!=null) {
                JSONObject jsonObject = JSON.parseObject(tempString);
                Allwork allwork = new Allwork();
                allwork.set("order_guid",jsonObject.getString("order_guid"))
                        .set("order_code",jsonObject.getString("order_code"))
                        .set("link_person",jsonObject.getString("link_person"))
                        .set("link_phone",jsonObject.getString("link_phone"))
                        .set("send_time",jsonObject.getString("send_time"))
                        .set("urgency_degree",jsonObject.getString("urgency_degree"))
                        .set("is_secret",jsonObject.getString("is_secret"))
                        .set("is_reply",jsonObject.getString("is_reply"))
                        .set("end_date",jsonObject.getString("end_date"))
                        .set("problem_description",jsonObject.getString("problem_description"))
                        .set("transfer_opinion",jsonObject.getString("transfer_opinion"))
                        .set("transfer_process",jsonObject.getString("transfer_process"))
                        .set("accept_channel",jsonObject.getString("accept_channel"));
//                System.out.println(allwork.toJson());
                sendAllwork(allwork,weixinToken);
                line++;
            }
            reader.close();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(reader != null) {
                try {
                    reader.close();
                }catch (IOException el) {

                }
            }
        }
        file.delete();

    }

    public void sendReply(Reply reply, String weixinToken) {
        String errcode = addReply(weixinToken,
                reply.get("order_guid"),
                reply.get("reply_time"),
                reply.get("reply_person"),
                reply.get("reply_content"),
                reply.get("reply_satisfy"),
                reply.get("order_code"),
                reply.get("link_person"));
        String err = deleteUnhandle(weixinToken,
                reply.get("order_guid"));
        sendMessageToWeiXin("工单：" + reply.get("order_code") + "-->已回复", "WangTianShuo");
        if (errcode.equals("0") && err.equals("0")) {
            System.out.println("已回复工单已推送：" + reply.get("order_code") + "-" + reply.get("link_person"));
        } else {
            System.out.println("已回复工单推送失败：" + reply.get("order_code") + "-" + reply.get("link_person"));
        }

    }

    public void readReplyText(String weixinToken){
        File file = new File(downPath + "reply.txt");
        BufferedReader reader = null; //
        InputStream in = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            while((tempString = reader.readLine())!=null) {
                JSONObject jsonObject = JSON.parseObject(tempString);
                Reply reply = new Reply();
                reply.set("order_guid",jsonObject.getString("order_guid"))
                        .set("order_code",jsonObject.getString("order_code"))
                        .set("link_person",jsonObject.getString("link_person"))
                        .set("reply_time",jsonObject.getString("reply_time"))
                        .set("reply_person",jsonObject.getString("reply_person"))
                        .set("reply_content",jsonObject.getString("reply_content"))
                        .set("reply_satisfy",jsonObject.getString("reply_satisfy"));
                sendReply(reply,weixinToken);
                line++;
            }
            reader.close();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(reader != null) {
                try {
                    reader.close();
                }catch (IOException el) {

                }
            }
        }
        file.delete();

    }

    public void sendFallback(Fallback fallback, String weixinToken) {
        String errcode = addFallback(weixinToken,
                fallback.get("order_guid"),
                fallback.get("fallback_time"),
                fallback.get("fallback_person"),
                fallback.get("fallback_reason"),
                fallback.get("suggestion"),
                fallback.get("fallback_department"),
                fallback.get("order_code"),
                fallback.get("link_person"));
        String err = deleteUnhandle(weixinToken,
                fallback.get("order_guid"));
        sendMessageToWeiXin("工单：" + fallback.get("order_code") + "-->已回退", "WangTianShuo");
        if (errcode.equals("0") && err.equals("0")) {
            System.out.println("已回退工单已推送：" + fallback.get("order_code") + "-" + fallback.get("link_person"));
        } else {
            System.out.println("已回退工单推送失败：" + fallback.get("order_code") + "-" + fallback.get("link_person"));
        }
    }

    public void readFallbackText(String weixinToken){
        File file = new File(downPath + "fallback.txt");
        BufferedReader reader = null; //
        InputStream in = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            while((tempString = reader.readLine())!=null) {
                JSONObject jsonObject = JSON.parseObject(tempString);
                Fallback fallback = new Fallback();
                fallback.set("order_guid",jsonObject.getString("order_guid"))
                        .set("order_code",jsonObject.getString("order_code"))
                        .set("link_person",jsonObject.getString("link_person"))
                        .set("fallback_time",jsonObject.getString("fallback_time"))
                        .set("fallback_person",jsonObject.getString("fallback_person"))
                        .set("fallback_reason",jsonObject.getString("fallback_reason"))
                        .set("suggestion",jsonObject.getString("suggestion"))
                        .set("fallback_department",jsonObject.getString("fallback_department"));
                sendFallback(fallback,weixinToken);
                line++;
            }
            reader.close();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(reader != null) {
                try {
                    reader.close();
                }catch (IOException el) {

                }
            }
        }
        file.delete();

    }

    public void readUnhandleAddText(String weixinToken){
        File file = new File(downPath + "unhandleAdd.txt");
        BufferedReader reader = null; //
        InputStream in = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            while((tempString = reader.readLine())!=null) {
                JSONObject jsonObject = JSON.parseObject(tempString);
                String err = addUnhandle(weixinToken,
                        jsonObject.getString("order_guid"),
                        jsonObject.getString("order_code"),
                        jsonObject.getString("link_person"),
                        jsonObject.getString("end_date"));
                if (err.equals("0")) {
                    System.out.println("待办理工单已推送：" + jsonObject.getString("order_code") + "-" + jsonObject.getString("link_person"));
                } else {
                    System.out.println("待办理工单推送失败：" + jsonObject.getString("order_code") + "-" + jsonObject.getString("link_person"));
                }
                line++;
            }
            reader.close();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(reader != null) {
                try {
                    reader.close();
                }catch (IOException el) {

                }
            }
        }
        file.delete();

    }

    public void readUnhandleDeleteText(String weixinToken){
        File file = new File(downPath + "unhandleDelete.txt");
        BufferedReader reader = null; //
        InputStream in = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            while((tempString = reader.readLine())!=null) {
                JSONObject jsonObject = JSON.parseObject(tempString);
                String err = deleteUnhandle(weixinToken,
                        jsonObject.getString("order_guid"));
                if (err.equals("0")) {
                    System.out.println("完成工单已推送：" + jsonObject.getString("order_code") + "-" + jsonObject.getString("link_person"));
                } else {
                    System.out.println("完成工单推送失败：" + jsonObject.getString("order_code") + "-" + jsonObject.getString("link_person"));
                }
                line++;
            }
            reader.close();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(reader != null) {
                try {
                    reader.close();
                }catch (IOException el) {

                }
            }
        }
        file.delete();

    }

}
