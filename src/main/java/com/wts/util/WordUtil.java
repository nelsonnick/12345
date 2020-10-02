package com.wts.util;


import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.ComThread;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.xwpf.usermodel.*;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static com.wts.util.printUtil.printSingleColor;

public class
WordUtil {

    /*
     * 替换表格里面的变量
     * @param doc 要替换的文档
     * @param params 参数
     */
    public static void replaceInTable(XWPFDocument doc, Map<String, String> map) {
        Iterator<XWPFTable> iterator = doc.getTablesIterator();
        XWPFTable table;
        XWPFTableRow row;
        List<XWPFTableCell> cells;
        List<XWPFParagraph> paras;
        while (iterator.hasNext()) {
            table = iterator.next();//获取每一个table
            int count = table.getNumberOfRows();
            for (int i = 0; i < count; i++) {
                row = table.getRow(i);
                cells = row.getTableCells();
                for (XWPFTableCell cell : cells) {
                    paras = cell.getParagraphs();
                    for (XWPFParagraph para : paras) {
                        replaceInPara(para, map);
                    }
                }
            }
        }
    }

    /*
     * 替换文档里面的变量
     * @param doc 要替换的文档
     * @param params 参数
     */
    public static void replaceInPara(XWPFDocument doc, Map<String, String> map) {
        Iterator<XWPFParagraph> iterator = doc.getParagraphsIterator();
        XWPFParagraph para;
        while (iterator.hasNext()) {
            para = iterator.next();
            /*
             * 此处获取段落的时候有四个
             *  XX报告
             * 	报告日期：${reportDate}
             *  报告内容：
             *  (此处由于是表格所以为空)
             */
            replaceInPara(para, map);
        }
    }

    /*
     * 替换段落里面的变量(被上面的方法调用)
     * @param doc 要替换的段落
     * @param params 参数
     */
    public static void replaceInPara(XWPFParagraph para, Map<String, String> map) {
        List<XWPFRun> runs = para.getRuns();
        for (XWPFRun run : runs) {
            String oneparaString = run.getText(run.getTextPosition());
            if (StringUtils.isBlank(oneparaString)) {
                continue;
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    oneparaString = oneparaString.replace(entry.getKey(), entry.getValue());
                }
            }
            run.setText(oneparaString, 0);
        }
    }

    /*
     * 获取紧急程度
     */
    public static String getUrgencyDegree(Element element) {
        Elements elements = element.getElementsByTag("option");
        for (Element e : elements) {
            if (e.attr("selected").equals("selected")) {
                return e.text();
            }
        }
        return "";
    }

    /*
     * 创建新文件
     */
    public static void CreatWordByModel(String tmpFile, Map<String, String> contentMap, String exportFile) {
        InputStream in;
        try {
            in = new FileInputStream(new File(tmpFile));
            XWPFDocument document;
            document = new XWPFDocument(in);
            replaceInTable(document, contentMap);
            //导出到文件

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            document.write((OutputStream) byteArrayOutputStream);
            OutputStream outputStream = new FileOutputStream(exportFile);
            outputStream.write(byteArrayOutputStream.toByteArray());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printWord(String filePath, String printerName) {
//        初始化线程
        ComThread.InitSTA();
        ActiveXComponent word = new ActiveXComponent("Word.Application");
        //设置打印机名称
        word.setProperty("ActivePrinter", new Variant(printerName));
        // 这里Visible是控制文档打开后是可见还是不可见，若是静默打印，那么第三个参数就设为false就好了
        Dispatch.put(word, "Visible", new Variant(false));
        // 获取文档属性
        Dispatch document = word.getProperty("Documents").toDispatch();
        // 打开激活文挡
        Dispatch doc = Dispatch.call(document, "Open", filePath).toDispatch();
        //Dispatch doc = Dispatch.invoke(document, "Open", Dispatch.Method,
        //  new Object[] { filePath }, new int[1]).toDispatch();
        try {
            Dispatch.callN(doc, "PrintOut");
            printSingleColor(95,3,"打印成功-->" + filePath);
        } catch (Exception e) {
            e.printStackTrace();
            printSingleColor(31,3,"打印失败-->" + filePath);
        } finally {
            try {
                if (doc != null) {
                    Dispatch.call(doc, "Close", new Variant(0));//word文档关闭
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            //退出
            word.invoke("Quit", new Variant[0]);
            //释放资源
            ComThread.Release();
            ComThread.quitMainSTA();
        }
    }
    // 创建文件夹
    public static void createFiles(String filesPath){
        File file = new File(filesPath);
        if (!file.exists()) {//如果文件夹不存在
            file.mkdir();//创建文件夹
        }
        // 创建月
        for (int i = 1; i < 10; i++) {
            File file1 = new File(filesPath+"\\0" + i);
            if (!file1.exists()) {//如果文件夹不存在
                file1.mkdir();//创建文件夹
            }
        }
        for (int i = 10; i < 13; i++) {
            File file1 = new File(filesPath+"\\" + i);
            if (!file1.exists()) {//如果文件夹不存在
                file1.mkdir();//创建文件夹
            }
        }
        //创建日
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                File file2 = new File(filesPath+"\\0" + i + "\\0" + j);
                if (!file2.exists()) {//如果文件夹不存在
                    file2.mkdir();//创建文件夹
                }
            }
            for (int j = 10; j < 32; j++) {
                File file2 = new File(filesPath+"\\0" + i + "\\" + j);
                if (!file2.exists()) {//如果文件夹不存在
                    file2.mkdir();//创建文件夹
                }
            }
        }
        for (int i = 10; i < 13; i++) {
            for (int j = 1; j < 10; j++) {
                File file2 = new File(filesPath+"\\" + i + "\\0" + j);
                if (!file2.exists()) {//如果文件夹不存在
                    file2.mkdir();//创建文件夹
                }
            }
            for (int j = 10; j < 32; j++) {
                File file2 = new File(filesPath+"\\" + i + "\\" + j);
                if (!file2.exists()) {//如果文件夹不存在
                    file2.mkdir();//创建文件夹
                }
            }
        }
        LocalDate date = LocalDate.now();
        DateTimeFormatter yyyy = DateTimeFormatter.ofPattern("yyyy");
        DateTimeFormatter MM = DateTimeFormatter.ofPattern("MM");
        DateTimeFormatter dd = DateTimeFormatter.ofPattern("dd");
        System.out.println(date.format(yyyy));
        System.out.println(date.format(MM));
        System.out.println(date.format(dd));
        System.out.println(System.currentTimeMillis());
    }

    public static void main(String[] args) {
        String filesPath = "D:\\2021";
        createFiles(filesPath);
    }
}
