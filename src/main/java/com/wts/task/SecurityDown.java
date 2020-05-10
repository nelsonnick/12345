package com.wts.task;

import org.apache.log4j.Logger;

import static com.wts.util.IpKit.getLocalHostIP;

public class SecurityDown implements Runnable {
    private static Logger logger = Logger.getLogger(SecurityDown.class);

    public void run() {
        if (getLocalHostIP().equals("10.153.73.163")){


        }else{
            logger.error("不在内网环境，无法下载数据！");
        }

    }
}
