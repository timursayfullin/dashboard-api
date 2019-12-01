package services.dashboard.api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import services.dashboard.api.entities.CompletedTaskReport;
import services.dashboard.api.entities.EmailSubscriptionReport;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class TaskController {

    @RequestMapping(method = RequestMethod.GET, value = "/tasks/completed")
    public List<CompletedTaskReport> getCompletedTasks() {
        List<CompletedTaskReport> list = new ArrayList<>();

        CompletedTaskReport report;
        Random random = new Random();
        for (int index = 0; index <= 23; index += 3) {
            report = new CompletedTaskReport();
            report.setTime(LocalTime.of(index,0));
            report.setQuantity(random.nextInt(800));
            list.add(report);
        }

        return list;
    }
}
