package com.wts.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.xwpf.usermodel.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.*;

import static com.wts.util.listStr.detailstr;

public class getDetail {
    String Cookie = "jn.gov.cn=UserID=GVl7MZ9hnbtfzpPrOq3B9A==&UserPass=bXnKpxw85yw=&ADGuid=HP79/4nMJ6xJ9s+VHA4+I5fM/D3BpZvY79O9dyE2cvkvhUuktBvziQ==&UserName=LKgasW++KiD/0oOuF4OIoAmaekB6iJy4OiygaTn++HU=&TicketData=y/cmJRNtGBo=; ASP.NET_SessionId=z3t3ex55pbrxqdbs0ax4wi2x; .jhoa=5C9673E54F11C7AC138D727DDEA15BC48342C00336FF58F4D716880FC4838B5610B73D993D586971EB877DAFAE76B30F37C4DC3C5FDD6478A3F37475F64A7E9A6F2B474BA8ADB71536C1660349DDFEC7325F07518689162D2F4C02DD001982128F1BF92576B098ED92F1551DE4E19091283808D6C1CD2083955992A41B484A2145AD789F426FF232E72B7F9A42950A9BEA5296D9";

    public static void gD(String Cookie) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("http://15.1.0.24/jhoa_huaiyinqu/taskhotline/listTaskHotLine.aspx?MessageType=0&issend=0")
                .method("GET", null)
                .addHeader("Accept", "text/html, application/xhtml+xml, image/jxr, */*")
                .addHeader("Accept-Encoding", "gzip, deflate")
                .addHeader("Accept-Language", "zh-Hans-CN, zh-Hans; q=0.5")
                .addHeader("Connection", "Keep-Alive")
                .addHeader("Cookie", Cookie)
                .addHeader("Host", "15.1.0.24")
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; rv:11.0) like Gecko Core/1.70.3756.400 QQBrowser/10.5.4039.400")
                .build();
        Response response = client.newCall(request).execute();
        Document doc = Jsoup.parse(response.body().string());
        Element tbody = doc.getElementsByClass("tablebgcolor").get(0).getElementsByTag("tbody").get(0);
        String order_state = tbody.getElementById("gdzt").text();//工单状态
        String order_code = tbody.getElementById("HotLineWorkNumber").text();//工单编号
        String link_person = tbody.getElementById("linkPerson").text();//联系人
        String link_phone = tbody.getElementById("linkPhone").text();//联系电话
        String link_address = tbody.getElementById("address").text();//联系地址
        String business_environment = tbody.getElementById("yshj").text();//营商环境
        String new_supervision = tbody.getElementById("isNewDuCha").text();//新版督察
        String accept_person = tbody.getElementById("acceptPerson").text();//受理人员
        String accept_person_code = tbody.getElementById("hwyId").text();//受理员编号
        String accept_channel = tbody.getElementById("xxlyId").text();//受理渠道
        String handle_type = tbody.getElementById("sllx").text();//办理类型
        String phone_type = tbody.getElementById("ldlbid").text();//来电类别
        String write_time = tbody.getElementById("writeTime").text();//录入时间
        String urgency_degree = getUrgencyDegree(tbody.getElementById("urgencyDegree"));//紧急程度
        String problem_classification = tbody.getElementById("quesTypeInfo").text();//问题分类
        String is_secret = tbody.getElementById("isSecret").text();//是否保密
        String is_reply = tbody.getElementById("isReply").text();//是否回复
        String reply_remark = tbody.getElementById("hfdh").text();//回复备注
        String problem_description = tbody.getElementById("content").text();//问题描述
        String send_person = tbody.getElementById("sendPerson").text();//发送人
        String send_time = tbody.getElementById("sendTime").text();//发送时间
        String end_date = tbody.getElementById("endDate").text();//办理时限
        String txlx = tbody.getElementById("txlx").text();//督办类型---暂无
        String transfer_opinion = tbody.getElementById("remark").text();//转办意见
        String transfer_process = tbody.getElementById("banliFlow").text();//转办流程
        String remark = tbody.getElementById("beizhu").text();//备注
    }
    public static String getUrgencyDegree(Element element){
        Elements elements = element.getElementsByTag("option");
        for (Element e:elements){
            if (e.attr("selected").equals("selected")){
                return e.text();
            }
        }
        return "";
    }

    public static void ggg() throws Exception {
        Document doc = Jsoup.parse(detailstr);
        Element tbody = doc.getElementsByClass("tablebgcolor").get(0).getElementsByTag("tbody").get(0);
        String order_state = tbody.getElementById("gdzt").text();//工单状态
        String order_code = tbody.getElementById("HotLineWorkNumber").text();//工单序号
        String link_person = tbody.getElementById("linkPerson").text();//联系人
        String link_phone = tbody.getElementById("linkPhone").text();//联系电话
        String link_address = tbody.getElementById("address").text();//联系地址
        String business_environment = tbody.getElementById("yshj").text();//营商环境
        String new_supervision = tbody.getElementById("isNewDuCha").text();//新版督察
        String accept_person = tbody.getElementById("acceptPerson").text();//受理人员
        String accept_person_code = tbody.getElementById("hwyId").text();//受理员编号
        String accept_channel = tbody.getElementById("xxlyId").text();//受理渠道
        String handle_type = tbody.getElementById("sllx").text();//办理类型
        String phone_type = tbody.getElementById("ldlbid").text();//来电类别
        String write_time = tbody.getElementById("writeTime").text();//录入时间
        String urgency_degree = getUrgencyDegree(tbody.getElementById("urgencyDegree"));//紧急程度
        String problem_classification = tbody.getElementById("quesTypeInfo").text();//问题分类
        String is_secret = tbody.getElementById("isSecret").text();//是否保密
        String is_reply = tbody.getElementById("isReply").text();//是否回复
        String reply_remark = tbody.getElementById("hfdh").text();//回复备注
        String problem_description = tbody.getElementById("content").text();//问题描述
        String send_person = tbody.getElementById("sendPerson").text();//发送人
        String send_time = tbody.getElementById("sendTime").text();//发送时间
        String end_date = tbody.getElementById("endDate").text();//办理时限
        String txlx = tbody.getElementById("txlx").text();//督办类型---暂无
        String transfer_opinion = tbody.getElementById("remark").text();//转办意见
        String transfer_process = tbody.getElementById("banliFlow").text();//转办流程
        String remark = tbody.getElementById("beizhu").text();//备注

        System.out.println(order_state);
        System.out.println(order_code);
        System.out.println(link_person);
        System.out.println(link_phone);
        System.out.println(link_address);
        System.out.println(business_environment);
        System.out.println(new_supervision);
        System.out.println(accept_person);
        System.out.println(accept_person_code);
        System.out.println(accept_channel);
        System.out.println(handle_type);
        System.out.println(phone_type);
        System.out.println(write_time);
        System.out.println(urgency_degree);
        System.out.println(problem_classification);
        System.out.println(is_secret);
        System.out.println(is_reply);
        System.out.println(reply_remark);
        System.out.println(problem_description);
        System.out.println(send_person);
        System.out.println(send_time);
        System.out.println(end_date);
        System.out.println(txlx);
        System.out.println(transfer_opinion);
        System.out.println(transfer_process);
        System.out.println(remark);
        Map<String, String> map = new HashMap<String, String>();
        map.put("${accept_person_code}",accept_person_code);
        map.put("${end_date}",end_date);
        map.put("${order_code}",order_code);
        map.put("${urgency_degree}",urgency_degree);
        map.put("${phone_type}",phone_type);
        map.put("${accept_channel}",accept_channel);
        map.put("${is_reply}",is_reply);
        map.put("${is_secret}",is_secret);
        map.put("${link_person}",link_person);
        map.put("${link_phone}",link_phone);
        map.put("${link_address}",link_address);
        map.put("${reply_remark}",reply_remark);
        map.put("${problem_classification}",problem_classification);
        map.put("${problem_description}",problem_description);
        map.put("${transfer_opinion}",transfer_opinion);
        map.put("${transfer_process}",transfer_process);
        CreatWordByModel("D:\\TemplateDoc.docx", map, "D:\\TemplateDoc1.docx");

    }

    public static void CreatWordByModel(String  tmpFile, Map<String, String> contentMap, String exportFile) throws Exception{
        InputStream in = null;
        in = new FileInputStream(new File(tmpFile));
        XWPFDocument document = null;
        document = new XWPFDocument (in);
        replaceInTable(document, contentMap);
        //导出到文件
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            document.write((OutputStream)byteArrayOutputStream);
            OutputStream outputStream = new FileOutputStream(exportFile);
            outputStream.write(byteArrayOutputStream.toByteArray());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) throws Exception {
//        XWPFDocument document = new XWPFDocument(new FileInputStream("D:\\Test\\word\\test.docx"));
        ggg();
//        Map map=new HashMap();
//        map.put("name","刁某某");
//        map.put("age","24");
//        map.put("sex","男");
//        CreatWordByModel("G:/docModel.doc",map,"G:/downWord.doc");

    }
    /*
     * 替换表格里面的变量
     * @param doc 要替换的文档
     * @param params 参数
     */
    public static void replaceInTable(XWPFDocument doc, Map<String, String> map){
        Iterator<XWPFTable> iterator = doc.getTablesIterator();
        XWPFTable table;
        XWPFTableRow row;
        List<XWPFTableCell> cells;
        List<XWPFParagraph> paras;
        while(iterator.hasNext()){
            table = iterator.next();//获取每一个table
            int count = table.getNumberOfRows();
            for(int i=0;i<count;i++){
                row = table.getRow(i);
                cells = row.getTableCells();
                for(XWPFTableCell cell : cells){
                    paras = cell.getParagraphs();
                    for(XWPFParagraph para : paras){
                        replaceInPara(para, map);
                    }
                }
            }
        }
    }

    /*
     * 替换文档里面的变量
     * @param doc 要替换的文档
     * @param params 参数
     */
    public static void replaceInPara(XWPFDocument doc, Map<String, String> map){
        Iterator<XWPFParagraph> iterator = doc.getParagraphsIterator();
        XWPFParagraph para;
        while(iterator.hasNext()){
            para = iterator.next();
            /*
             * 此处获取段落的时候有四个
             *  XX报告
             * 	报告日期：${reportDate}
             *  报告内容：
             *  (此处由于是表格所以为空)
             */
            replaceInPara(para, map);
        }
    }

    /*
     * 替换段落里面的变量(被上面的方法调用)
     * @param doc 要替换的段落
     * @param params 参数
     */
    public static void replaceInPara(XWPFParagraph para, Map<String, String> map){
        List<XWPFRun> runs = para.getRuns();
        for(XWPFRun run : runs){
            String oneparaString = run.getText(run.getTextPosition());
            if(StringUtils.isBlank(oneparaString)){
                continue;
            }
            for(Map.Entry<String, String> entry : map.entrySet()){
                if(entry.getValue() != null){
                    oneparaString = oneparaString.replace(entry.getKey(), entry.getValue());
                }
            }
            run.setText(oneparaString, 0);
        }
    }

    /*
     * 关闭输入流
     */
    public static void close(InputStream is){
        if(is != null){
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * 关闭输出流
     */
    public static void close(OutputStream os){
        if(os != null){
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
