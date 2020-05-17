package com.wts.service;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.wts.entity.model.Statistic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StatisticService {

	private Statistic dao = new Statistic().dao();
	LocalDate date = LocalDate.now();
	DateTimeFormatter yyyy = DateTimeFormatter.ofPattern("yyyy");
	DateTimeFormatter MM = DateTimeFormatter.ofPattern("MM");
	DateTimeFormatter dd = DateTimeFormatter.ofPattern("dd");
	String d = date.format(yyyy) + "-" + date.format(MM) + "-" + date.format(dd);

	public Page<Statistic> paginate(int pageNumber, int pageSize) {
		return dao.paginate(pageNumber, pageSize, "select *", "from statistic order by id asc");
	}

	public Statistic findById(int id) {
		return dao.findById(id);
	}

	public void deleteById(int id) {
		dao.deleteById(id);
	}

	public Integer findNumByGUID(String order_guid) {
		return Db.queryInt("SELECT COUNT(*) FROM statistic WHERE statistic.order_guid LIKE '%" + order_guid + "%' ");
	}
	public Statistic findByGUID(String order_guid) {
		return dao.findFirst("SELECT * FROM statistic WHERE statistic.order_guid LIKE '%" + order_guid + "%' ");
	}

	public Integer countByType(String type) {
		return Db.queryInt("SELECT COUNT(*) FROM statistic WHERE (statistic.type LIKE '%" + type + "%') And (timestamp(save_time) between '"+d+" 00:00:00' and '"+d+" 23:59:59')");
	}

	public void add(Statistic statistic){
		statistic.save();
	}

	public void add(String order_guid,String order_code, String end_date,String type,
					String department,String keywords) {
		Statistic statistic = new Statistic();
		statistic.set("order_guid",order_guid)
				.set("order_code",order_code)
				.set("end_date",end_date)
				.set("type",type)
				.set("department",department)
				.set("keywords",keywords)
				.save();
	}
}
