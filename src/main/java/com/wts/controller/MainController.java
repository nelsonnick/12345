package com.wts.controller;

import com.jfinal.core.Controller;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.wts.util.util12345;
import com.wts.util.wxUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static com.wts.util.util12345.getDoc;
import static com.wts.util.util12345.getPageUrl;

public class MainController extends Controller {

    public void index() {
        renderText("服务正常");
    }

    public void fallback() throws IOException {
        String path = "d:\\fallback.txt";
        File file = new File(path);
        if(!file.exists()){
            file.getParentFile().mkdirs();
        }
        file.createNewFile();

        // write
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        List<Record> replyList = Db.find("SELECT order_guid,fallback_department,fallback_person,fallback_time,suggestion,fallback_reason,order_code,link_person FROM fallback");
        for (Record record : replyList) {
            String t = record.get("fallback_reason").toString().substring(0,1);
            String fallbackType;
            if (t.equals("A")){
                fallbackType = "其他劳动";
            } else if (t.equals("B")){
                fallbackType = "区住建局";
            } else if (t.equals("C")){
                fallbackType = "区社保办";
            } else if (t.equals("D")){
                fallbackType = "市人社局";
            } else if (t.equals("E")){
                fallbackType = "各街道办";
            } else {
                fallbackType = "其他部门";
            }
            String fallbackTime;
            if (record.get("fallback_time").toString().equals("")){
                fallbackTime = wxUtil.getTimeStr("2000/1/1 00:00:00");
            }else{
                System.out.println();
                fallbackTime = wxUtil.getTimeStr(record.get("fallback_time"));
            }
            String a = "{\"_id\":\"" + record.get("order_guid")
                    + "\",\"HotLineWorkNumber\":\"" + record.get("order_code")
                    + "\",\"linkPerson\":\"" + record.get("link_person")
                    + "\",\"fallbackPerson\":\"" + record.get("fallback_person")
                    + "\",\"fallbackReason\":\"" + record.get("fallback_reason").toString().replace("\"","")
                    + "\",\"fallbackTime\":{\"$date\":\"" + fallbackTime
                    + "\"},\"suggestion\":\"" + record.get("suggestion").toString().replace("\"","")
                    + "\",\"fallbackDepartment\":\"" + record.get("fallback_department")
                    + "\",\"fallbackType\":\"" + fallbackType
                    + "\"}\n";
            bw.write(a);

        }
        bw.flush();
        bw.close();
        fw.close();
        renderText("已回退工单已生成");
    }

    public void reply() throws IOException {
        String path = "d:\\reply.txt";
        File file = new File(path);
        if(!file.exists()){
            file.getParentFile().mkdirs();
        }
        file.createNewFile();

        // write    {a20ff39a-0d0a-4bfb-bb8b-682cceef64c6}
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        List<Record> replyList = Db.find("SELECT order_guid,reply_content,reply_person,reply_time,reply_satisfy,order_code,link_person FROM reply");
        for (Record record : replyList) {
            String t = record.get("reply_content").toString().substring(0,1);
            String replyType;
            if (t.equals("A")){
                replyType = "劳动关系";
            } else if (t.equals("B")){
                replyType = "社会保险";
            } else if (t.equals("C")){
                replyType = "就业创业";
            } else if (t.equals("D")){
                replyType = "人事人才";
            } else {
                replyType = "其他";
            }
            String replyTime;
            if (record.get("reply_time").toString().equals("")){
                replyTime = wxUtil.getTimeStr("2000/1/1 00:00:00");
            }else{
                replyTime = wxUtil.getTimeStr(record.get("reply_time"));
            }
            String a = "{\"_id\":\"" + record.get("order_guid")
                    + "\",\"HotLineWorkNumber\":\"" + record.get("order_code")
                    + "\",\"linkPerson\":\"" + record.get("link_person")
                    + "\",\"replyContent\":\"" + record.get("reply_content").toString().replace("\"","")
                    + "\",\"replyPerson\":\"" + record.get("reply_person")
                    + "\",\"replyTime\":{\"$date\":\"" + replyTime
                    + "\"},\"replySatisfy\":\"" + record.get("reply_satisfy")
                    + "\",\"replyType\":\"" + replyType
                    + "\"}\n";
            bw.write(a);
        }
        bw.flush();
        bw.close();
        fw.close();
        renderText("已回复工单已生成");
    }

