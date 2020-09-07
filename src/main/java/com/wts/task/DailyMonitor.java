package com.wts.task;

import com.jfinal.kit.PropKit;
import com.wts.entity.model.*;
import com.wts.service.*;
import com.wts.util.ParamesAPI;
import com.wts.util.oaUtil;
import com.wts.util.util12345;
import me.chanjar.weixin.common.bean.result.WxMediaUploadResult;
import me.chanjar.weixin.cp.api.impl.WxCpServiceImpl;
import me.chanjar.weixin.cp.bean.WxCpMessage;
import me.chanjar.weixin.cp.config.impl.WxCpDefaultConfigImpl;
import org.apache.log4j.Logger;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static com.wts.util.WordUtil.*;
import static com.wts.util.others.IpKit.getLocalHostIP;
import static com.wts.util.util12345.getPageUrl;
import static com.wts.util.wxUtil.*;

public class DailyMonitor implements Runnable {
    private static final String downPath = "D:\\12345\\";
    private static final String path = "D:\\当前下载\\";
    List<Allwork> allworkList = new ArrayList<>();
    List<Reply> replyList = new ArrayList<>();
    List<Fallback> fallbackList = new ArrayList<>();
    private static final Logger logger = Logger.getLogger(DailyMonitor.class);

    @Override
    public void run() {
        String ip = getLocalHostIP();
        String neiwangIP = PropKit.use("config-dev.txt").get("neiwangIP");
        String cookie = PropKit.use("config-dev.txt").get("cookie");
        if (ip.equals(neiwangIP)) {
            allwork(cookie);
            reply(cookie);
            fallback(cookie);
            if (allworkList.size() != 0 || replyList.size() != 0 || fallbackList.size() != 0) {
                try {
                    Boolean network = goWaiWang();
                    if (network) {
                        String weixinToken = getToken();
                        if (!weixinToken.equals("")) {
                            for (Allwork allwork : allworkList) {
                                sendAllwork(allwork, weixinToken);
//                                createAllworkText(allwork);
//                                createUnhandleAddText(allwork);
                            }
                            for (Reply reply : replyList) {
                                sendReply(reply, weixinToken);
//                                createReplyText(reply);
//                                createUnhandleDeleteText(reply.getOrderGuid());
                            }
                            for (Fallback fallback : fallbackList) {
                                sendFallback(fallback, weixinToken);
//                                createFallbackText(fallback);
//                                createUnhandleDeleteText(fallback.getOrderGuid());
                            }
                        }
//                        allworkList.subList(0,allworkList.size()).clear();
                        for (int i = allworkList.size() - 1; i >= 0; i--) {
                            allworkList.remove(i);
                        }
                        for (int i = replyList.size() - 1; i >= 0; i--) {
                            replyList.remove(i);
                        }
                        for (int i = fallbackList.size() - 1; i >= 0; i--) {
                            fallbackList.remove(i);
                        }
                    }
                    goNeiWang();
                } catch (Exception e) {
                    logger.error("切换错误！");
                    e.printStackTrace();
                }
            }
        }
    }

    public void allwork(String cookie) {
        String url = getPageUrl("0", "0");
        Document doc = util12345.getDoc(url, cookie);
        if (doc!=null) {
            Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
            for (int i = 0; i < trs.size() - 1; i++) {
                Element in = trs.get(i).getElementsByTag("td").get(0).getElementsByTag("input").get(0);
                String value = in.attr("value");
                String file_guid, order_guid;
                if (String.valueOf(value.charAt(9)).equals("{")) {
                    file_guid = value.substring(9, 47);
                    order_guid = value.substring(53, 91);
                } else {
                    file_guid = value.substring(8, 46);
                    order_guid = value.substring(51, 89);
                }
                Allwork allwork = getAllwork(file_guid, order_guid, cookie);
                if (allwork != null) {
                    saveAllwork(allwork);
                }
            }
        }
    }

