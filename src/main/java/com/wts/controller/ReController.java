package com.wts.controller;

import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.wts.entity.model.Re;
import com.wts.service.ReService;

public class ReController extends Controller {

    @Inject
    ReService service;

    public void index() {
        setAttr("rePage", service.paginate(getParaToInt(0, 1), 10));
        render("re.html");
    }

    /**
     * save 与 update 的业务逻辑在实际应用中也应该放在 serivce 之中，
     * 并要对数据进正确性进行验证，在此仅为了偷懒
     */
    public void save() {
        getBean(Re.class).save();
        redirect("/re");
    }

    public void edit() {
        setAttr("re", service.findById(getParaToInt()));
    }

    /**
     * save 与 update 的业务逻辑在实际应用中也应该放在 serivce 之中，
     * 并要对数据进正确性进行验证，在此仅为了偷懒
     */
    public void update() {
        getBean(Re.class).update();
        redirect("/re");
    }

//    public void delete() {
//        service.deleteById(getParaToInt());
//        redirect("/re");
//    }
}


