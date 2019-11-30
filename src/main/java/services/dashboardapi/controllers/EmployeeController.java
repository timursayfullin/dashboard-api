package services.dashboardapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import services.dashboardapi.entities.EmployeeStat;
import services.dashboardapi.repositories.EmployeeRepository;

import java.util.List;

@Controller
public class EmployeeController {
    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(
            EmployeeRepository employeeRepository
    ) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeStat> getEmployeeStats() {
        return this.employeeRepository.findAll();
    }
}