    public Allwork getAllwork(String file_guid, String order_guid, String cookie) {
        String url = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?fileGuid=" + file_guid + "&GUID=" + order_guid + "&IsZDDB=&xxlyid=1";
        try {
            Document doc = util12345.getDoc(url, cookie);
            if (doc==null){
                logger.error("time:" + new Date() + ";doc为空，无法获取allwork工单:"+ url);
                System.out.println("doc为空，无法获取allwork工单：" + url);
                return null;
            }
            Element tbody = doc.getElementsByClass("tablebgcolor").get(0).getElementsByTag("tbody").get(0);
            Element td = tbody.getElementsByTag("tr").get(8).getElementsByTag("td").get(1);
            String enclosure = "";
            if (!td.text().trim().equals("")) {
                enclosure = "请查看附件";
            }
            String order_state = tbody.getElementById("gdzt").text();//工单状态
            String order_code = tbody.getElementById("HotLineWorkNumber").text();//工单编号
            String link_person = tbody.getElementById("linkPerson").text();//联系人
            String link_phone = tbody.getElementById("linkPhone").text();//联系电话
            String link_address = tbody.getElementById("address").text();//联系地址
            String business_environment = tbody.getElementById("yshj").text();//营商环境
//        String new_supervision = tbody.getElementById("isNewDuCha").text();//新版督察
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
//            String txlx = tbody.getElementById("txlx").text();//督办类型---暂无
            String transfer_opinion = tbody.getElementById("remark").text();//转办意见
            String transfer_process = tbody.getElementById("banliFlow").text();//转办流程
            String remark = tbody.getElementById("beizhu").text();//备注
            Allwork allwork = new Allwork();
            allwork.set("file_guid", file_guid)
                    .set("order_guid", order_guid)
                    .set("order_state", order_state)
                    .set("order_code", order_code)
                    .set("link_person", link_person)
                    .set("link_phone", link_phone)
                    .set("link_address", link_address)
                    .set("business_environment", business_environment)
//                .set("new_supervision",new_supervision)
                    .set("accept_person", accept_person)
                    .set("accept_person_code", accept_person_code)
                    .set("accept_channel", accept_channel)
                    .set("handle_type", handle_type)
                    .set("phone_type", phone_type)
                    .set("write_time", write_time)
                    .set("urgency_degree", urgency_degree)
                    .set("problem_classification", problem_classification)
                    .set("is_secret", is_secret)
                    .set("is_reply", is_reply)
                    .set("reply_remark", reply_remark)
                    .set("problem_description", problem_description)
                    .set("send_person", send_person)
                    .set("send_time", send_time)
                    .set("end_date", end_date)
                    .set("transfer_opinion", transfer_opinion)
                    .set("transfer_process", transfer_process)
                    .set("enclosure", enclosure)
                    .set("remark", remark);
            return allwork;
        } catch (Exception e) {
            logger.error("time:" + new Date() + ";无法获取allwork工单:"+ url);
            logger.error(e);
            System.out.println("错误的allwork工单：" + url);
            e.printStackTrace();
            return null;
        }
    }

