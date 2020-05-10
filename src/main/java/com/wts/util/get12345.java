package com.wts.util;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.hwpf.usermodel.Table;
import org.apache.poi.hwpf.usermodel.TableIterator;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;


public class get12345 {
    /**
     * 去除后面的特殊符号
     */
    public static String getStr(String str) {
        if (null != str && !"".equals(str)) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    /**
     * 读取文档中表格doc
     *
     */
    public static void readDoc(String filePath) {
        try {
            FileInputStream in = new FileInputStream(filePath);
            // 处理doc格式 即office2003版本
            POIFSFileSystem pfs = new POIFSFileSystem(in);
            HWPFDocument hwpf = new HWPFDocument(pfs);
            Range range = hwpf.getRange();
            TableIterator it = new TableIterator(range);
            it.hasNext();
            Table tb = it.next();
            String time = getStr(tb.getRow(0).getCell(3).getParagraph(0).text());
            String code = getStr(tb.getRow(1).getCell(1).getParagraph(0).text());
            String urgent = getStr(tb.getRow(1).getCell(3).getParagraph(0).text());
            String type = getStr(tb.getRow(2).getCell(1).getParagraph(0).text());
            String reso = getStr(tb.getRow(2).getCell(3).getParagraph(0).text());
            String resp = getStr(tb.getRow(3).getCell(1).getParagraph(0).text());
            String scur = getStr(tb.getRow(3).getCell(3).getParagraph(0).text());
            String name = getStr(tb.getRow(4).getCell(1).getParagraph(0).text());
            String phone = getStr(tb.getRow(4).getCell(3).getParagraph(0).text());
            String address = getStr(tb.getRow(5).getCell(1).getParagraph(0).text());
            String remark = getStr(tb.getRow(6).getCell(1).getParagraph(0).text());
            String classify = getStr(tb.getRow(7).getCell(1).getParagraph(0).text());
            StringBuilder question = new StringBuilder();
            for (int i=0;i<tb.getRow(8).getCell(1).numParagraphs();i++){
                question.append(getStr(tb.getRow(8).getCell(1).getParagraph(i).text())).append("\n");
            }
            question = new StringBuilder(getStr(question.toString()));
            StringBuilder suggestion = new StringBuilder();
            for (int i=0;i<tb.getRow(9).getCell(1).numParagraphs();i++){
                suggestion.append(getStr(tb.getRow(9).getCell(1).getParagraph(i).text())).append("\n");
            }
            suggestion = new StringBuilder(getStr(suggestion.toString()));

            String info = time + code + urgent + type + reso + resp + scur + name + phone + address +
                    remark + classify + question + suggestion;
            System.out.println(info);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getFileContent(String strPath) {
        File[] files = new File(strPath).listFiles();
        if (files != null) {
            for (File file : files) {
                String fileName = file.getName();
                if (fileName.endsWith("doc")) {
                    readDoc(file.getAbsolutePath());
                }
            }
        }
    }

    public static void main(String[] args) {
        getFileContent("D:\\承办单");
    }
}