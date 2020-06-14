package com.wts.controller;

import com.jfinal.core.Controller;
import com.jfinal.kit.PropKit;
import com.wts.entity.model.Allwork;
import com.wts.service.AllworkService;
import com.wts.util.util12345;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static com.wts.util.util12345.getDoc;
import static com.wts.util.util12345.getDoc2;
import static com.wts.util.util12345.getPageUrl;

public class MainController extends Controller {

    public void index() {
        renderText("服务正常");
    }
    public void a() {
        setAttr("num1",20);//#(num1)
        render("a.html");
    }
    public void b(){
        String url = getPageUrl("-1", "X");
        String cookie = PropKit.use("config-dev.txt").get("cookie");
        Document doc = getDoc(url, cookie);
        Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
        AllworkService service = new AllworkService();
        for (int i = 0; i < trs.size() - 1; i++) {
            Elements ins = trs.get(i).getElementsByTag("td");
            String file_guid = ins.get(0).getElementsByTag("input").get(0).attr("value").substring(9, 47);
            String order_guid = ins.get(0).getElementsByTag("input").get(0).attr("value").substring(53, 91);
            String order_code = ins.get(1).text().replace("&nbsp;", "");
            if (service.findNumByGUID(order_guid)==0){
                String urls = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?fileGuid="+file_guid+"&GUID=" +order_guid+ "&IsZDDB=&xxlyid=1";
                Document doc1 = getDoc(urls,cookie);
                Element tbody = doc1.getElementsByClass("tablebgcolor").get(0).getElementsByTag("tbody").get(0);
                String order_state = tbody.getElementById("gdzt").text();//工单状态
                String link_person = tbody.getElementById("linkPerson").text();//联系人
                String link_phone = tbody.getElementById("linkPhone").text();//联系电话
                String link_address = tbody.getElementById("address").text();//联系地址
                String problem_description = tbody.getElementById("content").text();//问题描述
                String send_time = tbody.getElementById("sendTime").text();//发送时间
                Allwork allwork = new Allwork();
                allwork.set("file_guid", file_guid)
                        .set("order_guid", order_guid)
                        .set("order_code", order_code)
                        .set("link_person", link_person)
                        .set("link_phone", link_phone)
                        .set("link_address", link_address)
                        .set("problem_description", problem_description)
                        .set("send_time", send_time);
                save(allwork);
            }
        }
//        for (int i=2;i<7;i++){
//            getPage(i,cookie);
//        }
//        for (int i=7;i<758;i++){
//            getPage2(i,cookie);
//        }
    }
//    第2-6页用这个
    public void getPage(Integer pageNum, String cookie) {
        String pageUrl = util12345.getPageUrl(pageNum + "");
        System.out.println(pageUrl);
        Document doc = getDoc(pageUrl, cookie);
        Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
        for (int i = 0; i < trs.size() - 1; i++) {
            Elements ins = trs.get(i).getElementsByTag("td");
            String file_guid = ins.get(0).getElementsByTag("input").get(0).attr("value").substring(9, 47);
            String order_guid = ins.get(0).getElementsByTag("input").get(0).attr("value").substring(53, 91);
            String order_code = ins.get(1).text().replace("&nbsp;", "");
            String urls = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?fileGuid="+file_guid+"&GUID=" +order_guid+ "&IsZDDB=&xxlyid=1";
            Document doc1 = getDoc(urls,cookie);
            Element tbody = doc1.getElementsByClass("tablebgcolor").get(0).getElementsByTag("tbody").get(0);
            String order_state = tbody.getElementById("gdzt").text();//工单状态
            String link_person = tbody.getElementById("linkPerson").text();//联系人
            String link_phone = tbody.getElementById("linkPhone").text();//联系电话
            String link_address = tbody.getElementById("address").text();//联系地址
            String problem_description = tbody.getElementById("content").text();//问题描述
            String send_time = tbody.getElementById("sendTime").text();//发送时间
            Allwork allwork = new Allwork();
            allwork.set("file_guid", file_guid)
                    .set("order_guid", order_guid)
                    .set("order_code", order_code)
                    .set("link_person", link_person)
                    .set("link_phone", link_phone)
                    .set("link_address", link_address)
                    .set("problem_description", problem_description)
                    .set("send_time", send_time);
            save(allwork);
        }
    }
//    7页以后用这个
    public void getPage2(Integer pageNum, String cookie) {
        System.out.println(pageNum);
        Document doc = getDoc2(pageNum+"", cookie);
        Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
        for (int i = 0; i < trs.size() - 1; i++) {
            Elements ins = trs.get(i).getElementsByTag("td");
            String file_guid = ins.get(0).getElementsByTag("input").get(0).attr("value").substring(9, 47);
            String order_guid = ins.get(0).getElementsByTag("input").get(0).attr("value").substring(53, 91);
            String order_code = ins.get(1).text().replace("&nbsp;", "");
            String urls = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?fileGuid="+file_guid+"&GUID=" +order_guid+ "&IsZDDB=&xxlyid=1";
            Document doc1 = getDoc(urls,cookie);
            Element tbody = doc1.getElementsByClass("tablebgcolor").get(0).getElementsByTag("tbody").get(0);
            String order_state = tbody.getElementById("gdzt").text();//工单状态
            String link_person = tbody.getElementById("linkPerson").text();//联系人
            String link_phone = tbody.getElementById("linkPhone").text();//联系电话
            String link_address = tbody.getElementById("address").text();//联系地址
            String problem_description = tbody.getElementById("content").text();//问题描述
            String send_time = tbody.getElementById("sendTime").text();//发送时间
            Allwork allwork = new Allwork();
            allwork.set("file_guid", file_guid)
                    .set("order_guid", order_guid)
                    .set("order_code", order_code)
                    .set("link_person", link_person)
                    .set("link_phone", link_phone)
                    .set("link_address", link_address)
                    .set("problem_description", problem_description)
                    .set("send_time", send_time);
            save(allwork);
        }
    }
    public void save(Allwork allwork) {
        AllworkService service = new AllworkService();
        service.add(allwork);
    }



}


