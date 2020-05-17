package com.wts.util.others;

import com.alibaba.fastjson.JSONObject;
import okhttp3.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class dati {

    // 获取百度token
    public static String getToken() throws Exception{
        String API_Key = "31AwI8UD7Y2rTK3dpDqc4w9e";
        String Secret_Key = "N2Gv4dEtZd6X0X0DaaH8XGpVv91dr4uB";
        String url = "https://aip.baidubce.com/oauth/2.0/token?grant_type=client_credentials&client_id=" + API_Key + "&client_secret=" + Secret_Key;
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        Response response = client.newCall(request).execute();
        String access_token = JSONObject.parseObject(response.body().string()).getString("access_token");
        return access_token;
    }

    // 百度OCR识别验证码
    public static String getCode(String token) throws Exception{
        String url = "https://aip.baidubce.com/rest/2.0/ocr/v1/general_basic" + "?access_token=" + token;
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("http://120.221.150.148:8010/eoffice10/server/public/api/flow/run/save-flow-run-info")
//                .method("POST", body)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .build();
        return url;
    }

    // 获取验证码
    public static void getPicture() throws Exception{
        String api_picture = "https://bw.chinahrt.com.cn/api/kaptcha";
        // 构造URL
        URL url = new URL(api_picture);
        // 打开连接
        URLConnection con = url.openConnection();
        // 输入流
        InputStream is = con.getInputStream();
        // 1K的数据缓冲
        byte[] bs = new byte[1024];
        // 读取到的数据长度
        int len;
        // 输出的文件流
        String filename = "D:\\image.jpg";  //下载路径及下载图片名称
        File file = new File(filename);
        FileOutputStream os = new FileOutputStream(file, true);
        // 开始读取
        while ((len = is.read(bs)) != -1) {
            os.write(bs, 0, len);
        }
        // 完毕，关闭所有链接
        os.close();
        is.close();
    }

// 自动登录
//    public static Session getLogin(String mobile, String password, String name){
//
//    }


    public static void main(String[] args)  throws Exception{
        getPicture();
    }
}
