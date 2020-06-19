package com.wts.service;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.wts.entity.model.*;

import java.util.Date;

public class FallbackService {

	private Fallback dao = new Fallback().dao();

	public Page<Fallback> paginate(int pageNumber, int pageSize) {
		return dao.paginate(pageNumber, pageSize, "select *", "from fallback order by id asc");
	}

	public Fallback findById(int id) {
		return dao.findById(id);
	}

	public void deleteById(int id) {
		dao.deleteById(id);
	}

	public Integer findNumByGUID(String order_guid) {
		return Db.queryInt("SELECT COUNT(*) FROM fallback WHERE fallback.order_guid LIKE '%" + order_guid + "%' ");
	}
	public Fallback findByGUID(String order_guid) {
		return dao.findFirst("SELECT * FROM fallback WHERE fallback.order_guid LIKE '%" + order_guid + "%' ");
	}
	public void add(Fallback fallback){
		if (fallback.get("problem_description").toString().length()>5000){
			String un = fallback.get("problem_description").toString().substring(0,4999);
			fallback.set("problem_description",un);
		}
		fallback.save();
	}
	public void add(String file_guid,String order_guid,String order_state, String order_code, String link_person,String link_phone,
					String link_address,String business_environment,String new_supervision,String accept_person,
					String accept_person_code,String accept_channel,String handle_type,String phone_type,
					String write_time,String urgency_degree, String problem_classification,String is_secret,
					String is_reply,String reply_remark,String problem_description,String send_person,
					String send_time,String end_date,String transfer_opinion,String transfer_process,String remark,
					String enclosure, String fallback_reason, String leader_opinions, String suggestion,
					String fallback_department, String fallback_time, String fallback_person, String fallback_phone) {
		Fallback fallback = new Fallback();
		String pd = "";
		if (problem_description.length()>5000){
			pd = problem_description.substring(0,4999);
		}
		fallback.set("file_guid",file_guid)
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
				.set("fallback_reason",fallback_reason)
				.set("leader_opinions",leader_opinions)
				.set("suggestion",suggestion)
				.set("fallback_department",fallback_department)
				.set("fallback_time",fallback_time)
				.set("fallback_person",fallback_person)
				.set("fallback_phone",fallback_phone)
				.save();
	}
}
