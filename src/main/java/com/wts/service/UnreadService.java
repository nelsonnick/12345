package com.wts.service;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.wts.entity.model.Unread;


public class UnreadService {

	private Unread dao = new Unread().dao();

	public Integer findNumByGUID(String order_guid) {
		return Db.queryInt("SELECT COUNT(*) FROM unread WHERE unread.order_guid LIKE '%" + order_guid + "%' ");
	}

}
