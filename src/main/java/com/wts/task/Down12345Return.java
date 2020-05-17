package com.wts.task;

import com.jfinal.kit.PropKit;
import com.wts.util.ParamesAPI;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.cp.api.impl.WxCpServiceImpl;
import me.chanjar.weixin.cp.bean.WxCpMessage;
import me.chanjar.weixin.cp.config.impl.WxCpDefaultConfigImpl;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import static com.wts.util.util12345.getDoc;
import static com.wts.util.util12345.getListUrl;

public class Down12345Return implements Runnable{

    @Override
    public void run() {
        String url = getListUrl("2", "0");
        String cookie = PropKit.use("config-dev.txt").get("cookie");
        Document doc = getDoc(url,cookie);
        Elements trs = doc.getElementById("outerDIV").getElementsByTag("tbody").get(1).getElementsByTag("tr");
        if (trs.text().equals("")){

        }
        WxCpDefaultConfigImpl config = new WxCpDefaultConfigImpl();
        config.setCorpId(ParamesAPI.corpId);      // 设置微信企业号的appid
        config.setCorpSecret(ParamesAPI.secret);  // 设置微信企业号的app corpSecret
        config.setAgentId(1000002);     // 设置微信企业号应用ID
        config.setToken("...");       // 设置微信企业号应用的token
        config.setAesKey("...");      // 设置微信企业号应用的EncodingAESKey

        WxCpServiceImpl wxCpService = new WxCpServiceImpl();
        wxCpService.setWxCpConfigStorage(config);
        WxCpMessage message = WxCpMessage
                .TEXT()
                .agentId(1000002)
                //.toUser("@all")
                .toUser("WangTianShuo")
                .content("有新的回退办理单需要处理，请查收！")
                .build();
        try {
            wxCpService.messageSend(message);
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
    }

}
