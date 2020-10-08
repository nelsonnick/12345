package com.wts.util;

import com.jfinal.kit.PropKit;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

import static com.wts.util.util12345.*;

public class t {
    public static void main(String[] args) {
        String cookie = PropKit.use("config-dev.txt").get("cookie");
//        Document doc = util12345.getPageList(2+"",cookie,"201");
//        for (int j = 1; j < 3; j++) {
//            Document doc = util12345.getReplyPageList(j + "", cookie);
//            Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
//            for (int i = 0; i < trs.size() - 1; i++) {
//                Element in = trs.get(i).getElementsByTag("td").get(5).getElementsByTag("a").get(0);
//                System.out.println(in.attr("title").replace("\n", ""));
//            }
//            System.out.println(j + "--------------------------------------------------");
//        }
        getDoc(getPageUrl("0", "0"), cookie);
        for (int j = 1; j < 5; j++) {
            Document doc = getDocOther(getPageUrl(j + ""), cookie);
            Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
            for (int i = 0; i < trs.size() - 1; i++) {
                Element in = trs.get(i).getElementsByTag("td").get(5).getElementsByTag("a").get(0);
                System.out.println(in.attr("title").replace("\n", ""));
            }
            System.out.println(j + "--------------------------------------------------");
        }
        System.out.println("*****************************************************************************");
        getDoc(getPageUrl("202", "1"), cookie);
        for (int j = 1; j < 5; j++) {
            Document doc = getDocOther(getPageUrl(j + ""), cookie);
            Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
            for (int i = 0; i < trs.size() - 1; i++) {
                Element in = trs.get(i).getElementsByTag("td").get(5).getElementsByTag("a").get(0);
                System.out.println(in.attr("title").replace("\n", ""));
            }
            System.out.println(j + "--------------------------------------------------");
        }
        System.out.println("*****************************************************************************");
        getDoc(getPageUrl("201", "1"), cookie);
        for (int j = 1; j < 5; j++) {
            Document doc = getDocOther(getPageUrl(j + ""), cookie);
            Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
            for (int i = 0; i < trs.size() - 1; i++) {
                Element in = trs.get(i).getElementsByTag("td").get(5).getElementsByTag("a").get(0);
                System.out.println(in.attr("title").replace("\n", ""));
            }
            System.out.println(j + "--------------------------------------------------");
        }
    }
}
