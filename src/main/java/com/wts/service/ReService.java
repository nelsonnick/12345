package com.wts.service;

import com.jfinal.plugin.activerecord.Page;
import com.wts.entity.model.Re;
import com.wts.entity.model.Reply;


public class ReService {

	private Re dao = new Re().dao();

	public Page<Re> paginate(int pageNumber, int pageSize) {
		return dao.paginate(pageNumber, pageSize, "select *", "from re");
	}

	public Re findById(int id) {
		return dao.findById(id);
	}

	public void deleteById(int id) {
		dao.deleteById(id);
	}

}
