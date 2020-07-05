package com.wts.controller;

import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.jfinal.kit.PropKit;
import com.wts.entity.model.Reply;
import com.wts.service.FallbackService;
import com.wts.service.ReplyService;
import com.wts.util.util12345;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static com.wts.util.WordUtil.getUrgencyDegree;
import static com.wts.util.util12345.*;
import static com.wts.util.util12345.getDoc;

public class ReplyController extends Controller {

	@Inject
	ReplyService service;

	public void index() {
		renderText("已回复工单");
	}

	public void get() {
		Reply entity = service.findByGUID(getPara("GUID"));
		setSessionAttr("entity", entity);
		render("/detail.html");
	}

	public void b(){
		String url = getPageUrl("201", "1");
		String cookie = PropKit.use("config-dev.txt").get("cookie");
		Document doc = getDoc(url, cookie);
		Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
		FallbackService service = new FallbackService();
		for (int i = 0; i < trs.size() - 1; i++) {
			Elements ins = trs.get(i).getElementsByTag("td");
			String file_guid = ins.get(0).getElementsByTag("input").get(0).attr("value").substring(9, 47);
			String order_guid = ins.get(0).getElementsByTag("input").get(0).attr("value").substring(53, 91);
			String order_code = ins.get(1).text().replace("&nbsp;", "");
			if (service.findNumByGUID(order_guid)==0){
				String urls = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?fileGuid="+file_guid+"&GUID=" +order_guid+ "&IsZDDB=&xxlyid=1";
				Document doc1 = getDoc(urls,cookie);
				Element tbody = doc1.getElementsByClass("tablebgcolor").get(0).getElementsByTag("tbody").get(0);
				Element td = tbody.getElementsByTag("tr").get(8).getElementsByTag("td").get(1);
				String enclosure = "";
				if (!td.text().trim().equals("")){
					enclosure = "请查看附件";
				}
				String order_state = tbody.getElementById("gdzt").text();//工单状态
//				String order_code = tbody.getElementById("HotLineWorkNumber").text();//工单编号
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
				String txlx = tbody.getElementById("txlx").text();//督办类型---暂无
				String transfer_opinion = tbody.getElementById("remark").text();//转办意见
				String transfer_process = tbody.getElementById("banliFlow").text();//转办流程
				String remark = tbody.getElementById("beizhu").text();//备注
				Element table = doc1.getElementsByClass("tablebgcolor").get(1).getElementsByTag("tbody").get(0);
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
				String reply_enclosure = table.getElementsByTag("tr").get(9).getElementsByTag("td").get(1).text();//附件
				String reply_person2 = table.getElementsByTag("tr").get(10).getElementsByTag("td").get(1).text();//回复联系人
				String reply_phone2 = table.getElementsByTag("tr").get(10).getElementsByTag("td").get(3).text();//回复电话
				Reply reply = new Reply();
				reply.set("order_guid",order_guid)
						.set("file_guid",file_guid)
						.set("order_state",order_state)
						.set("order_code",order_code)
						.set("link_person",link_person)
						.set("link_phone",link_phone)
						.set("link_address",link_address)
						.set("business_environment",business_environment)
//                .set("new_supervision",new_supervision)
						.set("accept_person",accept_person)
						.set("accept_person_code",accept_person_code)
						.set("accept_channel",accept_channel)
						.set("handle_type",handle_type)
						.set("phone_type",phone_type)
						.set("write_time",write_time)
						.set("urgency_degree",urgency_degree)
						.set("problem_classification",problem_classification)
						.set("is_secret",is_secret)
						.set("is_reply",is_reply)
						.set("reply_remark",reply_remark)
						.set("problem_description",problem_description)
						.set("send_person",send_person)
						.set("send_time",send_time)
						.set("end_date",end_date)
						.set("transfer_opinion",transfer_opinion)
						.set("transfer_process",transfer_process)
						.set("enclosure",enclosure)
						.set("remark",remark)
						.set("reply_type",reply_type)
						.set("finish_time",finish_time)
						.set("reply_satisfy",reply_satisfy)
						.set("reply_day",reply_day)
						.set("reply_person",reply_person)
						.set("reply_phone",reply_phone)
						.set("reply_content",reply_content)
						.set("reply_department",reply_department)
						.set("reply_time",reply_time)
						.set("subordinate_department",subordinate_department)
						.set("if_nodo",if_nodo)
						.set("nodo_reason",nodo_reason)
						.set("reply_enclosure",reply_enclosure)
						.set("reply_person2",reply_person2)
						.set("reply_phone2",reply_phone2)
						.save();
			}
		}
//        for (int i=2;i<7;i++){
//            getPage(i,cookie);
//        }
        for (int i=2;i<24;i++){
            getPage2(i,cookie);
        }
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
			Element td = tbody.getElementsByTag("tr").get(8).getElementsByTag("td").get(1);
			String enclosure = "";
			if (!td.text().trim().equals("")){
				enclosure = "请查看附件";
			}
			String order_state = tbody.getElementById("gdzt").text();//工单状态
//			String order_code = tbody.getElementById("HotLineWorkNumber").text();//工单编号
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
			String txlx = tbody.getElementById("txlx").text();//督办类型---暂无
			String transfer_opinion = tbody.getElementById("remark").text();//转办意见
			String transfer_process = tbody.getElementById("banliFlow").text();//转办流程
			String remark = tbody.getElementById("beizhu").text();//备注
			Element table = doc1.getElementsByClass("tablebgcolor").get(1).getElementsByTag("tbody").get(0);
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
			String reply_enclosure = table.getElementsByTag("tr").get(9).getElementsByTag("td").get(1).text();//附件
			String reply_person2 = table.getElementsByTag("tr").get(10).getElementsByTag("td").get(1).text();//回复联系人
			String reply_phone2 = table.getElementsByTag("tr").get(10).getElementsByTag("td").get(3).text();//回复电话
			Reply reply = new Reply();
			reply.set("order_guid",order_guid)
					.set("file_guid",file_guid)
					.set("order_state",order_state)
					.set("order_code",order_code)
					.set("link_person",link_person)
					.set("link_phone",link_phone)
					.set("link_address",link_address)
					.set("business_environment",business_environment)
//                .set("new_supervision",new_supervision)
					.set("accept_person",accept_person)
					.set("accept_person_code",accept_person_code)
					.set("accept_channel",accept_channel)
					.set("handle_type",handle_type)
					.set("phone_type",phone_type)
					.set("write_time",write_time)
					.set("urgency_degree",urgency_degree)
					.set("problem_classification",problem_classification)
					.set("is_secret",is_secret)
					.set("is_reply",is_reply)
					.set("reply_remark",reply_remark)
					.set("problem_description",problem_description)
					.set("send_person",send_person)
					.set("send_time",send_time)
					.set("end_date",end_date)
					.set("transfer_opinion",transfer_opinion)
					.set("transfer_process",transfer_process)
					.set("enclosure",enclosure)
					.set("remark",remark)
					.set("reply_type",reply_type)
					.set("finish_time",finish_time)
					.set("reply_satisfy",reply_satisfy)
					.set("reply_day",reply_day)
					.set("reply_person",reply_person)
					.set("reply_phone",reply_phone)
					.set("reply_content",reply_content)
					.set("reply_department",reply_department)
					.set("reply_time",reply_time)
					.set("subordinate_department",subordinate_department)
					.set("if_nodo",if_nodo)
					.set("nodo_reason",nodo_reason)
					.set("reply_enclosure",reply_enclosure)
					.set("reply_person2",reply_person2)
					.set("reply_phone2",reply_phone2)
					.save();
		}
	}
	//    7页以后用这个
	public void getPage2(Integer pageNum, String cookie) {
		System.out.println(pageNum);
		Document doc = getDoc2(pageNum+"", cookie, "201");
		Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
		for (int i = 0; i < trs.size() - 1; i++) {
			Elements ins = trs.get(i).getElementsByTag("td");
			String file_guid = "";
			String order_guid = "";
			String vv = ins.get(0).getElementsByTag("input").get(0).attr("value");
			if (vv.substring(9,10).equals("{")){
				file_guid = vv.substring(9,47);
				order_guid = vv.substring(53,91);
			}else{
				file_guid = "{" + vv.substring(9, 46) + "}";
				if (vv.substring(51,52).equals("{")){
					order_guid = vv.substring(51,89);
				}else{
					order_guid = "{" + vv.substring(51, 88) + "}";
				}
			}
//
//			file_guid = ins.get(0).getElementsByTag("input").get(0).attr("value").substring(9, 47);
//			order_guid = ins.get(0).getElementsByTag("input").get(0).attr("value").substring(53, 91);

			String order_code = ins.get(1).text().replace("&nbsp;", "");
			String urls = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?fileGuid="+file_guid+"&GUID=" +order_guid+ "&IsZDDB=&xxlyid=1";
			Document doc1 = getDoc(urls,cookie);

			Element tbody = doc1.getElementsByClass("tablebgcolor").get(0).getElementsByTag("tbody").get(0);
			Element td = tbody.getElementsByTag("tr").get(8).getElementsByTag("td").get(1);
			String enclosure = "";
			if (!td.text().trim().equals("")){
				enclosure = "请查看附件";
			}
			String order_state = tbody.getElementById("gdzt").text();//工单状态
//			String order_code = tbody.getElementById("HotLineWorkNumber").text();//工单编号
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
			String txlx = tbody.getElementById("txlx").text();//督办类型---暂无
			String transfer_opinion = tbody.getElementById("remark").text();//转办意见
			String transfer_process = tbody.getElementById("banliFlow").text();//转办流程
			String remark = tbody.getElementById("beizhu").text();//备注
			String reply_type = "";
			String finish_time = "";
			String reply_satisfy = "";
			String reply_day = "";
			String reply_person = "";
			String reply_phone = "";
			String reply_content = "";
			String reply_department = "";
			String reply_time = "";
			String subordinate_department = "";
			String if_nodo = "";
			String nodo_reason = "";
			String reply_enclosure = "";
			String reply_person2 = "";
			String reply_phone2 = "";
			if (doc1.getElementsByClass("tablebgcolor").size()==2){
				Element table = doc1.getElementsByClass("tablebgcolor").get(1).getElementsByTag("tbody").get(0);
				if (table.getElementsByTag("tr").get(1).getElementsByTag("td").get(0).text().equals("部门回退")){
					reply_type = table.getElementsByTag("tr").get(7).getElementsByTag("td").get(2).text();//答复类型
					finish_time = table.getElementsByTag("tr").get(7).getElementsByTag("td").get(4).text();//预计完成时间
					reply_satisfy = table.getElementsByTag("tr").get(8).getElementsByTag("td").get(1).text();//答复来电人情况
					reply_day = table.getElementsByTag("tr").get(8).getElementsByTag("td").get(3).text();//答复时间
					reply_person = table.getElementsByTag("tr").get(9).getElementsByTag("td").get(1).text();//答复人
					reply_phone = table.getElementsByTag("tr").get(9).getElementsByTag("td").get(3).text();//答复电话
					reply_content = table.getElementsByTag("tr").get(10).getElementsByTag("td").get(1).text();//办理情况
					reply_department = table.getElementsByTag("tr").get(11).getElementsByTag("td").get(1).text();//回复单位
					reply_time = table.getElementsByTag("tr").get(11).getElementsByTag("td").get(3).text();//回复时间
					subordinate_department = table.getElementsByTag("tr").get(12).getElementsByTag("td").get(1).text();//下级办理单位
					if_nodo = table.getElementsByTag("tr").get(13).getElementsByTag("td").get(1).text();//不再办理
					nodo_reason = table.getElementsByTag("tr").get(14).getElementsByTag("td").get(1).text();//不再办理原因
					reply_enclosure = table.getElementsByTag("tr").get(15).getElementsByTag("td").get(1).text();//附件
					reply_person2 = table.getElementsByTag("tr").get(16).getElementsByTag("td").get(1).text();//回复联系人
					reply_phone2 = table.getElementsByTag("tr").get(16).getElementsByTag("td").get(3).text();//回复电话
				}else{
					reply_type = table.getElementsByTag("tr").get(1).getElementsByTag("td").get(2).text();//答复类型
					finish_time = table.getElementsByTag("tr").get(1).getElementsByTag("td").get(4).text();//预计完成时间
					reply_satisfy = table.getElementsByTag("tr").get(2).getElementsByTag("td").get(1).text();//答复来电人情况
					reply_day = table.getElementsByTag("tr").get(2).getElementsByTag("td").get(3).text();//答复时间
					reply_person = table.getElementsByTag("tr").get(3).getElementsByTag("td").get(1).text();//答复人
					reply_phone = table.getElementsByTag("tr").get(3).getElementsByTag("td").get(3).text();//答复电话
					reply_content = table.getElementsByTag("tr").get(4).getElementsByTag("td").get(1).text();//办理情况
					reply_department = table.getElementsByTag("tr").get(5).getElementsByTag("td").get(1).text();//回复单位
					reply_time = table.getElementsByTag("tr").get(5).getElementsByTag("td").get(3).text();//回复时间
					subordinate_department = table.getElementsByTag("tr").get(6).getElementsByTag("td").get(1).text();//下级办理单位
					if_nodo = table.getElementsByTag("tr").get(7).getElementsByTag("td").get(1).text();//不再办理
					nodo_reason = table.getElementsByTag("tr").get(8).getElementsByTag("td").get(1).text();//不再办理原因
					reply_enclosure = table.getElementsByTag("tr").get(9).getElementsByTag("td").get(1).text();//附件
					reply_person2 = table.getElementsByTag("tr").get(10).getElementsByTag("td").get(1).text();//回复联系人
					reply_phone2 = table.getElementsByTag("tr").get(10).getElementsByTag("td").get(3).text();//回复电话
				}
			}
			String pd = "";
			if (problem_description.length()>5000){
				pd = problem_description.substring(0,4999);
			}
			Reply reply = new Reply();
			reply.set("order_guid",order_guid)
					.set("file_guid",file_guid)
					.set("order_state",order_state)
					.set("order_code",order_code)
					.set("link_person",link_person)
					.set("link_phone",link_phone)
					.set("link_address",link_address)
					.set("business_environment",business_environment)
//                .set("new_supervision",new_supervision)
					.set("accept_person",accept_person)
					.set("accept_person_code",accept_person_code)
					.set("accept_channel",accept_channel)
					.set("handle_type",handle_type)
					.set("phone_type",phone_type)
					.set("write_time",write_time)
					.set("urgency_degree",urgency_degree)
					.set("problem_classification",problem_classification)
					.set("is_secret",is_secret)
					.set("is_reply",is_reply)
					.set("reply_remark",reply_remark)
					.set("problem_description",pd)
					.set("send_person",send_person)
					.set("send_time",send_time)
					.set("end_date",end_date)
					.set("transfer_opinion",transfer_opinion)
					.set("transfer_process",transfer_process)
					.set("enclosure",enclosure)
					.set("remark",remark)
					.set("reply_type",reply_type)
					.set("finish_time",finish_time)
					.set("reply_satisfy",reply_satisfy)
					.set("reply_day",reply_day)
					.set("reply_person",reply_person)
					.set("reply_phone",reply_phone)
					.set("reply_content",reply_content)
					.set("reply_department",reply_department)
					.set("reply_time",reply_time)
					.set("subordinate_department",subordinate_department)
					.set("if_nodo",if_nodo)
					.set("nodo_reason",nodo_reason)
					.set("reply_enclosure",reply_enclosure)
					.set("reply_person2",reply_person2)
					.set("reply_phone2",reply_phone2)
					.save();
		}
	}

	public static void main(String[] args) {
		String urls = "http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?fileGuid={d901a0bd-ab3f-4561-8aa3-1887d2b4e08d}&GUID={a846085e-ea93-480f-a23f-a6fcf7221140}&IsZDDB=&xxlyid=1";
		String cookie = PropKit.use("config-dev.txt").get("cookie");
		Document doc1 = getDoc(urls,cookie);
		Element table = doc1.getElementsByClass("tablebgcolor").get(1).getElementsByTag("tbody").get(0);
		System.out.println(table);
		System.out.println(table.getElementsByTag("tr").get(1).getElementsByTag("td").get(0).text());
		System.out.println(table.getElementsByTag("tr").get(7).getElementsByTag("td").get(0).text());
	}
}