    public void saveAllwork(Allwork allwork) {
        AllworkService service = new AllworkService();
        if (service.findNumByGUID(allwork.get("order_guid")) == 0) {
            service.add(allwork);
//            String file_guid = allwork.get("file_guid");
            String order_guid = allwork.get("order_guid");
//            String order_state = allwork.get("order_state");
            String order_code = allwork.get("order_code");
            String link_person = allwork.get("link_person");
            String link_phone = allwork.get("link_phone");
            String link_address = allwork.get("link_address");
//            String business_environment = allwork.get("business_environment");
//            String accept_person = allwork.get("accept_person");
            String accept_person_code = allwork.get("accept_person_code");
            String accept_channel = allwork.get("accept_channel");
//            String handle_type = allwork.get("handle_type");
            String phone_type = allwork.get("phone_type");
//            String write_time = allwork.get("write_time");
            String urgency_degree = allwork.get("urgency_degree");
            String problem_classification = allwork.get("problem_classification");
            String is_secret = allwork.get("is_secret");
            String is_reply = allwork.get("is_reply");
            String reply_remark = allwork.get("reply_remark");
            String problem_description = allwork.get("problem_description");
//            String send_person = allwork.get("send_person");
            String send_time = allwork.get("send_time");
            String end_date = allwork.get("end_date");
            String transfer_opinion = allwork.get("transfer_opinion");
            String transfer_process = allwork.get("transfer_process");
//            String remark = allwork.get("remark");
            String enclosure = allwork.get("enclosure");
            Map<String, String> map = new HashMap<>();
            map.put("accept_person_code", accept_person_code);
            map.put("end_date", end_date);
            map.put("order_code", order_code);
            map.put("urgency_degree", urgency_degree);
            map.put("phone_type", phone_type);
            map.put("accept_channel", accept_channel);
            map.put("is_reply", is_reply);
            map.put("is_secret", is_secret);
            map.put("link_person", link_person);
            map.put("link_phone", link_phone);
            map.put("link_address", link_address);
            map.put("reply_remark", reply_remark);
            map.put("problem_classification", problem_classification);
            map.put("problem_description", problem_description);
            map.put("transfer_opinion", transfer_opinion);
            map.put("transfer_process", transfer_process);
            map.put("enclosure", enclosure);
            map.put("order_guid", order_guid);
            map.put("phone_time", service.findNumByPhone(allwork.get("link_phone")));
            LocalDate date = LocalDate.now();
            DateTimeFormatter yyyy = DateTimeFormatter.ofPattern("yyyy");
            DateTimeFormatter MM = DateTimeFormatter.ofPattern("MM");
            DateTimeFormatter dd = DateTimeFormatter.ofPattern("dd");
            String path = "D:\\工单备份\\" + date.format(yyyy) + "\\" + date.format(MM) + "\\" + date.format(dd) + "\\";
            logger.info("allwork工单：" + order_code + "-" + link_person + "-" + send_time);
            System.out.println("allwork工单：" + order_code + "-" + link_person + "-" + send_time);
            String personCode = service.getPersonCode();
            CreatWordByModel("D:\\TemplateDoc" + personCode + ".docx", map, path + order_code + "-" + order_guid + ".docx");
            CreatWordByModel("D:\\TemplateDoc.docx", map, DailyMonitor.path + order_code + "-" + order_guid + ".docx");
            String printerName = PropKit.use("config-dev.txt").get("printer");
//            String printerName = "HP LaserJet 1020";//打印机名包含字串
//            String printerName = "HP LaserJet MFP M227-M231 PCL-6 (V4)";//打印机名包含字串
            printWord(path + order_code + "-" + order_guid + ".docx", printerName);
            allworkList.add(allwork);
        }
    }

    public void sendAllwork(Allwork allwork, String weixinToken) {
        String errcode = addAllwork(weixinToken,
                allwork.get("order_guid"),
                allwork.get("order_code"),
                allwork.get("link_person"),
                allwork.get("link_phone"),
                allwork.get("send_time"),
                allwork.get("urgency_degree"),
                allwork.get("is_secret"),
                allwork.get("is_reply"),
                allwork.get("end_date"),
                allwork.get("problem_description"),
                allwork.get("transfer_opinion"),
                allwork.get("transfer_process"),
                allwork.get("accept_channel"));
        String err = addUnhandle(weixinToken,
                allwork.get("order_guid"),
                allwork.get("order_code"),
                allwork.get("link_person"),
                allwork.get("end_date"));
        String OA_token = oaUtil.getToken();
        String run_id = oaUtil.getRun_id(OA_token);
        String OA_content = oaUtil.getContent(run_id, allwork.get("order_code"), allwork.get("link_person"), allwork.get("end_date"), allwork.get("urgency_degree"), allwork.get("link_phone"),
                allwork.get("problem_description"), allwork.get("transfer_opinion"), allwork.get("transfer_process"), "XXX");
        oaUtil.inputOA(OA_token, OA_content);
        AllworkService service = new AllworkService();
        String phoneTime = service.findNumByPhone(allwork.get("link_phone"));
        sendMessageToWeiXin("收到新工单（" + phoneTime + "次）：" + allwork.get("order_code"), "WangTianShuo");
        if (errcode.equals("0")) {
            logger.info("time:" + new Date() + ";allwork工单已推送：" + allwork.get("order_code") + "-" + allwork.get("link_person"));
            System.out.println("allwork工单已推送：" + allwork.get("order_code") + "-" + allwork.get("link_person"));
        } else {
            logger.error("time:" + new Date() + ";allwork工单推送失败：" + allwork.get("order_code") + "-" + allwork.get("link_person"));
            System.out.println("allwork工单推送失败：" + allwork.get("order_code") + "-" + allwork.get("link_person"));
        }
        if (err.equals("0")) {
            logger.info("time:" + new Date() + ";unhandle工单已推送：" + allwork.get("order_code") + "-" + allwork.get("link_person"));
            System.out.println("unhandle工单已推送：" + allwork.get("order_code") + "-" + allwork.get("link_person"));
        } else {
            logger.error("time:" + new Date() + ";unhandle工单推送失败：" + allwork.get("order_code") + "-" + allwork.get("link_person"));
            System.out.println("unhandle工单推送失败：" + allwork.get("order_code") + "-" + allwork.get("link_person"));
        }
    }

