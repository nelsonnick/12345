package com.wts.controller;

import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.wts.entity.model.Fallback;
import com.wts.service.FallbackService;

public class FallbackController extends Controller {

	@Inject
	FallbackService service;

	public void index() {
		renderText("已回退工单");
	}

	public void get() {
		Fallback entity = service.findByGUID(getPara("GUID"));
		setSessionAttr("entity", entity);
		render("/detail.html");
	}

}


