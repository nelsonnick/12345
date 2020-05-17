package com.wts.task;

import static com.wts.util.oaUtil.getFileContent;

public class SendOA implements Runnable {

    @Override
    public void run() {
        try {
            getFileContent("D:\\上传OA");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
