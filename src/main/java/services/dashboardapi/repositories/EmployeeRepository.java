package services.dashboardapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import services.dashboardapi.entities.EmployeeStat;

import java.util.List;

public interface EmployeeRepository  extends JpaRepository<EmployeeStat, Long> {
}
