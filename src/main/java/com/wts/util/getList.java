package com.wts.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

import static com.wts.util.listStr.liststr;

public class getList {
    String Cookie = "jn.gov.cn=UserID=GVl7MZ9hnbtfzpPrOq3B9A==&UserPass=bXnKpxw85yw=&ADGuid=HP79/4nMJ6xJ9s+VHA4+I5fM/D3BpZvY79O9dyE2cvkvhUuktBvziQ==&UserName=LKgasW++KiD/0oOuF4OIoAmaekB6iJy4OiygaTn++HU=&TicketData=y/cmJRNtGBo=; ASP.NET_SessionId=z3t3ex55pbrxqdbs0ax4wi2x; .jhoa=5C9673E54F11C7AC138D727DDEA15BC48342C00336FF58F4D716880FC4838B5610B73D993D586971EB877DAFAE76B30F37C4DC3C5FDD6478A3F37475F64A7E9A6F2B474BA8ADB71536C1660349DDFEC7325F07518689162D2F4C02DD001982128F1BF92576B098ED92F1551DE4E19091283808D6C1CD2083955992A41B484A2145AD789F426FF232E72B7F9A42950A9BEA5296D9";

    public static void gL(String Cookie) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("http://15.1.0.24/jhoa_huaiyinqu/taskhotline/listTaskHotLine.aspx?MessageType=0&issend=0")
                .method("GET", null)
                .addHeader("Accept", "text/html, application/xhtml+xml, image/jxr, */*")
                .addHeader("Accept-Encoding", "gzip, deflate")
                .addHeader("Accept-Language", "zh-Hans-CN, zh-Hans; q=0.5")
                .addHeader("Connection", "Keep-Alive")
                .addHeader("Cookie", Cookie)
                .addHeader("Host", "15.1.0.24")
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; rv:11.0) like Gecko Core/1.70.3756.400 QQBrowser/10.5.4039.400")
                .build();
        Response response = client.newCall(request).execute();
        Document doc = Jsoup.parse(response.body().string());
        Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
        for (int i = 0; i < trs.size() - 1; i++) {
            Element in = trs.get(i).getElementsByTag("td").get(0).getElementsByTag("input").get(0);
            String value = in.attr("value");
            String GUID = value.substring(5, 43);
            System.out.println(value);
            System.out.println(GUID);
        }
    }

    public static void ggg() {
        Document doc = Jsoup.parse(liststr);
        Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
        for (int i = 0; i < trs.size() - 1; i++) {
            Element in = trs.get(i).getElementsByTag("td").get(0).getElementsByTag("input").get(0);
            String value = in.attr("value");
            String GUID = value.substring(5, 43);
            System.out.println(value);
            System.out.println(GUID);
        }
//        Element masthead = doc.select("div.outerDIV>span").first();
    }

    public static void main(String[] args) {
        ggg();
    }


}
