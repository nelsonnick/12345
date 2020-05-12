package com.wts.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class order12345 {
    public static void main(String[] args) throws IOException {
        String Cookie = "jn.gov.cn=UserID=GVl7MZ9hnbtfzpPrOq3B9A==&UserPass=bXnKpxw85yw=&ADGuid=HP79/4nMJ6xJ9s+VHA4+I5fM/D3BpZvY79O9dyE2cvkvhUuktBvziQ==&UserName=LKgasW++KiD/0oOuF4OIoAmaekB6iJy4OiygaTn++HU=&TicketData=y/cmJRNtGBo=; ASP.NET_SessionId=w0jaj455nitxwcy23ksduh55; .jhoa=B306F3F495EA0FD04FF9B817B233D49266F2602D6B125520CB820C9F09B407E72900C49A0CF34F50BEA06CF285CEF07FD226CDC1C6CAC5840B1A018B421AC202930C88C924B562D3101A07762F53187C8A1195E6C1C7B8CFEB0D2FE48DD9DCEF67C25A5A4C33692BBD13EDB9242906F488B38F9D30C89871C871ADED128EAFD36D6A9BC8161C78E6917A6EBBB667FDCF5ADD1222";

        String GUID = "{ee22ad63-7409-4021-b460-95dd066626bd}";
        OkHttpClient client2 = new OkHttpClient().newBuilder()
                .build();
        Request request2 = new Request.Builder()
                .url("http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?GUID=" +GUID+ "&IsZDDB=&")
                .method("GET", null)
                .addHeader("Cookie", Cookie)
                .addHeader("Host", "15.1.0.24")
//					.addHeader("Accept-Encoding", "gzip, deflate")
                .addHeader("Accept-Language", "zh-Hans-CN, zh-Hans; q=0.5")
                .addHeader("Connection", "Keep-Alive")
                .addHeader("Accept", "text/html, application/xhtml+xml, image/jxr, */*")
                .build();
        Response response2 = client2.newCall(request2).execute();
        Document doc2 = Jsoup.parse(response2.body().string());
        Element tbody = doc2.getElementsByClass("tablebgcolor").get(0).getElementsByTag("tbody").get(0);
        Element td = tbody.getElementsByTag("tr").get(9).getElementsByTag("td").get(1);
        System.out.println(td.text());
    }
}
