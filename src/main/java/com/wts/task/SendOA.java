package com.wts.task;

import com.wts.util.ParamesAPI;
import me.chanjar.weixin.cp.api.impl.WxCpServiceImpl;
import me.chanjar.weixin.cp.bean.WxCpMessage;
import me.chanjar.weixin.cp.config.impl.WxCpDefaultConfigImpl;

import java.io.File;

import static com.wts.util.oaUtil.*;

public class SendOA implements Runnable {

    @Override
    public void run() {
        try {
            String token = getToken();
            File[] files = new File("D:\\上传OA").listFiles();
            if (files != null) {
                int i = 0;
                for (File file : files) {
                    String fileName = file.getName();
                    if (fileName.endsWith("docx")) {
                        readDocx(file.getAbsolutePath(),token);
                    }
                    i = i + 1;
                }
//                WxCpDefaultConfigImpl config = new WxCpDefaultConfigImpl();
//                config.setCorpId(ParamesAPI.corpId);      // 设置微信企业号的appid
//                config.setCorpSecret(ParamesAPI.secret);  // 设置微信企业号的app corpSecret
//                config.setAgentId(1000002);     // 设置微信企业号应用ID
//                config.setToken("...");       // 设置微信企业号应用的token
//                config.setAesKey("...");      // 设置微信企业号应用的EncodingAESKey
//
//                WxCpServiceImpl wxCpService = new WxCpServiceImpl();
//                wxCpService.setWxCpConfigStorage(config);
//                WxCpMessage message = WxCpMessage
//                        .TEXTCARD()
//                        .agentId(1000002)
//                        //.toUser("@all")
//                        .toUser("WangTianShuo")
//                        .title("上传OA提醒")
//                        .description("已上传" + i + "个工单至OA")
//                        .url("#")
//                        .build();
//                wxCpService.messageSend(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
