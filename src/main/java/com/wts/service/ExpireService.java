package com.wts.service;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.wts.entity.model.Expire;

public class ExpireService {

	private Expire dao = new Expire().dao();

	public Page<Expire> paginate(int pageNumber, int pageSize) {
		return dao.paginate(pageNumber, pageSize, "select *", "from expire order by id asc");
	}

	public Expire findById(int id) {
		return dao.findById(id);
	}

	public void deleteById(int id) {
		dao.deleteById(id);
	}

	public Integer findNumByGUID(String order_guid) {
		return Db.queryInt("SELECT COUNT(*) FROM expire WHERE expire.order_guid LIKE '%" + order_guid + "%' ");
	}
	public Expire findByGUID(String order_guid) {
		return dao.findFirst("SELECT * FROM expire WHERE expire.order_guid LIKE '%" + order_guid + "%' ");
	}
	public void add(Expire expire){
		if (expire.get("problem_description").toString().length()>5000){
			String un = expire.get("problem_description").toString().substring(0,4999);
			expire.set("problem_description",un);
		}
		expire.save();
	}
	public void add(String file_guid, String order_guid, String order_code, String end_date) {
		Expire expire = new Expire();
		expire.set("file_guid",file_guid)
				.set("order_guid",order_guid)
				.set("order_code",order_code)
				.set("end_date",end_date)
				.save();
	}
}
