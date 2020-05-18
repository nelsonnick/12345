package com.wts.controller;

import com.jfinal.core.Controller;

public class MainController extends Controller {

    public void index() {
        renderText("服务正常");
    }
    public void a() {
        setAttr("num1",20);//#(num1)
        render("a.html");
    }
}