    public void createAllworkText(Allwork allwork){
        Allwork al = new Allwork();
        al.set("order_guid",allwork.get("order_guid"))
                .set("order_code",allwork.get("order_code"))
                .set("link_person",allwork.get("link_person"))
                .set("link_phone",allwork.get("link_phone"))
                .set("send_time",allwork.get("send_time"))
                .set("urgency_degree",allwork.get("urgency_degree"))
                .set("is_secret",allwork.get("is_secret"))
                .set("is_reply",allwork.get("is_reply"))
                .set("end_date",allwork.get("end_date"))
                .set("problem_description",getSubStr(allwork.get("problem_description")))
                .set("transfer_opinion",getSubStr(allwork.get("transfer_opinion")))
                .set("transfer_process",getSubStr(allwork.get("transfer_process")))
                .set("accept_channel",allwork.get("accept_channel"));
        String path = downPath + "allwork.txt";
        File file = new File(path);
        if(!file.exists()){
            file.getParentFile().mkdirs();
        }
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(al.toJson() + "\n");
            bw.flush();
            bw.close();
            fw.close();
        }catch (Exception e){
            System.out.println("创建文件失败：" + path);
        }
    }

    public void reply(String cookie) {
        String url = getPageUrl("201", "1");
        Document doc = util12345.getDoc(url, cookie);
        if (doc!=null) {
            Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
            for (int i = 0; i < trs.size() - 1; i++) {
                Element in = trs.get(i).getElementsByTag("td").get(0).getElementsByTag("input").get(0);
                String value = in.attr("value");
                String file_guid, order_guid;
                if (String.valueOf(value.charAt(9)).equals("{")) {
                    file_guid = value.substring(9, 47);
                    order_guid = value.substring(53, 91);
                } else {
                    file_guid = value.substring(8, 46);
                    order_guid = value.substring(51, 89);
                }
                Reply reply = getReply(file_guid, order_guid, cookie);
                if (reply != null) {
                    saveReply(reply);
                }
            }
        }
        }

    public Reply getReply(String file_guid, String order_guid, String cookie) {
        String url = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?fileGuid=" + file_guid + "&GUID=" + order_guid + "&IsZDDB=&xxlyid=1";
        try {
            Document doc = util12345.getDoc(url, cookie);
            if (doc==null){
                logger.error("time:" + new Date() + ";doc为空，无法获取reply工单:"+ url);
                System.out.println("doc为空，无法获取reply工单：" + url);
                return null;
            }
            Element tbody = doc.getElementsByClass("tablebgcolor").get(0).getElementsByTag("tbody").get(0);
            Element td = tbody.getElementsByTag("tr").get(8).getElementsByTag("td").get(1);
            String enclosure = "";
            if (!td.text().trim().equals("")) {
                enclosure = "请查看附件";
            }
            String order_state = tbody.getElementById("gdzt").text();//工单状态
            String order_code = tbody.getElementById("HotLineWorkNumber").text();//工单编号
            String link_person = tbody.getElementById("linkPerson").text();//联系人
            String link_phone = tbody.getElementById("linkPhone").text();//联系电话
            String link_address = tbody.getElementById("address").text();//联系地址
            String business_environment = tbody.getElementById("yshj").text();//营商环境
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
//            String txlx = tbody.getElementById("txlx").text();//督办类型---暂无
            String transfer_opinion = tbody.getElementById("remark").text();//转办意见
            String transfer_process = tbody.getElementById("banliFlow").text();//转办流程
            String remark = tbody.getElementById("beizhu").text();//备注
            Element table = doc.getElementsByClass("tablebgcolor").get(1).getElementsByTag("tbody").get(0);
            String reply_type = table.getElementsByTag("tr").get(1).getElementsByTag("td").get(2).text();//答复类型
            String finish_time = table.getElementsByTag("tr").get(1).getElementsByTag("td").get(4).text();//预计完成时间
            String reply_satisfy = table.getElementsByTag("tr").get(2).getElementsByTag("td").get(1).text();//答复来电人情况
            String reply_day = table.getElementsByTag("tr").get(2).getElementsByTag("td").get(3).text();//答复时间
            String reply_person = table.getElementsByTag("tr").get(3).getElementsByTag("td").get(1).text();//答复人
            String reply_phone = table.getElementsByTag("tr").get(3).getElementsByTag("td").get(3).text();//答复电话
            String reply_content = table.getElementsByTag("tr").get(4).getElementsByTag("td").get(1).text();//办理情况
            String reply_department = table.getElementsByTag("tr").get(5).getElementsByTag("td").get(1).text();//回复单位
            String reply_time = table.getElementsByTag("tr").get(5).getElementsByTag("td").get(3).text();//回复时间
            String subordinate_department = table.getElementsByTag("tr").get(6).getElementsByTag("td").get(1).text();//下级办理单位
            String if_nodo = table.getElementsByTag("tr").get(7).getElementsByTag("td").get(1).text();//不再办理
            String nodo_reason = table.getElementsByTag("tr").get(8).getElementsByTag("td").get(1).text();//不再办理原因
            String reply_enclosure = table.getElementsByTag("tr").get(9).getElementsByTag("td").get(1).text().substring(0, 0);//附件
            String reply_person2 = table.getElementsByTag("tr").get(10).getElementsByTag("td").get(1).text();//回复联系人
            String reply_phone2 = table.getElementsByTag("tr").get(10).getElementsByTag("td").get(3).text();//回复电话
            Reply reply = new Reply();
            reply.set("order_guid", order_guid)
                    .set("order_state", order_state)
                    .set("order_code", order_code)
                    .set("link_person", link_person)
                    .set("link_phone", link_phone)
                    .set("link_address", link_address)
                    .set("business_environment", business_environment)
                    .set("accept_person", accept_person)
                    .set("accept_person_code", accept_person_code)
                    .set("accept_channel", accept_channel)
                    .set("handle_type", handle_type)
                    .set("phone_type", phone_type)
                    .set("write_time", write_time)
                    .set("urgency_degree", urgency_degree)
                    .set("problem_classification", problem_classification)
                    .set("is_secret", is_secret)
                    .set("is_reply", is_reply)
                    .set("reply_remark", reply_remark)
                    .set("problem_description", problem_description)
                    .set("send_person", send_person)
                    .set("send_time", send_time)
                    .set("end_date", end_date)
                    .set("transfer_opinion", transfer_opinion)
                    .set("transfer_process", transfer_process)
                    .set("enclosure", enclosure)
                    .set("remark", remark)
                    .set("reply_type", reply_type)
                    .set("finish_time", finish_time)
                    .set("reply_satisfy", reply_satisfy)
                    .set("reply_day", reply_day)
                    .set("reply_person", reply_person)
                    .set("reply_phone", reply_phone)
                    .set("reply_content", reply_content)
                    .set("reply_department", reply_department)
                    .set("reply_time", reply_time)
                    .set("subordinate_department", subordinate_department)
                    .set("if_nodo", if_nodo)
                    .set("nodo_reason", nodo_reason)
                    .set("reply_enclosure", reply_enclosure)
                    .set("reply_person2", reply_person2)
                    .set("reply_phone2", reply_phone2);
            return reply;
        } catch (Exception e) {
            logger.error("time:" + new Date() + ";无法获取reply工单:"+ url);
            logger.error(e);
            System.out.println("错误的回复工单：" + url);
            e.printStackTrace();
            return null;
        }
    }

    public void saveReply(Reply reply) {
        ReplyService service = new ReplyService();
        if (service.findNumByGUID(reply.get("order_guid")) == 0) {
//            String order_guid = reply.get("order_guid");
            String order_code = reply.get("order_code");
            String link_person = reply.get("link_person");
            String send_time = reply.get("send_time");
            System.out.println("已回复工单：" + order_code + "-" + link_person + "-" + send_time);
            service.add(reply);
            replyList.add(reply);
        }
    }

    public void sendReply(Reply reply, String weixinToken) {
        String errcode = addReply(weixinToken,
                reply.get("order_guid"),
                reply.get("reply_time"),
                reply.get("reply_person"),
                reply.get("reply_content"),
                reply.get("reply_satisfy"),
                reply.get("order_code"),
                reply.get("link_person"));
        String err = deleteUnhandle(weixinToken,
                reply.get("order_guid"));
        sendMessageToWeiXin("回复工单：" + reply.get("order_code") + "-->" +reply.get("reply_person"), "WangTianShuo");
        if (errcode.equals("0") && err.equals("0")) {
            logger.info("time:" + new Date() + ";reply工单已推送：" + reply.get("order_code") + "-" + reply.get("link_person"));
            System.out.println("reply工单已推送：" + reply.get("order_code") + "-" + reply.get("link_person"));
        } else {
            logger.error("time:" + new Date() + ";reply工单推送失败：" + reply.get("order_code") + "-" + reply.get("link_person"));
            System.out.println("reply工单推送失败：" + reply.get("order_code") + "-" + reply.get("link_person"));
        }

    }

    public void createReplyText(Reply reply){
        Reply re = new Reply();
        re.set("order_guid",reply.get("order_guid"))
                .set("order_code",reply.get("order_code"))
                .set("link_person",reply.get("link_person"))
                .set("reply_time",reply.get("reply_time"))
                .set("reply_person",reply.get("reply_person"))
                .set("reply_content",getSubStr(reply.get("reply_content")))
                .set("reply_satisfy",reply.get("reply_satisfy"));
        String path = downPath + "reply.txt";
        File file = new File(path);
        if(!file.exists()){
            file.getParentFile().mkdirs();
        }
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(re.toJson() + "\n");
            bw.flush();
            bw.close();
            fw.close();
        }catch (Exception e){
            System.out.println("创建文件失败：" + path);
        }
    }

    public void fallback(String cookie) {
        String url = getPageUrl("202", "1");
        Document doc = util12345.getDoc(url, cookie);
        if (doc!=null) {
            Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
            for (int i = 0; i < trs.size() - 1; i++) {
                Element in = trs.get(i).getElementsByTag("td").get(0).getElementsByTag("input").get(0);
                String value = in.attr("value");
                String file_guid, order_guid;
                if (String.valueOf(value.charAt(9)).equals("{")) {
                    file_guid = value.substring(9, 47);
                    order_guid = value.substring(53, 91);
                } else {
                    file_guid = value.substring(8, 46);
                    order_guid = value.substring(51, 89);
                }
                Fallback fallback = getFallback(file_guid, order_guid, cookie);
                if (fallback != null) {
                    saveFallback(fallback);
                }
            }
        }}

    public Fallback getFallback(String file_guid, String order_guid, String cookie) {
        String url = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?fileGuid=" + file_guid + "&GUID=" + order_guid + "&IsZDDB=&xxlyid=1";
        try {
            Document doc = util12345.getDoc(url, cookie);
            if (doc==null){
                logger.error("time:" + new Date() + ";doc为空，无法获取fallback工单:"+ url);
                System.out.println("doc为空，无法获取fallback工单：" + url);
                return null;
            }
            Element tbody = doc.getElementsByClass("tablebgcolor").get(0).getElementsByTag("tbody").get(0);
            Element td = tbody.getElementsByTag("tr").get(8).getElementsByTag("td").get(1);
            String enclosure = "";
            if (!td.text().trim().equals("")) {
                enclosure = "请查看附件";
            }
            Element table = doc.getElementsByClass("tablebgcolor").get(1).getElementsByTag("tbody").get(0);
            String fallback_reason = table.getElementsByTag("tr").get(1).getElementsByTag("td").get(2).text();//回退原因
            String leader_opinions = table.getElementsByTag("tr").get(2).getElementsByTag("td").get(1).text();//领导意见
            String suggestion = table.getElementsByTag("tr").get(3).getElementsByTag("td").get(1).text();//建议
            String fallback_department = table.getElementsByTag("tr").get(4).getElementsByTag("td").get(1).text();//回退部门
            String fallback_time = table.getElementsByTag("tr").get(4).getElementsByTag("td").get(3).text();//回退时间
            String fallback_person = table.getElementsByTag("tr").get(6).getElementsByTag("td").get(1).text();//回退人
            String fallback_phone = table.getElementsByTag("tr").get(6).getElementsByTag("td").get(3).text();//回退联系电话

            String order_state = tbody.getElementById("gdzt").text();//工单状态
            String order_code = tbody.getElementById("HotLineWorkNumber").text();//工单编号
            String link_person = tbody.getElementById("linkPerson").text();//联系人
            String link_phone = tbody.getElementById("linkPhone").text();//联系电话
            String link_address = tbody.getElementById("address").text();//联系地址
            String business_environment = tbody.getElementById("yshj").text();//营商环境
//        String new_supervision = tbody.getElementById("isNewDuCha").text();//新版督察
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
//            String txlx = tbody.getElementById("txlx").text();//督办类型---暂无
            String transfer_opinion = tbody.getElementById("remark").text();//转办意见
            String transfer_process = tbody.getElementById("banliFlow").text();//转办流程
            String remark = tbody.getElementById("beizhu").text();//备注
            Fallback fallback = new Fallback();
            fallback.set("order_guid", order_guid)
                    .set("file_guid", file_guid)
                    .set("order_state", order_state)
                    .set("order_code", order_code)
                    .set("link_person", link_person)
                    .set("link_phone", link_phone)
                    .set("link_address", link_address)
                    .set("business_environment", business_environment)
//                .set("new_supervision",new_supervision)
                    .set("accept_person", accept_person)
                    .set("accept_person_code", accept_person_code)
                    .set("accept_channel", accept_channel)
                    .set("handle_type", handle_type)
                    .set("phone_type", phone_type)
                    .set("write_time", write_time)
                    .set("urgency_degree", urgency_degree)
                    .set("problem_classification", problem_classification)
                    .set("is_secret", is_secret)
                    .set("is_reply", is_reply)
                    .set("reply_remark", reply_remark)
                    .set("problem_description", problem_description)
                    .set("send_person", send_person)
                    .set("send_time", send_time)
                    .set("end_date", end_date)
                    .set("transfer_opinion", transfer_opinion)
                    .set("transfer_process", transfer_process)
                    .set("enclosure", enclosure)
                    .set("remark", remark)
                    .set("fallback_reason", fallback_reason)
                    .set("leader_opinions", leader_opinions)
                    .set("suggestion", suggestion)
                    .set("fallback_department", fallback_department)
                    .set("fallback_time", fallback_time)
                    .set("fallback_person", fallback_person)
                    .set("fallback_phone", fallback_phone);
            return fallback;
        } catch (Exception e) {
            logger.error("time:" + new Date() + ";无法获取fallback工单:"+ url);
            logger.error(e);
            System.out.println("错误的fallback工单：" + url);
            e.printStackTrace();
            return null;
        }
    }

    public void saveFallback(Fallback fallback) {
        FallbackService service = new FallbackService();
        if (service.findNumByGUID(fallback.get("order_guid")) == 0) {
//            String order_guid = fallback.get("order_guid");
            String order_code = fallback.get("order_code");
            String link_person = fallback.get("link_person");
            String send_time = fallback.get("send_time");
            System.out.println("已回退工单：" + order_code + "-" + link_person + "-" + send_time);
            service.add(fallback);
            fallbackList.add(fallback);
        }
    }

    public void sendFallback(Fallback fallback, String weixinToken) {
        String errcode = addFallback(weixinToken,
                fallback.get("order_guid"),
                fallback.get("fallback_time"),
                fallback.get("fallback_person"),
                fallback.get("fallback_reason"),
                fallback.get("suggestion"),
                fallback.get("fallback_department"),
                fallback.get("order_code"),
                fallback.get("link_person"));
        String err = deleteUnhandle(weixinToken,
                fallback.get("order_guid"));
        sendMessageToWeiXin("回退工单：" + fallback.get("order_code") + "-->" + fallback.get("fallback_person"), "WangTianShuo");
        if (errcode.equals("0") && err.equals("0")) {
            logger.info("time:" + new Date() + ";fallback工单已推送：" + fallback.get("order_code") + "-" + fallback.get("link_person"));
            System.out.println("回退工单已推送：" + fallback.get("order_code") + "-" + fallback.get("link_person"));
        } else {
            logger.error("time:" + new Date() + ";allback工单推送失败：" + fallback.get("order_code") + "-" + fallback.get("link_person"));
            System.out.println("回退工单推送失败：" + fallback.get("order_code") + "-" + fallback.get("link_person"));
        }
    }

    public void createFallbackText(Fallback fallback){
        Fallback fall = new Fallback();
        fall.set("order_guid",fallback.get("order_guid"))
                .set("order_code",fallback.get("order_code"))
                .set("link_person",fallback.get("link_person"))
                .set("fallback_time",fallback.get("fallback_time"))
                .set("fallback_person",fallback.get("fallback_person"))
                .set("fallback_reason",getSubStr(fallback.get("fallback_reason")))
                .set("suggestion",getSubStr(fallback.get("suggestion")))
                .set("fallback_department",fallback.get("fallback_department"));
        String path = downPath + "fallback.txt";
        File file = new File(path);
        if(!file.exists()){
            file.getParentFile().mkdirs();
        }
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(fall.toJson() + "\n");
            bw.flush();
            bw.close();
            fw.close();
        }catch (Exception e){
            System.out.println("创建文件失败：" + path);
        }
    }

    public void createUnhandleAddText(Allwork allwork){
        Allwork al = new Allwork();
        al.set("order_guid",allwork.get("order_guid"))
                .set("order_code",allwork.get("order_code"))
                .set("link_person",allwork.get("link_person"))
                .set("end_date",allwork.get("end_date"));
        String path = downPath + "unhandleAdd.txt";
        File file = new File(path);
        if(!file.exists()){
            file.getParentFile().mkdirs();
        }
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(al.toJson() + "\n");
            bw.flush();
            bw.close();
            fw.close();
        }catch (Exception e){
            System.out.println("创建文件失败：" + path);
        }
    }

    public void createUnhandleDeleteText(String order_guid){
        Allwork al = new Allwork();
        al.set("order_guid",order_guid);
        String path = downPath + "unhandleDelete.txt";
        File file = new File(path);
        if(!file.exists()){
            file.getParentFile().mkdirs();
        }
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(al.toJson() + "\n");
            bw.flush();
            bw.close();
            fw.close();
        }catch (Exception e){
            System.out.println("创建文件失败：" + path);
        }
    }

    public void sendFileToWeiXin(String filaPath, String UserID) {
        try {
            WxCpDefaultConfigImpl config = new WxCpDefaultConfigImpl();
            config.setCorpId(ParamesAPI.corpId);      // 设置微信企业号的appid
            config.setCorpSecret(ParamesAPI.secret);  // 设置微信企业号的app corpSecret
            config.setAgentId(ParamesAPI.agentId);     // 设置微信企业号应用ID
            config.setToken(ParamesAPI.token);       // 设置微信企业号应用的token
            config.setAesKey(ParamesAPI.encodingAESKey);      // 设置微信企业号应用的EncodingAESKey
            WxCpServiceImpl wxCpService = new WxCpServiceImpl();
            wxCpService.setWxCpConfigStorage(config);
            File file = new File(filaPath);
            WxMediaUploadResult res = wxCpService.getMediaService().upload("file", file);
            WxCpMessage message = WxCpMessage
                    .FILE()
                    .toUser(UserID)
                    .agentId(ParamesAPI.agentId)
                    .mediaId(res.getMediaId())
                    .build();
            wxCpService.messageSend(message);
        } catch (Exception e) {
            logger.error("time:" + new Date() + ";推送企业微信失败:"+ filaPath);
            System.out.println("推送企业微信失败：" + filaPath);
        }
    }

    public void sendMessageToWeiXin(String msgContent, String UserID) {
        try {
            WxCpDefaultConfigImpl config = new WxCpDefaultConfigImpl();
            config.setCorpId(ParamesAPI.corpId);      // 设置微信企业号的appid
            config.setCorpSecret(ParamesAPI.secret);  // 设置微信企业号的app corpSecret
            config.setAgentId(ParamesAPI.agentId);     // 设置微信企业号应用ID
            config.setToken(ParamesAPI.token);       // 设置微信企业号应用的token
            config.setAesKey(ParamesAPI.encodingAESKey);      // 设置微信企业号应用的EncodingAESKey
            WxCpServiceImpl wxCpService = new WxCpServiceImpl();
            wxCpService.setWxCpConfigStorage(config);
            WxCpMessage message = WxCpMessage
                    .TEXT()
                    .agentId(ParamesAPI.agentId)
                    .toUser(UserID)
                    .content(msgContent)
                    .build();
            wxCpService.messageSend(message);
        } catch (Exception e) {
            logger.error("time:" + new Date() + ";推送企业微信失败:"+ msgContent);
            System.out.println("推送企业微信失败：" + msgContent);
        }
    }

}
