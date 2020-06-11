package com.wts.task;

import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.Db;
import com.wts.entity.model.Allwork;
import com.wts.entity.model.Unhandle;
import com.wts.service.AllworkService;
import com.wts.service.ExpireService;
import com.wts.util.util12345;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static com.wts.util.WordUtil.getUrgencyDegree;
import static com.wts.util.util12345.getDoc;
import static com.wts.util.util12345.getPageUrl;

public class Down12345Allwork implements Runnable {

    @Override
    public void run() {
        String url = getPageUrl("-1", "X");
        String cookie = PropKit.use("config-dev.txt").get("cookie");
        Document doc = getDoc(url, cookie);
        Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
        for (int i = 0; i < trs.size() - 1; i++) {
            Elements ins = trs.get(i).getElementsByTag("td");
            String order_guid = ins.get(0).getElementsByTag("input").get(0).attr("value").substring(9, 47);
            String file_guid = ins.get(0).getElementsByTag("input").get(0).attr("value").substring(53, 91);
            String order_code = ins.get(1).text().replace("&nbsp;", "");
            save(get(file_guid, order_guid, order_code));
        }
        for (int i=2;i<757;i++){
            getPage(i,cookie);
            System.out.println(i);
        }
    }

    public static void getPage(Integer pageNum, String cookie) {
        String pageUrl = util12345.getPageUrl(pageNum + "");
        System.out.println(pageUrl);
        Document doc = getDoc(pageUrl, cookie);
        Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
        for (int i = 0; i < trs.size() - 1; i++) {
            Elements ins = trs.get(i).getElementsByTag("td");
            String order_guid = ins.get(0).getElementsByTag("input").get(0).attr("value").substring(9, 47);
            String file_guid = ins.get(0).getElementsByTag("input").get(0).attr("value").substring(53, 91);
            String order_code = ins.get(1).text().replace("&nbsp;", "");
            save(get(file_guid, order_guid, order_code));
        }
    }

    public static Allwork get(String file_guid, String order_guid, String cookie) {
        String url = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?fileGuid="+file_guid+"&GUID=" +order_guid+ "&IsZDDB=&xxlyid=1";
        Document doc = getDoc(url, cookie);
        Element tbody = doc.getElementsByClass("tablebgcolor").get(0).getElementsByTag("tbody").get(0);
        String order_state = tbody.getElementById("gdzt").text();//工单状态
        String order_code = tbody.getElementById("HotLineWorkNumber").text();//工单编号
        String link_person = tbody.getElementById("linkPerson").text();//联系人
        String link_phone = tbody.getElementById("linkPhone").text();//联系电话
        String link_address = tbody.getElementById("address").text();//联系地址
        String problem_description = tbody.getElementById("content").text();//问题描述
        String send_time = tbody.getElementById("sendTime").text();//发送时间
        Allwork allwork = new Allwork();
        allwork.set("order_guid", order_guid)
                .set("order_code", order_code)
                .set("link_person", link_person)
                .set("link_phone", link_phone)
                .set("link_address", link_address)
                .set("problem_description", problem_description)
                .set("send_time", send_time);
        return allwork;

    }

    public static void save(Allwork allwork) {
        AllworkService service = new AllworkService();
        service.add(allwork);
    }

    public static void save(String order_guid, String order_code, String link_person, String link_phone, String link_address, String send_time, String problem_description) {
        AllworkService service = new AllworkService();
        if (service.findNumByGUID(order_guid) == 0) {
            service.add(order_guid, order_code, link_person, link_phone, link_address, send_time, problem_description);
        }
    }

    public static void main(String[] args) {


    }
}