    public void allwork() throws IOException {
        String path = "d:\\allwork.txt";
        File file = new File(path);
        if(!file.exists()){
            file.getParentFile().mkdirs();
        }
        file.createNewFile();

        // write
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        List<Record> allworkList = Db.find("SELECT order_guid,order_code,link_person,link_phone,write_time,send_time,urgency_degree,is_secret," +
                "is_reply,end_date,problem_description,transfer_opinion,transfer_process,accept_channel FROM allwork");
//        LIMIT 0,3
        for (Record allwork : allworkList) {
            String a = "{\"_id\":\"" + allwork.get("order_guid")
                    + "\",\"HotLineWorkNumber\":\"" + allwork.get("order_code")
                    + "\",\"linkPerson\":\"" + allwork.get("link_person")
                    + "\",\"linkPhone\":\"" + allwork.get("link_phone")
//                    + "\",\"writeTime\":{\"$date\":\"" + getTimeStr(allwork.get("write_time"))
                    + "\",\"sendTime\":{\"$date\":\"" + wxUtil.getTimeStr(allwork.get("send_time"))
                    + "\"},\"urgencyDegree\":\"" + allwork.get("urgency_degree")
                    + "\",\"isSecret\":\"" + allwork.get("is_secret")
                    + "\",\"isReply\":\"" + allwork.get("is_reply")
                    + "\",\"endDate\":\"" + allwork.get("end_date")
                    + "\",\"content\":\"" + wxUtil.getSubStr(allwork.get("problem_description"))
                    + "\",\"remark\":\"" + wxUtil.getSubStr(allwork.get("transfer_opinion"))
                    + "\",\"banliFlow\":\"" + wxUtil.getSubStr(allwork.get("transfer_process"))
                    + "\",\"xxlyId\":\"" + allwork.get("accept_channel")
                    + "\"}\n";
            bw.write(a);
        }
        bw.flush();
        bw.close();
        fw.close();
        renderText("全部工单已生成！");
    }

    // 数据来源：到期工单的第一页
    public void expire() throws Exception{
        String path = "d:\\expire.txt";
        File file = new File(path);
        if(!file.exists()){
            file.getParentFile().mkdirs();
        }
        file.createNewFile();
        // write
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        String cookie = PropKit.use("config-dev.txt").get("cookie");
        String url = getPageUrl("11", "X");
        Document doc = util12345.getDoc(url,cookie);
        Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
        for (int i = 0; i < trs.size() - 1; i++) {
            Element in = trs.get(i).getElementsByTag("td").get(0).getElementsByTag("input").get(0);
            String value = in.attr("value");
            String file_guid = "";
            String order_guid = "";
            if (value.substring(9,10).equals("{")){
                file_guid = value.substring(9, 47);
                order_guid = value.substring(53, 91);
            }else{
                file_guid = value.substring(8, 46);
                order_guid = value.substring(51, 89);
            }
            String url2 = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?fileGuid="+file_guid+"&GUID=" +order_guid+ "&IsZDDB=&xxlyid=1";
            Document doc2 = util12345.getDoc(url2,cookie);
            Element tbody = doc2.getElementsByClass("tablebgcolor").get(0).getElementsByTag("tbody").get(0);
            String order_code = tbody.getElementById("HotLineWorkNumber").text();//工单编号
            String link_person = tbody.getElementById("linkPerson").text();//联系人
            String end_date = tbody.getElementById("endDate").text();//办理时限
            String a = "{\"_id\":\"" + order_guid
                    + "\",\"HotLineWorkNumber\":\"" + order_code
                    + "\",\"linkPerson\":\"" + link_person
                    + "\",\"endDate\":\"" + end_date
                    + "\"}\n";
            bw.write(a);
        }
        bw.flush();
        bw.close();
        fw.close();
        renderText("到期工单已生成！");
    }

    public void unhandle() throws Exception{
//        String path = "d:\\unhandle.txt";
//        File file = new File(path);
//        if(!file.exists()){
//            file.getParentFile().mkdirs();
//        }
//        file.createNewFile();
//        // write
//        FileWriter fw = new FileWriter(file, true);
//        BufferedWriter bw = new BufferedWriter(fw);
        String cookie = PropKit.use("config-dev.txt").get("cookie");
        for (int j=1;j<4;j++){
            Document doc = util12345.getPageList(j + "", cookie, "0");
            System.out.println(doc);
            Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
            for (int i = 0; i < trs.size() - 1; i++) {
                Element in = trs.get(i).getElementsByTag("td").get(0).getElementsByTag("input").get(0);
                String value = in.attr("value");
                String file_guid = "";
                String order_guid = "";
                if (value.substring(9,10).equals("{")){
                    file_guid = value.substring(9, 47);
                    order_guid = value.substring(53, 91);
                }else{
                    file_guid = value.substring(8, 46);
                    order_guid = value.substring(51, 89);
                }
                String url2 = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?fileGuid="+file_guid+"&GUID=" +order_guid+ "&IsZDDB=&xxlyid=1";
                Document doc2 = util12345.getDoc(url2,cookie);
                Element tbody = doc2.getElementsByClass("tablebgcolor").get(0).getElementsByTag("tbody").get(0);
                String order_code = tbody.getElementById("HotLineWorkNumber").text();//工单编号
                String link_person = tbody.getElementById("linkPerson").text();//联系人
                String end_date = tbody.getElementById("endDate").text();//办理时限
                String a = "{\"_id\":\"" + order_guid
                        + "\",\"HotLineWorkNumber\":\"" + order_code
                        + "\",\"linkPerson\":\"" + link_person
                        + "\",\"endDate\":\"" + end_date
                        + "\"}\n";
                System.out.println(a);
//                bw.write(a);
            }
            System.out.println("第" + j + "页已完成");
        }
//        bw.flush();
//        bw.close();
//        fw.close();
        renderText("未办理工单已生成！");
    }


}


