package com.wts.util;

import okhttp3.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


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
    public static String getPageUrl(String messageType, String issend) {
        String url = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/listTaskHotLine.aspx?MessageType=" + messageType;
        if (issend.equals("X")) {
            return url;
        } else {
            return url + "&issend=" + issend;
        }
    }

    //  分页用的
    public static String getPageUrl(String pageNo) {
        return "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/listTaskHotLine.aspx?pageNo=" + pageNo + "&sort=desc&sortColumn=sendTime";
    }

    public static Document getDoc(String url, String cookie) {
        OkHttpClient client = new OkHttpClient().newBuilder()
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
            e.printStackTrace();
        }
        return doc;
    }
    // 第7页之后的列表（所有第2页之后的可能都能用？？？）
    public static Document getDoc2(String PageNum, String cookie,String MessageTypeFlag) {
        String sqlwhereHidden = "";
        if (MessageTypeFlag.equals("-1")){//全部
            sqlwhereHidden = "   and messagetype!=1  and ownerguid='c443f956-8101-48ec-bf0a-80c97039a90e'";
        }else if(MessageTypeFlag.equals("202")) {//回退
            sqlwhereHidden = "   and  issend=1 and (messageType=0 or messagetype=2) and gdzt=4  and ownerguid='c443f956-8101-48ec-bf0a-80c97039a90e'";
        }else if(MessageTypeFlag.equals("201")) {//回复
            sqlwhereHidden = "   and  issend=1 and (messageType=0 or messagetype=2) and gdzt=5  and ownerguid='c443f956-8101-48ec-bf0a-80c97039a90e'";
        }else{

        }
        Document doc = null;
        try {
            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
            RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                    .addFormDataPart("__VIEWSTATE", "/wEPDwUKMTAxNTE0MzAxMQ9kFgJmD2QWAgIDDzwrAAsBAA8WDB4LXyFJdGVtQ291bnQCKB4IRGF0YUtleXMWAB4JUGFnZUNvdW50AvUFHhVfIURhdGFTb3VyY2VJdGVtQ291bnQCxewBHhBWaXJ0dWFsSXRlbUNvdW50AsXsAR4IUGFnZVNpemUCKGRkGAEFHl9fQ29udHJvbHNSZXF1aXJlUG9zdEJhY2tLZXlfXxYBBRhKaG9hR3JpZDEkY3RsMDIkQ2hlY2tBbGx0gCijDzrjICWM03IlqTbzO6cQhw==")
                    .addFormDataPart("__VIEWSTATEGENERATOR", "C55A3254")
                    .addFormDataPart("__EVENTVALIDATION", "/wEWCwLOjo/5BQKfk5XkBwKciorSAgKxuZzKDwLTgZzcDgLy3Z3uCwKAyt2nDQKKhMKUDgKh893yBgKm4dCKDAKM54rGBkUnLuFKgGsYKVjyDzW9E+oofqBy")
                    .addFormDataPart("_lkocok_signThisForm", "1")
                    .addFormDataPart("operationType", "")
                    .addFormDataPart("sort", "desc")
                    .addFormDataPart("sortColumn", "sendTime")
//                    .addFormDataPart("cmbPageNo", "7")
                    .addFormDataPart("cmbPageNo", PageNum)
                    .addFormDataPart("fenleiXmlStringHidden", "")
                    .addFormDataPart("gouxuandaochuXml", "")
                    .addFormDataPart("oneBLDxml", "")
//                    .addFormDataPart("MessageTypeFlag", "-1")
                    .addFormDataPart("MessageTypeFlag", MessageTypeFlag)
                    .addFormDataPart("sqlwhereHidden", sqlwhereHidden)
                    .addFormDataPart("timeflagTxt", "")
                    .addFormDataPart("GuidPrint", "")
                    .addFormDataPart("type", "")
                    .build();
            Long l = body.contentLength();
            Request request = new Request.Builder()
                    .url("http://15.1.0.24/jhoagch_huaiyinqu/taskhotline/listTaskHotLine.aspx?MessageType=-1")
                    .method("POST", body)
                    .addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
//                    .addHeader("Accept-Encoding", "gzip, deflate")
                    .addHeader("Accept-Language", "zh-CN,zh;q=0.9")
                    .addHeader("Cache-Control", "max-age=0")
                    .addHeader("Connection", "keep-alive")
                    .addHeader("Content-Length", l.toString())
                    .addHeader("Content-Type", "application/x-www-form-urlencoded")
                    .addHeader("Cookie", cookie)
//                    .addHeader("Cookie", "jn.gov.cn=UserID=GVl7MZ9hnbtfzpPrOq3B9A==&UserPass=bXnKpxw85yw=&ADGuid=HP79/4nMJ6xJ9s+VHA4+I5fM/D3BpZvY79O9dyE2cvkvhUuktBvziQ==&UserName=LKgasW++KiD/0oOuF4OIoAmaekB6iJy4OiygaTn++HU=&TicketData=y/cmJRNtGBo=; ASP.NET_SessionId=ebvqgb55zvxlgmi1d3cugrev; .jhoa=E65EBF1D86A489E27A7358BE71AC8C85E0AF0B878D43FF1F1381F37FD6DAD6E43539BA3D351A3A9E00F352B594F6E7A3F33D50B2B3FEB4002F3CD69B02333B8ACD7CAB6DDE2B3DF11C91C4304CE2BD3C86044A4E49AD599C586404E0C63A009DF50681CD58E79CC4B0D4AF70E0FF5F9D5FE8F2FCA452AE2584BC3CA96E1017F58C7178991BD4F7F44CA9BFC39A71C7702212B622")
                    .addHeader("Host", "15.1.0.24")
                    .addHeader("Origin", "http://15.1.0.24")
                    .addHeader("Referer", "http://15.1.0.24/jhoagch_huaiyinqu/taskhotline/listTaskHotLine.aspx?MessageType=-1")
                    .addHeader("Upgrade-Insecure-Requests", "1")
                    .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.61 Safari/537.36")
                    .build();
            Response response = client.newCall(request).execute();
            doc = Jsoup.parse(response.body().string());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doc;
    }

    //  分页用的-----似乎用不到了
    public static Document getDoc(String url, String cookie, String Referer) {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url(url)
                .method("GET", null)
                .addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
                .addHeader("Accept-Language", "zh-CN,zh;q=0.9")
//					.addHeader("Accept-Encoding", "gzip, deflate")
                .addHeader("Cookie", cookie)
                .addHeader("Connection", "Keep-Alive")
                .addHeader("Host", "15.1.0.24")
                .addHeader("Referer", Referer)
                .addHeader("Upgrade-Insecure-Requests", "1")
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; rv:11.0) like Gecko Core/1.70.3756.400 QQBrowser/10.5.4039.400")
                .build();
        Document doc = null;
        try {
            Response response = client.newCall(request).execute();
            doc = Jsoup.parse(response.body().string());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doc;
    }


//    private void CreatWordByModel(String tmpFile, Map<String, String> contentMap, String exportFile) {
//        //导出到文件
//        try {
//            InputStream in = null;
//            in = new FileInputStream(new File(tmpFile));
//            XWPFDocument document = null;
//            document = new XWPFDocument (in);
//            replaceInTable(document, contentMap);
//            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//            document.write((OutputStream)byteArrayOutputStream);
//            OutputStream outputStream = new FileOutputStream(exportFile);
//            outputStream.write(byteArrayOutputStream.toByteArray());
//            outputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

}
