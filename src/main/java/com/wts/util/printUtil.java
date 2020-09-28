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
        System.out.println("正常");
        printSingleColor(30,3,"白30");
        printSingleColor(31,3,"红31");
        printSingleColor(32,3,"黄32");
        printSingleColor(33,3,"暗黄33");
        printSingleColor(34,3,"蓝34");
        printSingleColor(35,3,"紫35");
        printSingleColor(36,3,"青36");
        printSingleColor(37,3,"灰37");
        System.out.println("亮色");
        printSingleColor(90,3,"白90");
        printSingleColor(91,3,"红91");
        printSingleColor(92,3,"黄92");
        printSingleColor(93,3,"暗黄93");
        printSingleColor(94,3,"蓝94");
        printSingleColor(95,3,"紫95");
        printSingleColor(96,3,"青96");
        printSingleColor(97,3,"灰97");
        System.out.println("背景");
        printSingleColor(40,3,"灰40");
        printSingleColor(41,3,"红41");
        printSingleColor(42,3,"黄42");
        printSingleColor(43,3,"暗黄43");
        printSingleColor(44,3,"蓝44");
        printSingleColor(45,3,"紫45");
        printSingleColor(46,3,"青46");
    }
}
