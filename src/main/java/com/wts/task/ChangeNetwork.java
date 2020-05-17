package com.wts.task;

import org.apache.log4j.Logger;

import static com.wts.util.others.IpKit.getLocalHostIP;

//切外网
public class ChangeNetwork implements Runnable {
    private static Logger logger = Logger.getLogger(ChangeNetwork.class);

    public void run() {
        try {
//            Runtime.getRuntime().exec("netsh interface ip set address name=\"本地连接\" source=dhcp");
            Runtime.getRuntime().exec("netsh interface set interface name=\"WLAN\" enabled");
            Runtime.getRuntime().exec("netsh interface set interface name=\"LAN\" disabled");
            logger.info("切换外网成功");
            if (getLocalHostIP().equals("10.153.73.163")){


            }else{
                logger.error("不在内网环境，无法下载数据！");
            }
        } catch (Exception e) {
            logger.info("切换外网失败");
        }
    }
}
