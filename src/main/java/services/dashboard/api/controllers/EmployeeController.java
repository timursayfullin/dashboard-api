package services.dashboard.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import services.dashboard.api.entities.EmployeeStat;
import services.dashboard.api.repositories.EmployeeRepository;

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
