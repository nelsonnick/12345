package com.wts.util;

import com.alibaba.fastjson.JSONObject;
import com.jfinal.kit.PropKit;
import com.wts.task.DailyMonitor;
import me.chanjar.weixin.cp.api.impl.WxCpServiceImpl;
import me.chanjar.weixin.cp.bean.WxCpMessage;
import me.chanjar.weixin.cp.config.impl.WxCpDefaultConfigImpl;
import okhttp3.*;
import org.apache.log4j.Logger;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static com.wts.util.others.IpKit.getLocalHostIP;
import static com.wts.util.printUtil.printSingleColor;


public class wxUtil {
    private static final Logger logger = Logger.getLogger(wxUtil.class);
    public static String getTimeStr(String localTime) {
        String str = localTime
                .replace("/1/", "-01-")
                .replace("/2/", "-02-")
                .replace("/3/", "-03-")
                .replace("/4/", "-04-")
                .replace("/5/", "-05-")
                .replace("/6/", "-06-")
                .replace("/7/", "-07-")
                .replace("/8/", "-08-")
                .replace("/9/", "-09-")
                .replace("/10/", "-10-")
                .replace("/11/", "-11-")
                .replace("/12/", "-12-");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date localDate = null;
        try {
            localDate = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long localTimeInMillis = localDate.getTime();
        Calendar calendar = Calendar.getInstance();//long时间转换成Calendar
        calendar.setTimeInMillis(localTimeInMillis);
        int zoneOffset = calendar.get(java.util.Calendar.ZONE_OFFSET);//取得时间偏移量
        int dstOffset = calendar.get(java.util.Calendar.DST_OFFSET);//取得夏令时差
        calendar.add(java.util.Calendar.MILLISECOND, -(zoneOffset + dstOffset));//从本地时间里扣除这些差量，即可以取得UTC时间
        Date utcDate = new Date(calendar.getTimeInMillis());//取得的时间就是UTC标准时间
        return sdf.format(utcDate).replace(" ", "T")+ ".000Z";
    }

    public static String getSubStr(String str) {
        if (str==null){
            return "";
        }
        if (str.length() < 500) {
            return str.replace("\n", "").replace("\r", "").replace("\t", "").replace("\"", "").replace("\\", "");
        } else {
            return str.substring(0, 499).replace("\n", "").replace("\r", "").replace("\t", "").replace("\"", "").replace("\\", "");
        }
    }

    public static String getAllworkStr(String guid, String HotLineWorkNumber, String linkPerson, String linkPhone, String sendTime,
                                       String urgencyDegree, String isSecret, String isReply, String endDate, String content, String remark, String banliFlow, String xxlyId) {
        String temp = "{\"env\":\"gov-rri3h\",\"query\":\"db.collection(\\\"allwork\\\").add({data:[{_id:\\\"${_id}\\\",HotLineWorkNumber:\\\"${HotLineWorkNumber}\\\",linkPerson:\\\"${linkPerson}\\\",linkPhone:\\\"${linkPhone}\\\",sendTime:new Date(\\\"${sendTime}\\\"),urgencyDegree:\\\"${urgencyDegree}\\\",isSecret:\\\"${isSecret}\\\",isReply:\\\"${isReply}\\\",endDate:\\\"${endDate}\\\",content:\\\"${content}\\\",remark:\\\"${remark}\\\",banliFlow:\\\"${banliFlow}\\\",xxlyId:\\\"${xxlyId}\\\"}]})\"}";
        return temp.replace("${_id}", guid)
                .replace("${HotLineWorkNumber}", HotLineWorkNumber)
                .replace("${linkPerson}", linkPerson)
                .replace("${linkPhone}", linkPhone)
                .replace("${sendTime}", sendTime.replace("/", "-"))
                .replace("${urgencyDegree}", urgencyDegree)
                .replace("${isSecret}", isSecret)
                .replace("${isReply}", isReply)
                .replace("${endDate}", endDate)
                .replace("${content}", getSubStr(content))
                .replace("${remark}", getSubStr(remark))
                .replace("${banliFlow}", getSubStr(banliFlow))
                .replace("${xxlyId}", xxlyId);
    }

    public static String getReplyStr(String guid, String replyTime, String replyPerson, String replyContent, String replySatisfy, String HotLineWorkNumber, String linkPerson) {
//        String temp = "{\"env\":\"gov-rri3h\",\"query\":\"db.collection(\\\"reply\\\").add({data:[{_id:\\\"${_id}\\\",HotLineWorkNumber:\\\"${HotLineWorkNumber}\\\",linkPerson:\\\"${linkPerson}\\\",linkPhone:\\\"${linkPhone}\\\",countNum:\\\"${countNum}\\\",writeTime:\\\"${writeTime}\\\",sendTime:\\\"${sendTime}\\\",urgencyDegree:\\\"${urgencyDegree}\\\",isSecret:\\\"${isSecret}\\\",isReply:\\\"${isReply}\\\",endDate:\\\"${endDate}\\\",content:\\\"${content}\\\",remark:\\\"${remark}\\\",banliFlow:\\\"${banliFlow}\\\",xxlyId:\\\"${xxlyId}\\\",replyTime:\\\"${replyTime}\\\",replyPerson:\\\"${replyPerson}\\\",replyContent:\\\"${replyContent}\\\",replyType:\\\"${replyType}\\\"}]})\"}";
        String temp = "{\"env\":\"gov-rri3h\",\"query\":\"db.collection(\\\"reply\\\").add({data:[{_id:\\\"${_id}\\\",replyTime:new Date(\\\"${replyTime}\\\"),replyPerson:\\\"${replyPerson}\\\",replyContent:\\\"${replyContent}\\\",replySatisfy:\\\"${replySatisfy}\\\",replyType:\\\"${replyType}\\\",HotLineWorkNumber:\\\"${HotLineWorkNumber}\\\",linkPerson:\\\"${linkPerson}\\\"}]})\"}";
        String t = replyContent.substring(0, 1);
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
        return temp.replace("${_id}", guid)
                .replace("${HotLineWorkNumber}", HotLineWorkNumber)
                .replace("${linkPerson}", linkPerson)
                .replace("${replyTime}", replyTime)
                .replace("${replyPerson}", replyPerson)
                .replace("${replyContent}", getSubStr(replyContent))
                .replace("${replySatisfy}", replySatisfy)
                .replace("${replyType}", replyType);
    }

    public static String getFallbackStr(String guid, String fallbackTime, String fallbackPerson, String fallbackReason, String suggestion, String fallbackDepartment, String HotLineWorkNumber, String linkPerson) {
//        String temp = "{\"env\":\"gov-rri3h\",\"query\":\"db.collection(\\\"fallback\\\").add({data:[{_id:\\\"${_id}\\\",HotLineWorkNumber:\\\"${HotLineWorkNumber}\\\",linkPerson:\\\"${linkPerson}\\\",linkPhone:\\\"${linkPhone}\\\",countNum:\\\"${countNum}\\\",writeTime:\\\"${writeTime}\\\",sendTime:\\\"${sendTime}\\\",urgencyDegree:\\\"${urgencyDegree}\\\",isSecret:\\\"${isSecret}\\\",isReply:\\\"${isReply}\\\",endDate:\\\"${endDate}\\\",content:\\\"${content}\\\",remark:\\\"${remark}\\\",banliFlow:\\\"${banliFlow}\\\",xxlyId:\\\"${xxlyId}\\\",fallbackTime:\\\"${fallbackTime}\\\",fallbackPerson:\\\"${fallbackPerson}\\\",fallbackReason:\\\"${fallbackReason}\\\",suggestion:\\\"${suggestion}\\\",fallbackDepartment:\\\"${fallbackDepartment}\\\"}]})\"}";
        String temp = "{\"env\":\"gov-rri3h\",\"query\":\"db.collection(\\\"fallback\\\").add({data:[{_id:\\\"${_id}\\\",fallbackTime:new Date(\\\"${fallbackTime}\\\"),fallbackPerson:\\\"${fallbackPerson}\\\",fallbackReason:\\\"${fallbackReason}\\\",suggestion:\\\"${suggestion}\\\",fallbackDepartment:\\\"${fallbackDepartment}\\\",fallbackType:\\\"${fallbackType}\\\",HotLineWorkNumber:\\\"${HotLineWorkNumber}\\\",linkPerson:\\\"${linkPerson}\\\"}]})\"}";
        String t = fallbackReason.substring(0, 1);
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
        return temp.replace("${_id}", guid)
                .replace("${HotLineWorkNumber}", HotLineWorkNumber)
                .replace("${linkPerson}", linkPerson)
                .replace("${fallbackTime}", fallbackTime)
                .replace("${fallbackPerson}", fallbackPerson)
                .replace("${fallbackReason}", getSubStr(fallbackReason))
                .replace("${suggestion}", getSubStr(suggestion))
                .replace("${fallbackDepartment}", fallbackDepartment)
                .replace("${fallbackType}", fallbackType);
    }

    public static String getUnhandleStr(String guid, String HotLineWorkNumber, String linkPerson, String endDate) {
        String temp = "{\"env\":\"gov-rri3h\",\"query\":\"db.collection(\\\"unhandle\\\").add({data:[{_id:\\\"${_id}\\\",HotLineWorkNumber:\\\"${HotLineWorkNumber}\\\",linkPerson:\\\"${linkPerson}\\\",endDate:\\\"${endDate}\\\"}]})\"}";
        return temp.replace("${_id}", guid)
                .replace("${HotLineWorkNumber}", HotLineWorkNumber)
                .replace("${linkPerson}", linkPerson)
                .replace("${endDate}", endDate);
    }

    public static String getSubscribeMessageStr(String OPENID, String TEMPLATE_ID, String guid, String HotLineWorkNumber, String linkPerson,
                                                String linkPhone, String sendTime, String endDate, String collectionName) {
        String temp = "{\"touser\":\"${OPENID}\",\"template_id\":\"${TEMPLATE_ID}\",\"page\":\"${collectionName}?_id=${guid}\",\"miniprogram_state\":\"developer\",\"lang\":\"zh_CN\",\"data\":{\"character_string01\":{\"value\":\"${HotLineWorkNumber}\"},\"thing01\":{\"value\":\"${linkPerson}\"},\"character_string02\":{\"value\":\"${linkPhone}\"},\"time01\":{\"value\":\"${sendTime}\"},\"date01\":{\"value\":\"${endDate}\"}}}";
        return temp.replace("${OPENID}", OPENID)
                .replace("${TEMPLATE_ID}", TEMPLATE_ID)
                .replace("${guid}", guid)
                .replace("${HotLineWorkNumber}", HotLineWorkNumber)
                .replace("${linkPerson}", linkPerson)
                .replace("${linkPhone}", linkPhone)
                .replace("${sendTime}", sendTime)
                .replace("${endDate}", endDate)
                .replace("${collectionName}", collectionName);
    }

    /*
        获取token
        */
    public static String getToken() {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wxb9a7b1d61af09a1e&secret=a5d001d64a7e2c658d5c5abc0a4af556")
                .method("GET", null)
                .build();
        try {
            Response response = client.newCall(request).execute();
            return JSONObject.parseObject(response.body().string()).getString("access_token");
        } catch (Exception e) {
            return "";
        }
    }

    /*
       添加Allwork
       返回0表示正常
       */
    public static String addAllwork(String token, String guid, String HotLineWorkNumber, String linkPerson, String linkPhone, String sendTime,
                                    String urgencyDegree, String isSecret, String isReply, String endDate, String content, String remark, String banliFlow, String xxlyId) {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        String unhandleStr = getAllworkStr(guid, HotLineWorkNumber, linkPerson, linkPhone, sendTime,
                urgencyDegree, isSecret, isReply, endDate, content, remark, banliFlow, xxlyId);
        RequestBody body = RequestBody.create(mediaType, unhandleStr);
        Request request = new Request.Builder()
                .url("https://api.weixin.qq.com/tcb/databaseadd?access_token=" + token)
                .method("POST", body)
                .addHeader("Content-Type", "text/plain")
                .build();
        try {
            Response response = client.newCall(request).execute();
            String errcode = JSONObject.parseObject(response.body().string()).getString("errcode");
            if (!errcode.equals("0")) {
                logger.info("上传Allwork失败-->" + HotLineWorkNumber + "-" + linkPerson);
                printSingleColor(31,3,"上传Allwork失败-->" + HotLineWorkNumber + "-" + linkPerson + "-errcode:" + errcode);
            }else{
                logger.info("上传Allwork成功-->" + HotLineWorkNumber + "-" + linkPerson);
                printSingleColor(34,3,"上传Allwork成功-->" + HotLineWorkNumber + "-" + linkPerson + "-errcode:" + errcode);
            }
            return errcode;
        } catch (Exception e) {
            logger.error("上传Allwork错误-->" + HotLineWorkNumber + "-" + linkPerson);
            printSingleColor(91,3,"上传Allwork错误-->" + HotLineWorkNumber + "-" + linkPerson);
            return "";
        }
    }

    /*
       添加Reply
       返回0表示正常
       */
    public static String addReply(String token, String guid, String replyTime, String replyPerson, String replyContent, String replySatisfy, String HotLineWorkNumber, String linkPerson) {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        String replyStr = getReplyStr(guid, replyTime, replyPerson, replyContent, replySatisfy, HotLineWorkNumber, linkPerson);
        RequestBody body = RequestBody.create(mediaType, replyStr);
        Request request = new Request.Builder()
                .url("https://api.weixin.qq.com/tcb/databaseadd?access_token=" + token)
                .method("POST", body)
                .addHeader("Content-Type", "text/plain")
                .build();
        try {
            Response response = client.newCall(request).execute();
            String errcode = JSONObject.parseObject(response.body().string()).getString("errcode");
            if (!errcode.equals("0")) {
                logger.info("上传Reply失败-->" + HotLineWorkNumber + "-" + linkPerson);
                printSingleColor(31,3,"上传Reply失败-->" + HotLineWorkNumber + "-" + linkPerson + "-errcode:" + errcode);
            }else{
                logger.info("上传Reply成功-->" + HotLineWorkNumber + "-" + linkPerson);
                printSingleColor(35,3,"上传Reply成功-->" + HotLineWorkNumber + "-" + linkPerson + "-errcode:" + errcode);
            }
            return errcode;
        } catch (Exception e) {
            logger.error("上传Reply错误-->" + HotLineWorkNumber + "-" + linkPerson);
            printSingleColor(1,3,"上传Reply错误-->" + HotLineWorkNumber + "-" + linkPerson);
            return "";
        }
    }

    /*
       添加Fallback
       返回0表示正常
       */
    public static String addFallback(String token, String guid, String fallbackTime, String fallbackPerson, String fallbackReason, String suggestion, String fallbackDepartment, String HotLineWorkNumber, String linkPerson) {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        String fallbackStr = getFallbackStr(guid, fallbackTime, fallbackPerson, fallbackReason, suggestion, fallbackDepartment, HotLineWorkNumber, linkPerson);
        RequestBody body = RequestBody.create(mediaType, fallbackStr);
        Request request = new Request.Builder()
                .url("https://api.weixin.qq.com/tcb/databaseadd?access_token=" + token)
                .method("POST", body)
                .addHeader("Content-Type", "text/plain")
                .build();
        try {
            Response response = client.newCall(request).execute();
            String errcode = JSONObject.parseObject(response.body().string()).getString("errcode");
            if (!errcode.equals("0")) {
                logger.info("上传Fallback失败-->" + HotLineWorkNumber + "-" + linkPerson);
                printSingleColor(31,3,"上传Fallback失败-->" + HotLineWorkNumber + "-" + linkPerson + "-errcode:" + errcode);
            }else{
                logger.info("上传Fallback成功-->" + HotLineWorkNumber + "-" + linkPerson);
                printSingleColor(36,3,"上传Fallback成功-->" + HotLineWorkNumber + "-" + linkPerson + "-errcode:" + errcode);
            }
            return errcode;
        } catch (Exception e) {
            logger.error("上传Fallback错误-->" + HotLineWorkNumber + "-" + linkPerson);
            printSingleColor(91,3,"上传Fallback错误-->" + HotLineWorkNumber + "-" + linkPerson);
            return "";
        }
    }

    /*
       添加Unhandle
       返回0表示正常
       */
    public static String addUnhandle(String token, String guid, String HotLineWorkNumber, String linkPerson, String endDate) {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        String UnhandleStr = getUnhandleStr(guid, HotLineWorkNumber, linkPerson, endDate);
        RequestBody body = RequestBody.create(mediaType, UnhandleStr);
        Request request = new Request.Builder()
                .url("https://api.weixin.qq.com/tcb/databaseadd?access_token=" + token)
                .method("POST", body)
                .addHeader("Content-Type", "text/plain")
                .build();
        try {
            Response response = client.newCall(request).execute();
            String errcode = JSONObject.parseObject(response.body().string()).getString("errcode");
            if (!errcode.equals("0")) {
                logger.info("上传Unhandle失败-->" + HotLineWorkNumber + "-" + linkPerson);
                printSingleColor(31,3,"上传Unhandle失败-->" + HotLineWorkNumber + "-" + linkPerson + "-errcode:" + errcode);
            }else{
                logger.info("上传Unhandle成功-->" + HotLineWorkNumber + "-" + linkPerson);
                printSingleColor(37,3,"上传Unhandle成功-->" + HotLineWorkNumber + "-" + linkPerson + "-errcode:" + errcode);
            }
            return errcode;
        } catch (Exception e) {
            logger.error("上传Unhandle错误-->" + HotLineWorkNumber + "-" + linkPerson);
            printSingleColor(91,3,"上传Unhandle错误-->" + HotLineWorkNumber + "-" + linkPerson);
            return "";
        }
    }

    /*
       删除Unhandle
       返回0表示正常
       */
    public static String deleteUnhandle(String token, String guid, String HotLineWorkNumber, String linkPerson) {
        String temp = "{\"env\":\"gov-rri3h\",\"query\":\"db.collection(\\\"unhandle\\\").doc(\\\"${_id}\\\").remove()\"}";
        String str = temp.replace("${_id}", guid);
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, str);
        Request request = new Request.Builder()
                .url("https://api.weixin.qq.com/tcb/databasedelete?access_token=" + token)
                .method("POST", body)
                .addHeader("Content-Type", "text/plain")
                .build();
        try {
            Response response = client.newCall(request).execute();
            String errcode = JSONObject.parseObject(response.body().string()).getString("errcode");
            if (!errcode.equals("0")) {
                logger.info("删除Unhandle失败-->" + HotLineWorkNumber + "-" + linkPerson);
                printSingleColor(31,3,"删除Unhandle失败-->" + HotLineWorkNumber + "-" + linkPerson + "-errcode:" + errcode);
            }else{
                logger.info("删除Unhandle成功-->" + HotLineWorkNumber + "-" + linkPerson);
                printSingleColor(90,3,"删除Unhandle成功-->" + HotLineWorkNumber + "-" + linkPerson + "-errcode:" + errcode);
            }
            return errcode;
        } catch (Exception e) {
            logger.error("删除Unhandle错误-->" + HotLineWorkNumber + "-" + linkPerson);
            printSingleColor(91,3,"删除Unhandle错误-->" + HotLineWorkNumber + "-" + linkPerson);
            return "";
        }
    }


