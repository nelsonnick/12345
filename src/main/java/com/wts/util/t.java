package com.wts.util;

import com.jfinal.kit.PropKit;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.wts.util.util12345.*;

public class t {
    public static void main(String[] args) {
        Date d= new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeNow = sdf.format(d);
        System.out.println(timeNow);
    }
}
