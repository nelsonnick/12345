package com.wts.controller;

import okhttp3.*;

public class sendMessage {
    public static void main(String[] args) throws Exception{
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                .addFormDataPart("__VIEWSTATE", "/wEPDwUKLTY0NTUzMjE0OQ8WAh4TVmFsaWRhdGVSZXF1ZXN0TW9kZQIBZGSYgqJ9/rUgtK2mzNHKPqmJvOSWPRqaEOwwkMjHcsD8vA==")
                .addFormDataPart("__VIEWSTATEGENERATOR", "7A14AFD1")
                .addFormDataPart("__EVENTVALIDATION", "/wEdAAbJD1DkHs6whifU49YDUk9l8e0ffoBKy/vX3CAeJlyC8zuKDqaEsBd9PkvVn4xs+Y4KzK9Pno7pY6pDrbHbiAJN+wDBwADMipxIWbQbKapZPTAvzfXAPyPYl3NiktsDaXRep0UVP4Uae8PiR1Yc0biTPhwXQi+lDaycS71yth6GNA==")
                .addFormDataPart("SendPhone", "")
                .addFormDataPart("persons", "18653145531")
                .addFormDataPart("IsChecked", "false")
                .addFormDataPart("MessContent", "欢迎拨打")
                .addFormDataPart("Mes", "")
                .build();
        Long l = body.contentLength();
        Request request = new Request.Builder()
                .url("http://15.1.0.165/SMSTranfersPlatform/Phone.aspx")
                .method("POST", body)
                .addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
                .addHeader("Accept-Encoding", "gzip, deflate")
                .addHeader("Accept-Language", "zh-CN,zh;q=0.9")
                .addHeader("Cache-Control", "max-age=0")
                .addHeader("Connection", "keep-alive")
                .addHeader("Content-Length", l.toString())
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .addHeader("Cookie", "jn.gov.cn=UserID=GVl7MZ9hnbtfzpPrOq3B9A==&UserPass=bXnKpxw85yw=&ADGuid=HP79/4nMJ6xJ9s+VHA4+I5fM/D3BpZvY79O9dyE2cvkvhUuktBvziQ==&UserName=LKgasW++KiD/0oOuF4OIoAmaekB6iJy4OiygaTn++HU=&TicketData=y/cmJRNtGBo=&SignValidate=2099-1-1&CreateDate=yAjF585PEEY3gtEdUn2bn3vNczqxdjJJ&OrgionUserGUID=HP79/4nMJ6xJ9s+VHA4+I5fM/D3BpZvY79O9dyE2cvkvhUuktBvziQ==&OrgionUserName=LKgasW++KiD/0oOuF4OIoAmaekB6iJy4OiygaTn++HU=&CookieID=y/cmJRNtGBo=&LoginType=y/cmJRNtGBo=; ASP.NET_SessionId=aebiqglwxzxa43v4edsmtss0; .JHOAAUTH=4F0387274FCCA1AF12EC18312C24C084D9242E0F15E4C870702FC84977B707B29FAA962F882E24A7427CE5F61D579F5C4EB1A5838FFF5E9EB831DE3B2EDBCBC5420F61DE35F09993BDBF47F30B66207BAC2A98E880166E4D07EADE19D50F085AD0EF7EAC32C2AC912DA7297ED100061EBCD6760C4F4CACDFE26FB39D53ADD78F1FBABB5CD63B6982DC4F01B8B65C8119")
                .addHeader("Host", "15.1.0.165")
                .addHeader("Origin", "http://15.1.0.165")
                .addHeader("Referer", "http://15.1.0.165/SMSTranfersPlatform/Phone.aspx")
                .addHeader("Upgrade-Insecure-Requests", "1")
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.138 Safari/537.36")
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response);
    }
}
