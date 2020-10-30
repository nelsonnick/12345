package com.wts.task;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jfinal.kit.PropKit;
import com.wts.entity.model.Unread;
import com.wts.service.UnreadService;
import com.wts.util.ParamesAPI;
import me.chanjar.weixin.cp.api.impl.WxCpServiceImpl;
import me.chanjar.weixin.cp.bean.WxCpMessage;
import me.chanjar.weixin.cp.config.impl.WxCpDefaultConfigImpl;
import okhttp3.*;

import static com.wts.util.printUtil.printSingleColor;


public class getUnread implements Runnable {
    @Override
    public void run(){
        String cookie = PropKit.use("config-dev.txt").get("cookie");
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "page=1&rp=40&sortname=&sortorder=asc&query=&qtype=&qop=Eq&initQuery=c6cc1fe8d4e8d7f599163c353351c70b0e1931be785c1611cb7c650c15306a78086ceddd65b0ba01bb040a2c263e409068fbbe7539d58b6164b98434553147107f889d84d02932a2f1a523a6e7f56176737eb50b10215210a5cbba066e076d239514698b56209b40f83d26ffdbe630b2eb125f29c6260ebb204dcacf771264e06c5fb90eb778b04dbd0973b97c4b10b54e80ab4d478b3d827b936cd7ae964c3c&advQuery=&columns=op%2CGUID%2CFILEGUID%2Ctitle%2CsendPerson%2Csenddate%2CkeyNumber%2CdocType%2CisOut%2CisNew%2Csign%2CisTop%2CURL%2CsendpersonGuid%2CorigSendPerson%2Cisflow%2CisReply%2CtypeName%2CtypeCode%2C&lkocok_colAttributes=-2%2C-1%2C-1%2C1%2C0%2C0%2C0%2C-1%2C-1%2C-1%2C-1%2C-1%2C-1%2C-1%2C-1%2C-1%2C-1%2C-1%2C-1%2C&lkocok_jqglpName=jqgprojectlist&lkocok_itemLinkUrl=&lkocok_itemLinkTarget=&lkocok_orderSql=f5153d8ef03477be0e896f06a6e5df4e456e05643e706871708d825db1c2be4149cecd59b1c696f9e68689a42a067f01&lkocok_orderColumn=&lkocok_order=asc&lkocok_useCustomDataSet=false&whichgrid=preDealListGrid&lkocok_tableName=todeal&lkocok_pkName=GUID&lkocok_replace_fieldNames=&lkocok_replace_linkNames=");
        Request request = new Request.Builder()
                .url("http://15.1.0.51/jhoanew_huaiyinqu/Predeal/ListPreDeal.aspx?status=0")
                .method("POST", body)
                .addHeader("Host", "15.1.0.51")
                .addHeader("Connection", "keep-alive")
                .addHeader("Content-Length", "1162")
                .addHeader("Accept", "application/json, text/javascript, */*; q=0.01")
                .addHeader("Origin", "http://15.1.0.51")
                .addHeader("X-Requested-With", "XMLHttpRequest")
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.112 Safari/537.36")
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .addHeader("Referer", "http://15.1.0.51/jhoanew_huaiyinqu/Predeal/ListPreDeal.aspx?status=0")
//                .addHeader("Accept-Encoding", "gzip, deflate")
                .addHeader("Accept-Language", "zh-CN,zh;q=0.8")
                .addHeader("Cookie", cookie)
                .build();
        try {
            Response response = client.newCall(request).execute();
            String a = response.body().string();
            JSONObject rows = JSONObject.parseObject(a);
            JSONArray array = rows.getJSONArray("rows");
            UnreadService service = new UnreadService();
            for (int i = 0; i < 40; i++) {
                JSONObject hiddenValues = JSONObject.parseObject(array.get(i).toString()).getJSONObject("hiddenValues");
                String title = hiddenValues.getString("title");
                String GUID = hiddenValues.getString("GUID");
                String origSendPerson = hiddenValues.getString("origSendPerson");
                if (!title.startsWith("济南12345")) {
                    if (service.findNumByGUID(GUID) != 0) {
                        Unread unread = new Unread();
                        unread.setOrderGuid(GUID);
                        unread.setTitle(title);
                        unread.setOrigSendPerson(origSendPerson);
                        unread.save();
                        System.out.println("新的代办：" + origSendPerson + "-->" + title);
                        sendMessageToWeiXin("新的代办：" + origSendPerson + "-->" + title, "WangTianShuo");
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void sendMessageToWeiXin(String msgContent, String UserID) {
        try {
            WxCpDefaultConfigImpl config = new WxCpDefaultConfigImpl();
            config.setCorpId(ParamesAPI.corpId);      // 设置微信企业号的appid
            config.setCorpSecret(ParamesAPI.secret);  // 设置微信企业号的app corpSecret
            config.setAgentId(ParamesAPI.agentId);     // 设置微信企业号应用ID
            config.setToken(ParamesAPI.token);       // 设置微信企业号应用的token
            config.setAesKey(ParamesAPI.encodingAESKey);      // 设置微信企业号应用的EncodingAESKey
            WxCpServiceImpl wxCpService = new WxCpServiceImpl();
            wxCpService.setWxCpConfigStorage(config);
            WxCpMessage message = WxCpMessage
                    .TEXT()
                    .agentId(ParamesAPI.agentId)
                    .toUser(UserID)
                    .content(msgContent)
                    .build();
            wxCpService.messageSend(message);
        } catch (Exception e) {
            printSingleColor(91, 3, "推送企业微信失败-->" + msgContent);
        }
    }

}
