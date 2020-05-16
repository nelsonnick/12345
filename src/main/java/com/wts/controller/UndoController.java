package com.wts.controller;

import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.wts.entity.model.Undo;
import com.wts.service.UndoService;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import static com.wts.util.WordUtil.*;

public class UndoController extends Controller {

	@Inject
	UndoService service;

	public void index() throws Exception {
		LocalDate date = LocalDate.now();
		DateTimeFormatter yyyy = DateTimeFormatter.ofPattern("yyyy");
		DateTimeFormatter MM = DateTimeFormatter.ofPattern("MM");
		DateTimeFormatter dd = DateTimeFormatter.ofPattern("dd");
		String Cookie = "jn.gov.cn=UserID=GVl7MZ9hnbtfzpPrOq3B9A==&UserPass=bXnKpxw85yw=&ADGuid=HP79/4nMJ6xJ9s+VHA4+I5fM/D3BpZvY79O9dyE2cvkvhUuktBvziQ==&UserName=LKgasW++KiD/0oOuF4OIoAmaekB6iJy4OiygaTn++HU=&TicketData=y/cmJRNtGBo=; ASP.NET_SessionId=w0jaj455nitxwcy23ksduh55; .jhoa=B306F3F495EA0FD04FF9B817B233D49266F2602D6B125520CB820C9F09B407E72900C49A0CF34F50BEA06CF285CEF07FD226CDC1C6CAC5840B1A018B421AC202930C88C924B562D3101A07762F53187C8A1195E6C1C7B8CFEB0D2FE48DD9DCEF67C25A5A4C33692BBD13EDB9242906F488B38F9D30C89871C871ADED128EAFD36D6A9BC8161C78E6917A6EBBB667FDCF5ADD1222";
		OkHttpClient client = new OkHttpClient().newBuilder()
				.build();
		Request request = new Request.Builder()
				.url("http://15.1.0.24/jhoa_huaiyinqu/taskhotline/listTaskHotLine.aspx?MessageType=0&issend=0")
				.method("GET", null)
				.addHeader("Accept", "text/html, application/xhtml+xml, image/jxr, */*")
//				.addHeader("Accept-Encoding", "gzip, deflate")
				.addHeader("Accept-Language", "zh-Hans-CN, zh-Hans; q=0.5")
				.addHeader("Connection", "Keep-Alive")
				.addHeader("Cookie", Cookie)
				.addHeader("Host", "15.1.0.24")
				.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; rv:11.0) like Gecko Core/1.70.3756.400 QQBrowser/10.5.4039.400")
				.build();
		Response response = client.newCall(request).execute();
		Document doc = Jsoup.parse(response.body().string());
		Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
		for (int i = 0; i < trs.size() - 1; i++) {
			Element in = trs.get(i).getElementsByTag("td").get(0).getElementsByTag("input").get(0);
			String value = in.attr("value");
			String GUID = value.substring(5, 43);
			OkHttpClient client2 = new OkHttpClient().newBuilder()
					.build();
			Request request2 = new Request.Builder()
					.url("http://15.1.0.24/jhoa_huaiyinqu/taskhotline/ViewTaskHotLine.aspx?GUID=" +GUID+ "&IsZDDB=&")
					.method("GET", null)
					.addHeader("Cookie", Cookie)
					.addHeader("Host", "15.1.0.24")
//					.addHeader("Accept-Encoding", "gzip, deflate")
					.addHeader("Accept-Language", "zh-Hans-CN, zh-Hans; q=0.5")
					.addHeader("Connection", "Keep-Alive")
					.addHeader("Accept", "text/html, application/xhtml+xml, image/jxr, */*")
					.build();
			Response response2 = client2.newCall(request2).execute();
			Document doc2 = Jsoup.parse(response2.body().string());
			Element tbody = doc2.getElementsByClass("tablebgcolor").get(0).getElementsByTag("tbody").get(0);
			Element td = tbody.getElementsByTag("tr").get(9).getElementsByTag("td").get(1);
			String enclosure = "";
			if (!td.text().equals("")){
				enclosure = "请查看附件";
			}
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
			map.put("${enclosure}",enclosure);
			String path = "D:\\"+date.format(yyyy)+ "\\"+date.format(MM)+ "\\"+date.format(dd)+ "\\";
			System.out.println(path);
//			CreatWordByModel("D:\\TemplateDoc.docx", map, "D:\\"+order_code+".docx");
			if (service.findNumByGUID(GUID)==0){
				service.add(GUID,order_state, order_code, link_person,link_phone,link_address,business_environment,new_supervision,accept_person,accept_person_code,accept_channel,handle_type,phone_type,write_time,urgency_degree, problem_classification,is_secret,is_reply,reply_remark,problem_description,send_person,send_time,end_date,transfer_opinion,transfer_process,remark,enclosure);
				CreatWordByModel("D:\\TemplateDoc.docx", map, path + order_code+".docx");
//				String printerName = "HP LaserJet 1020";//打印机名包含字串
//				printWord(path + order_code+".docx",printerName);
			}else{
				Undo undo = service.findByGUID(GUID);
				if(!undo.get("problem_description").equals(problem_description)
						||!undo.get("transfer_opinion").equals(transfer_opinion)
						||!undo.get("transfer_process").equals(transfer_process)){
					service.add(GUID,order_state, order_code, link_person,link_phone,link_address,business_environment,new_supervision,accept_person,accept_person_code,accept_channel,handle_type,phone_type,write_time,urgency_degree, problem_classification,is_secret,is_reply,reply_remark,problem_description,send_person,send_time,end_date,transfer_opinion,transfer_process,remark,enclosure);
					CreatWordByModel("D:\\TemplateDoc.docx", map, path + order_code+"-"+System.currentTimeMillis()+".docx");
//					String printerName = "HP LaserJet 1020";//打印机名包含字串
//					printWord(path + order_code+"-"+System.currentTimeMillis()+".docx",printerName);

				}
			}
		}
		renderText("11");
	}


}


