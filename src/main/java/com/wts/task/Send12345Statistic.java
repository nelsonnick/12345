package com.wts.task;

import com.wts.util.ParamesAPI;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.cp.api.impl.WxCpServiceImpl;
import me.chanjar.weixin.cp.bean.WxCpMessage;
import me.chanjar.weixin.cp.config.impl.WxCpDefaultConfigImpl;

public class Send12345Statistic implements Runnable{

    @Override
    public void run() {
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
                .content("Hello World")
                .build();
        try {
            wxCpService.messageSend(message);
        } catch (WxErrorException e) {
            e.printStackTrace();
        }


    }
}
