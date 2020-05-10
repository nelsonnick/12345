package com.wts.util;

import okhttp3.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.List;

public class Jnjgfw {

    public static void getEnterprise(String regNo) throws IOException {

        String qymc = "", xydm = "", yyzz = "", lx = "", jyz = "", zcrq = "", hzrq = "", djjg = "", djzt = "", zs = "", jyfw = "", jycs = "", zczb = "", yyqx1 = "", yyqx2 = "";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://www.jnjgfw.gov.cn/command/search/detail?entName=&uniscId=&orgCode=&regNo=" + regNo + "&taxpayId=&keyword=")
                .get()
                .addHeader("content-type", "text/html;charset=UTF-8")
                .addHeader("connection", "keep-alive")
                .addHeader("access-control-allow-headers", "X-Requested-With")
                .addHeader("cache-control", "no-cache")
                .build();
        Response response = client.newCall(request).execute();
        Document doc = Jsoup.parse(response.body().string());
        Element masthead = doc.select("div.qyqx-title>span").first();
        qymc = masthead.text();
        List<Element> mastheads = doc.select("table.table-bordered").first().select("tr");
        xydm = mastheads.get(0).select("td.fieldInput").get(0).text().trim();
        yyzz = mastheads.get(0).select("td.fieldInput").get(1).text().trim();
        lx = mastheads.get(1).select("td.fieldInput").get(0).text().trim();
        jyz = mastheads.get(1).select("td.fieldInput").get(1).text().trim();


    }





}
