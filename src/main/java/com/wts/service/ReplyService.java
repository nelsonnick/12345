package com.wts.service;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.wts.entity.model.Reply;

import java.util.Date;

public class ReplyService {

	private Reply dao = new Reply().dao();

	public Page<Reply> paginate(int pageNumber, int pageSize) {
		return dao.paginate(pageNumber, pageSize, "select *", "from reply order by id asc");
	}

	public Reply findById(int id) {
		return dao.findById(id);
	}

	public void deleteById(int id) {
		dao.deleteById(id);
	}

	public Integer findNumByGUID(String order_guid) {
		return Db.queryInt("SELECT COUNT(*) FROM reply WHERE reply.order_guid LIKE '%" + order_guid + "%' ");
	}
	public Reply findByGUID(String order_guid) {
		return dao.findFirst("SELECT * FROM reply WHERE reply.order_guid LIKE '%" + order_guid + "%' ");
	}
	public Boolean has(String order_guid) {
		return dao.findFirst("SELECT * FROM reply WHERE reply.order_guid LIKE '%" + order_guid + "%' ")!=null;
	}
	public void add(Reply reply){
		if (reply.get("problem_description").toString().length()>3000){
			String un = reply.get("problem_description").toString().substring(0,2999);
			reply.set("problem_description",un);
		}
		if (reply.get("reply_enclosure").toString().length()>30){
			String re = reply.get("reply_enclosure").toString().substring(0,29);
			reply.set("reply_enclosure",re);
		}
		reply.save();
	}
	public void add(String file_guid,String order_guid,String order_state, String order_code, String link_person,String link_phone,
					String link_address,String business_environment,String new_supervision,String accept_person,
					String accept_person_code,String accept_channel,String handle_type,String phone_type,
					String write_time,String urgency_degree, String problem_classification,String is_secret,
					String is_reply,String reply_remark,String problem_description,String send_person,
					String send_time,String end_date,String transfer_opinion,String transfer_process,String remark,
					String enclosure,String reply_type,String finish_time,String reply_satisfy,String reply_day,
					String reply_person,String reply_phone,String reply_content,String reply_department,String reply_time,
					String subordinate_department,String if_nodo,String nodo_reason,String reply_enclosure,
					String reply_person2,String reply_phone2) {
		Reply reply = new Reply();
		String pd = "";
		if (problem_description.length()>3000){
			pd = problem_description.substring(0,2999);
		}
		reply.set("file_guid",file_guid)
				.set("order_guid",order_guid)
				.set("order_state",order_state)
				.set("order_code",order_code)
				.set("link_person",link_person)
				.set("link_phone",link_phone)
				.set("link_address",link_address)
				.set("business_environment",business_environment)
				.set("new_supervision",new_supervision)
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
				.set("remark",remark)
				.set("enclosure",enclosure)
				.set("down_time", new Date())
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
