package com.wts.util;

import java.util.Date;

public class printUtil {

    /**
     *
     * @param code 颜色代号：背景颜色代号(41-46)；前景色代号(31-36)31红32黄33暗黄34蓝35紫36青
     * @param n 数字+m：1加粗；3斜体；4下划线
     * @param content 要打印的内容
     */
    public static void printSingleColor(int code,int n,String content){
        System.out.format("\33[%d;%dm%s%n",  code, n, new Date() + "：" + content);
    }
    public static void main(String[] args) {
        printSingleColor(31,3,"红31");
        printSingleColor(32,3,"黄32");
        printSingleColor(33,3,"暗黄33");
        printSingleColor(34,3,"蓝34");
        printSingleColor(35,3,"紫35");
        printSingleColor(36,3,"青36");
    }
}
