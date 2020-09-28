package com.wts.util;

import com.jfinal.kit.PropKit;
import okhttp3.*;
import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static com.wts.util.printUtil.printSingleColor;


public class util12345 {
    /**
     * messageType:0     issend:0——办理单——Undo
     * messageType:1     issend:0——催办单
     * messageType:2     issend:0——退回办理单——Return
     * messageType:4     issend:0——重新办理单——Reset
     * messageType:011   issend:X——可延期申请
     * messageType:11    issend:X——到期工单——Expire
     * messageType:12    issend:X——超期工单
     * messageType:202   issend:1——已退回——Fallback
     * messageType:201   issend:1——已回复——Reply
     * messageType:40    issend:1——已处理重新办理单
     * messageType:200   issend:1——已处理退回办理单
     * messageType:-1    issend:X——全部工单
     */
    private static final Logger logger = Logger.getLogger(util12345.class);

    public static String getPageUrl(String messageType, String issend) {
        String url = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/listTaskHotLine.aspx?MessageType=" + messageType;
        if (issend.equals("X")) {
            return url;
        } else {
            return url + "&issend=" + issend;
        }
    }

    //  获取分页的URL
    public static String getPageUrl(String pageNo) {
        return "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/listTaskHotLine.aspx?pageNo=" + pageNo + "&sort=desc&sortColumn=sendTime";
    }
    // 获取工单详细信息或者各类列表的第一页
    public static Document getDoc(String url, String cookie) {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(40, TimeUnit.SECONDS)
                .build();
        Request request = new Request.Builder()
                .url(url)
                .method("GET", null)
                .addHeader("Accept", "text/html, application/xhtml+xml, image/jxr, */*")
                .addHeader("Accept-Language", "zh-Hans-CN, zh-Hans; q=0.5")
//					.addHeader("Accept-Encoding", "gzip, deflate")
                .addHeader("Cookie", cookie)
                .addHeader("Connection", "Keep-Alive")
                .addHeader("Host", "15.1.0.24")
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; rv:11.0) like Gecko Core/1.70.3756.400 QQBrowser/10.5.4039.400")
                .build();
        Document doc = null;
        try {
            Response response = client.newCall(request).execute();
            doc = Jsoup.parse(response.body().string());
        } catch (Exception e) {
            logger.error("无法获取链接：" + url);
            printSingleColor(31,3,"获取链接错误-->" + url);
        }
        return doc;
    }

    // 获取更多的页面的信息
    public static Document getPageList(String PageNum, String cookie, String MessageTypeFlag) {
        String sqlwhereHidden = "";
        String u = "";
        if (MessageTypeFlag.equals("-1")){//全部
            sqlwhereHidden = "   and messagetype!=1  and ownerguid='c443f956-8101-48ec-bf0a-80c97039a90e'";
            u = "http://15.1.0.24/jhoagch_huaiyinqu/taskhotline/listTaskHotLine.aspx?MessageType=-1";
        }else if(MessageTypeFlag.equals("202")) {//回退
            sqlwhereHidden = "   and  issend=1 and (messageType=0 or messagetype=2) and gdzt=4  and ownerguid='c443f956-8101-48ec-bf0a-80c97039a90e'";
            u = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/listTaskHotLine.aspx?MessageType=202&issend=1";
        }else if(MessageTypeFlag.equals("201")) {//回复
            sqlwhereHidden = "   and  issend=1 and (messageType=0 or messagetype=2) and gdzt=5  and ownerguid='c443f956-8101-48ec-bf0a-80c97039a90e'";
            u = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/listTaskHotLine.aspx?MessageType=201&issend=1";
        }else if(MessageTypeFlag.equals("0")) {//未处理
            sqlwhereHidden = "   and  issend=0 and messageType=0 and (gdzt!=3 or gdzt is null)  and ownerguid='c443f956-8101-48ec-bf0a-80c97039a90e'";
            u = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/listTaskHotLine.aspx?MessageType=0&issend=0";
        }else if(MessageTypeFlag.equals("11")) {//到期
            sqlwhereHidden = "  and (issend=0 or issend=2 ) and messagetype!=1 and messagetype!=3 and messagetype!=5 and enddate is not null and (enddate='2020/8/27' or enddate-1='2020/8/27')  and (gdzt!=3 or gdzt is null) and ownerguid='c443f956-8101-48ec-bf0a-80c97039a90e' ";
            u = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/listTaskHotLine.aspx?MessageType=11";
        }else{

        }
        Document doc = null;
        try {
            OkHttpClient client = new OkHttpClient().newBuilder()
                    .connectTimeout(20, TimeUnit.SECONDS)
                    .readTimeout(40, TimeUnit.SECONDS)
                    .build();
            MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
            RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                    .addFormDataPart("__VIEWSTATE", "/wEPDwUKMTAxNTE0MzAxMQ9kFgJmD2QWAgIDDzwrAAsBAA8WDB4LXyFJdGVtQ291bnQCKB4IRGF0YUtleXMWAB4JUGFnZUNvdW50AvUFHhVfIURhdGFTb3VyY2VJdGVtQ291bnQCxewBHhBWaXJ0dWFsSXRlbUNvdW50AsXsAR4IUGFnZVNpemUCKGRkGAEFHl9fQ29udHJvbHNSZXF1aXJlUG9zdEJhY2tLZXlfXxYBBRhKaG9hR3JpZDEkY3RsMDIkQ2hlY2tBbGx0gCijDzrjICWM03IlqTbzO6cQhw==")
                    .addFormDataPart("__VIEWSTATEGENERATOR", "CAECE07B")
                    .addFormDataPart("__EVENTVALIDATION", "/wEWCwLOjo/5BQKfk5XkBwKciorSAgKxuZzKDwLTgZzcDgLy3Z3uCwKAyt2nDQKKhMKUDgKh893yBgKm4dCKDAKM54rGBkUnLuFKgGsYKVjyDzW9E+oofqBy")
                    .addFormDataPart("_lkocok_signThisForm", "1")
                    .addFormDataPart("operationType", "")
                    .addFormDataPart("sort", "desc")
                    .addFormDataPart("sortColumn", "sendTime")
                    .addFormDataPart("cmbPageNo", PageNum)
                    .addFormDataPart("fenleiXmlStringHidden", "")
                    .addFormDataPart("gouxuandaochuXml", "")
                    .addFormDataPart("oneBLDxml", "")
                    .addFormDataPart("MessageTypeFlag", MessageTypeFlag)
                    .addFormDataPart("sqlwhereHidden", sqlwhereHidden)
                    .addFormDataPart("timeflagTxt", "")
                    .addFormDataPart("GuidPrint", "")
                    .addFormDataPart("type", "")
                    .addFormDataPart("IsTwoUnitFlag","")
                    .addFormDataPart("hdsqlWhere","")
                    .build();
            Long l = body.contentLength();
            Request request = new Request.Builder()
                    .url(u)
                    .method("POST", body)
                    .addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
//                    .addHeader("Accept-Encoding", "gzip, deflate")
                    .addHeader("Accept-Language", "zh-CN,zh;q=0.9")
                    .addHeader("Cache-Control", "max-age=0")
                    .addHeader("Connection", "keep-alive")
                    .addHeader("Content-Length", l.toString())
                    .addHeader("Content-Type", "application/x-www-form-urlencoded")
                    .addHeader("Cookie", cookie)
                    .addHeader("Host", "15.1.0.24")
                    .addHeader("Origin", "http://15.1.0.24")
                    .addHeader("Referer", u)
                    .addHeader("Upgrade-Insecure-Requests", "1")
                    .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.61 Safari/537.36")
                    .build();
            Response response = client.newCall(request).execute();
            doc = Jsoup.parse(response.body().string());
//            System.out.println(doc);
        } catch (Exception e) {
            logger.error("无法获取页面列表：" + MessageTypeFlag);
            printSingleColor(31,3,"获取页面列表错误-->" + MessageTypeFlag);
            e.printStackTrace();
        }
        return doc;
    }


    public static Boolean hasDirectory(){
        File f = new File("D:\\12345");
        return f.isDirectory();
    }

}
