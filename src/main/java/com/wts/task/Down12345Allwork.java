package com.wts.task;

import com.jfinal.kit.PropKit;
import com.wts.entity.model.Allwork;
import com.wts.service.AllworkService;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static com.wts.util.util12345.*;

public class Down12345Allwork implements Runnable {

    @Override
    public void run() {

    }


    public static void saveAllwork(String file_guid, String order_guid, String order_code, String link_person, String link_phone, String link_address, String send_time, String problem_description, String transfer_opinion, String transfer_process) {
        AllworkService service = new AllworkService();
        if (service.findNumByGUID(order_guid) == 0) {
            service.add(file_guid, order_guid, order_code, link_person, link_phone, link_address, send_time, problem_description,transfer_opinion,transfer_process);
        }
    }

    public static void main(String[] args) {

    }
}
