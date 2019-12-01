package services.dashboard.api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import services.dashboard.api.entities.DaylySaleReport;
import services.dashboard.api.entities.EmailSubscriptionReport;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class SaleController {

    @RequestMapping(method = RequestMethod.GET, value = "/sales/daily")
    public List<DaylySaleReport> getDailySales() {
        List<DaylySaleReport> list = new ArrayList<>();

        DaylySaleReport report;
        Random random = new Random();
        DayOfWeek[] dayOfWeeks = DayOfWeek.values();
        for(int index = 0; index < dayOfWeeks.length; index++){
            report = new DaylySaleReport();
            report.setDay(dayOfWeeks[index]);
            report.setQuantity(random.nextInt(40));
            list.add(report);
        }

        return list;
    }
}
