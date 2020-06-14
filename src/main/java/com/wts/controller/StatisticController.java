package com.wts.controller;

import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.jfinal.kit.PropKit;
import com.wts.entity.model.Allwork;
import com.wts.entity.model.Statistic;
import com.wts.service.AllworkService;
import com.wts.service.StatisticService;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static com.wts.util.util12345.getDoc;
import static com.wts.util.util12345.getPageUrl;

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


