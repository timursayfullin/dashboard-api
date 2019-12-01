package services.dashboard.api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import services.dashboard.api.entities.Country;
import services.dashboard.api.entities.EmployeeStat;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @RequestMapping(method = RequestMethod.GET, value = "/employees/stats")
    public List<EmployeeStat> getEmployeeStats() {
        List<EmployeeStat> list = new ArrayList<>();

        EmployeeStat stat = new EmployeeStat();
        stat.setId(1);
        stat.setCountry(new Country("Niger", null));
        stat.setFirstName("Dakota");
        stat.setLastName("Rice");
        stat.setSalary(36.738f);

        list.add(stat);

        stat = new EmployeeStat();
        stat.setId(2);
        stat.setCountry(new Country("Curaçao", null));
        stat.setFirstName("Minerva");
        stat.setLastName("Hooper");
        stat.setSalary(23.789f);

        list.add(stat);

        stat = new EmployeeStat();
        stat.setId(3);
        stat.setCountry(new Country("Netherlands", null));
        stat.setFirstName("Sage");
        stat.setLastName("Rodriguez");
        stat.setSalary(56.142f);

        list.add(stat);

        stat = new EmployeeStat();
        stat.setId(4);
        stat.setCountry(new Country("Korea, South", null));
        stat.setFirstName("Philip");
        stat.setLastName("Chaney");
        stat.setSalary(38.735f);

        list.add(stat);

        return list;
    }
}
