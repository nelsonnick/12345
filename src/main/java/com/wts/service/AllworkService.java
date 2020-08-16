package com.wts.service;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.wts.entity.model.Allwork;

public class AllworkService {

	private Allwork dao = new Allwork().dao();

	public Page<Allwork> paginate(int pageNumber, int pageSize) {
		return dao.paginate(pageNumber, pageSize, "select *", "from allwork order by id asc");
	}

	public Allwork findById(int id) {
		return dao.findById(id);
	}

	public void deleteById(int id) {
		dao.deleteById(id);
	}

	public Integer findNumByGUID(String order_guid) {
		return Db.queryInt("SELECT COUNT(*) FROM allwork WHERE allwork.order_guid LIKE '%" + order_guid + "%' ");
	}
	public Allwork findByGUID(String order_guid) {
		return dao.findFirst("SELECT * FROM allwork WHERE allwork.order_guid LIKE '%" + order_guid + "%' ");
	}
	public String findNumByPhone(String link_phone) {
		if (link_phone.equals("******")){
			return "";
		}else{
			return Db.queryInt("SELECT COUNT(*) FROM allwork WHERE allwork.link_phone = '" + link_phone + "' ") + "";

		}
	}
	public void add(Allwork allwork){
		if (allwork.get("problem_description").toString().length()>5000){
			String un = allwork.get("problem_description").toString().substring(0,4999);
			allwork.set("problem_description",un);
		}
		allwork.save();
	}
	public void add(String file_guid, String order_guid,String order_code,String link_person,String link_phone,String link_address,String send_time,String problem_description,String transfer_opinion,String transfer_process){
		Allwork allwork = new Allwork();
		String pd = "";
		if (problem_description.length()>5000){
			pd = problem_description.substring(0,4999);
		}
		allwork.set("file_guid",file_guid)
				.set("order_guid",order_guid)
				.set("order_code",order_code)
				.set("link_person",link_person)
				.set("link_phone",link_phone)
				.set("link_address",link_address)
				.set("send_time",send_time)
				.set("problem_description",pd)
				.set("transfer_opinion",transfer_opinion)
				.set("transfer_process",transfer_process)
				.save();
	}
}
