package com.wts.task;

import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.Db;
import com.wts.service.ExpireService;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import static com.wts.util.util12345.getDoc;
import static com.wts.util.util12345.getListUrl;

public class Down12345Expire implements Runnable {

    @Override
    public void run() {
        Db.update("truncate table expire");
        // 第一页
        String url = getListUrl("0", "0");
        String cookie = PropKit.use("config-dev.txt").get("cookie");
        Document doc = getDoc(url, cookie);
        Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
        for (int i = 0; i < trs.size() - 1; i++) {
            Elements ins = trs.get(i).getElementsByTag("td");
            String order_guid = ins.get(0).getElementsByTag("input").get(0).attr("value").substring(5, 43);
            String order_code = ins.get(1).text().replace("&nbsp;", "");
            String end_date = ins.get(3).text().replace("&nbsp;", "");//2020-05-12
            save(order_guid,order_code,end_date);
        }

    }

    public void save(String order_guid,String order_code,String end_date){
        ExpireService service = new ExpireService();
        if (service.findNumByGUID(order_guid)==0){
            service.add(order_guid,order_code, end_date);
        }
    }
//    需要进一步分析页面
//    table id=lkocok_grid_footer
//    tr--0
//    td--0
//    font--2--value:/5
//
//
//    td--1
//    a--1--href="?pageNo=2"---value:下一页&nbsp;
}
