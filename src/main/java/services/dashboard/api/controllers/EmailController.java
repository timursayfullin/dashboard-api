package services.dashboard.api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import services.dashboard.api.entities.EmailSubscriptionReport;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class EmailController {

    @RequestMapping(method = RequestMethod.GET, value = "/emails/subscriptions")
    public List<EmailSubscriptionReport> getSubscriptions() {
        List<EmailSubscriptionReport> list = new ArrayList<>();

        EmailSubscriptionReport report;
        Random random = new Random();
        Month[] months = Month.values();
        for(int index = 0; index < months.length; index++){
            report = new EmailSubscriptionReport();
            report.setMonth(months[index]);
            report.setQuantity(random.nextInt(800));
            list.add(report);
        }

        return list;
    }
}
