package services.dashboard.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import services.dashboard.api.entities.EmployeeStat;

public interface EmployeeRepository  extends JpaRepository<EmployeeStat, Long> {
}
