package com.wts.util;


import org.apache.commons.lang3.StringUtils;
import org.apache.poi.xwpf.usermodel.*;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class WordUtil {

    /*
     * 替换表格里面的变量
     * @param doc 要替换的文档
     * @param params 参数
     */
    public static void replaceInTable(XWPFDocument doc, Map<String, String> map){
        Iterator<XWPFTable> iterator = doc.getTablesIterator();
        XWPFTable table;
        XWPFTableRow row;
        List<XWPFTableCell> cells;
        List<XWPFParagraph> paras;
        while(iterator.hasNext()){
            table = iterator.next();//获取每一个table
            int count = table.getNumberOfRows();
            for(int i=0;i<count;i++){
                row = table.getRow(i);
                cells = row.getTableCells();
                for(XWPFTableCell cell : cells){
                    paras = cell.getParagraphs();
                    for(XWPFParagraph para : paras){
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
    public static void replaceInPara(XWPFDocument doc, Map<String, String> map){
        Iterator<XWPFParagraph> iterator = doc.getParagraphsIterator();
        XWPFParagraph para;
        while(iterator.hasNext()){
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
    public static void replaceInPara(XWPFParagraph para, Map<String, String> map){
        List<XWPFRun> runs = para.getRuns();
        for(XWPFRun run : runs){
            String oneparaString = run.getText(run.getTextPosition());
            if(StringUtils.isBlank(oneparaString)){
                continue;
            }
            for(Map.Entry<String, String> entry : map.entrySet()){
                if(entry.getValue() != null){
                    oneparaString = oneparaString.replace(entry.getKey(), entry.getValue());
                }
            }
            run.setText(oneparaString, 0);
        }
    }

    /*
     * 获取紧急程度
     */
    public static String getUrgencyDegree(Element element){
        Elements elements = element.getElementsByTag("option");
        for (Element e:elements){
            if (e.attr("selected").equals("selected")){
                return e.text();
            }
        }
        return "";
    }

    /*
     * 创建新文件
     */
    public static void CreatWordByModel(String  tmpFile, Map<String, String> contentMap, String exportFile) throws Exception{
        InputStream in = null;
        in = new FileInputStream(new File(tmpFile));
        XWPFDocument document = null;
        document = new XWPFDocument (in);
        replaceInTable(document, contentMap);
        //导出到文件
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            document.write((OutputStream)byteArrayOutputStream);
            OutputStream outputStream = new FileOutputStream(exportFile);
            outputStream.write(byteArrayOutputStream.toByteArray());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
