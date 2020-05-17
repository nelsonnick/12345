package com.wts.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.*;
import java.util.Map;

import static com.wts.util.WordUtil.replaceInTable;

public class util12345 {
    /**
     messageType:0     issend:0——办理单——Undo
     messageType:1     issend:0——催办单
     messageType:2     issend:0——退回办理单——Return
     messageType:4     issend:0——重新办理单——Reset
     messageType:011   issend:X——可延期申请
     messageType:11    issend:X——到期工单——Expire
     messageType:12    issend:X——超期工单
     messageType:202   issend:1——已退回——Fallback
     messageType:201   issend:1——已回复——Reply
     messageType:40    issend:1——已处理重新办理单
     messageType:200   issend:1——已处理退回办理单
     messageType:-1    issend:X——全部工单
     */
    public static String getListUrl(String messageType, String issend){
        String url = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/listTaskHotLine.aspx?MessageType=" + messageType;
        if (issend.equals("X")){
            return url;
        }else{
            return url + "&issend=" +issend;
        }
    }

    //  分页用的
    public static String getListUrl(String pageNo){
        return "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/listTaskHotLine.aspx?pageNo=" + pageNo + "&sort=desc&sortColumn=sendTime";
    }

    public static Document getDoc(String url, String cookie){
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
        try{
            Response response = client.newCall(request).execute();
            doc = Jsoup.parse(response.body().string());
        }catch (Exception e){
            e.printStackTrace();
        }
        return doc;
    }

    //  分页用的
    public static Document getDoc(String url, String cookie, String Referer){
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
        try{
            Response response = client.newCall(request).execute();
            doc = Jsoup.parse(response.body().string());
        }catch (Exception e){
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
