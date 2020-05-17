package com.wts.controller;

import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.wts.entity.model.Statistic;
import com.wts.service.StatisticService;

public class StatisticController extends Controller {

	@Inject
	StatisticService service;

	public void index() {
		renderText("工单统计");
	}

	public void get() {
		Statistic entity = service.findByGUID(getPara("GUID"));
		setSessionAttr("entity", entity);
		render("/detail.html");
	}
	public void dayCount(){
		String start = getPara("start");
		String end = getPara("end");

	}
	public void weekCount(){

	}
	public void monthCount(){

	}
}


