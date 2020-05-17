package com.wts.task;

import com.jfinal.kit.PropKit;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import static com.wts.util.util12345.getDoc;
import static com.wts.util.util12345.getListUrl;

public class Down12345Return implements Runnable{

    @Override
    public void run() {
        String url = getListUrl("2", "0");
        String cookie = PropKit.use("config-dev.txt").get("cookie");
        Document doc = getDoc(url,cookie);
        Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
        if (trs.text().equals("")){

        }
    }

}
