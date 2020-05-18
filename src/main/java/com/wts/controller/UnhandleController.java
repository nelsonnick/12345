package com.wts.controller;

import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.wts.entity.model.Unhandle;
import com.wts.service.UnhandleService;

public class UnhandleController extends Controller {

	@Inject
	UnhandleService service;

	public void index() {
		renderText("未办理工单");
	}

	public void get() {
		Unhandle entity = service.findByGUID(getPara("GUID"));
		setSessionAttr("entity", entity);
		render("/detail.html");
	}

}


