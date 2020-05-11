package com.wts.workorder;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.wts.entity.model.Workorder;

/**
 * 本 demo 仅表达最为粗浅的 jfinal 用法，更为有价值的实用的企业级用法
 * 详见 JFinal 俱乐部: http://jfinal.com/club
 * 
 * BlogService
 * 所有 sql 与业务逻辑写在 Service 中，不要放在 Model 中，更不
 * 要放在 Controller 中，养成好习惯，有利于大型项目的开发与维护
 */
public class WorkorderService {
	

	private Workorder dao = new Workorder().dao();
	
	public Page<Workorder> paginate(int pageNumber, int pageSize) {
		return dao.paginate(pageNumber, pageSize, "select *", "from workorder order by id asc");
	}
	
	public Workorder findById(int id) {
		return dao.findById(id);
	}

	public void deleteById(int id) {
		dao.deleteById(id);
	}

	public Integer findNumByGUID(String GUID) {
		return Db.queryInt("SELECT COUNT(*) FROM workorder WHERE workorder.order_guid LIKE '%" + GUID + "%' ");
	}
	public Workorder findByGUID(String GUID) {
		return dao.findFirst("SELECT * FROM workorder WHERE workorder.order_guid LIKE '%" + GUID + "%' ");
	}

	public void add(String GUID,String order_state, String order_code, String link_person,String link_phone,
					String link_address,String business_environment,String new_supervision,String accept_person,
					String accept_person_code,String accept_channel,String handle_type,String phone_type,
					String write_time,String urgency_degree, String problem_classification,String is_secret,
					String is_reply,String reply_remark,String problem_description,String send_person,
					String send_time,String end_date,String transfer_opinion,String transfer_process,String remark) {
		Workorder workorder = new Workorder();
		workorder.set("order_guid",GUID)
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
				.set("problem_description",problem_description)
				.set("send_person",send_person)
				.set("send_time",send_time)
				.set("end_date",end_date)
				.set("transfer_opinion",transfer_opinion)
				.set("transfer_process",transfer_process)
				.set("remark",remark)
				.save();
	}
}
