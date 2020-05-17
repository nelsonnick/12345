package com.wts.controller;

import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.wts.entity.model.Undo;
import com.wts.service.UndoService;

public class ExpireController extends Controller {

	@Inject
	UndoService service;

	public void index() {
		renderText("到期工单");
	}

	public void get() {
		Undo entity = service.findByGUID(getPara("GUID"));
		setSessionAttr("entity", entity);
		render("/detail.html");
	}

}