    /*
        发送订阅消息
        返回0表示正常
        王天硕OPENID：oxbuA4oyvysDDboo4RQovWDPmlWg
        */
    public static String sendSubMessage(String token, String OPENID, String TEMPLATE_ID, String guid, String HotLineWorkNumber, String linkPerson,
                                        String linkPhone, String sendTime, String endDate, String collectionName) throws Exception {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        String messageStr = getSubscribeMessageStr(OPENID, TEMPLATE_ID, guid, HotLineWorkNumber, linkPerson,
                linkPhone, sendTime, endDate, collectionName);
        RequestBody body = RequestBody.create(mediaType, messageStr);
        Request request = new Request.Builder()
                .url("https://api.weixin.qq.com/cgi-bin/message/subscribe/send?access_token=" + token)
                .method("POST", body)
                .addHeader("Content-Type", "text/plain")
                .build();
        Response response = client.newCall(request).execute();
        return JSONObject.parseObject(response.body().string()).getString("errcode");
    }

    public static void sendMessageToWeiXin(String msgContent, String UserID) {
        try {
            WxCpDefaultConfigImpl config = new WxCpDefaultConfigImpl();
            config.setCorpId(ParamesAPI.corpId);      // 设置微信企业号的appid
            config.setCorpSecret(ParamesAPI.secret);  // 设置微信企业号的app corpSecret
            config.setAgentId(ParamesAPI.agentId);     // 设置微信企业号应用ID
            config.setToken(ParamesAPI.token);       // 设置微信企业号应用的token
            config.setAesKey(ParamesAPI.encodingAESKey);      // 设置微信企业号应用的EncodingAESKey
            WxCpServiceImpl wxCpService = new WxCpServiceImpl();
            wxCpService.setWxCpConfigStorage(config);
            WxCpMessage message = WxCpMessage
                    .TEXT()
                    .agentId(ParamesAPI.agentId)
                    .toUser(UserID)
                    .content(msgContent)
                    .build();
            wxCpService.messageSend(message);
        } catch (Exception e) {
            printSingleColor(91,3,"推送企业微信失败-->" + msgContent);
        }
    }

    public static Boolean goWaiWang() throws Exception {
        Runtime.getRuntime().exec("netsh interface set interface \"LAN\" disabled");
        Runtime.getRuntime().exec("netsh interface set interface \"WLAN\" enabled");
        Thread.sleep(10000);
        String ip = getLocalHostIP();
        String waiwangIP = PropKit.use("config-dev.txt").get("waiwangIP");
        if (ip.equals(waiwangIP)) {
            printSingleColor(30,3,"切换外网状态成功！");
            return true;
        } else {
            printSingleColor(91,3,"切换外网状态失败！");
            return false;
        }
    }


    public static Boolean goNeiWang() throws Exception {
        Runtime.getRuntime().exec("netsh interface set interface \"WLAN\" disabled");
        Runtime.getRuntime().exec("netsh interface set interface \"LAN\" enabled");
        Thread.sleep(10000);
        String ip = getLocalHostIP();
        String neiwangIP = PropKit.use("config-dev.txt").get("neiwangIP");
        if (ip.equals(neiwangIP)) {
            printSingleColor(30,3,"切换内网状态成功！");
            return true;
        } else {
            printSingleColor(91,3,"切换内网状态失败！");
            return false;
        }
    }
}
