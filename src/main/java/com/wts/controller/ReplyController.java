package com.wts.controller;

import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.wts.entity.model.Reply;
import com.wts.service.ReplyService;

public class ReplyController extends Controller {

	@Inject
	ReplyService service;

	public void index() {
		renderText("已回复工单");
	}

	public void get() {
		Reply entity = service.findByGUID(getPara("GUID"));
		setSessionAttr("entity", entity);
		render("/detail.html");
	}

}


