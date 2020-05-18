package com.wts.task;

import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.Db;
import com.wts.service.ExpireService;
import com.wts.util.util12345;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static com.wts.util.util12345.getDoc;
import static com.wts.util.util12345.getPageUrl;

public class Down12345Expire implements Runnable {

    @Override
    public void run() {
        Db.update("truncate table expire");
        // 第一页
        String url = getPageUrl("11", "X");
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
        Element page = doc.getElementById("lkocok_grid_footer").getElementsByTag("tr").get(0).getElementsByTag("td").get(0).getElementsByTag("font").get(2);
        String pageTotal = page.text().substring(1,page.text().length());
        Integer p = Integer.valueOf(pageTotal);
        //有2页及以上
        if (p>=2){
            getPage(2,cookie);
        }
        //有3页及以上
        if (p>=3){
            getPage(3,cookie);
        }
        //有4页及以上
        if (p>=4){
            getPage(4,cookie);
        }
        //有5页及以上
        if (p>=5){
            getPage(5,cookie);
        }
    }

    public void getPage(Integer pageNum, String cookie){
        String pageUrl = util12345.getPageUrl(pageNum + "");
        Document doc = getDoc(pageUrl, cookie);
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

}
