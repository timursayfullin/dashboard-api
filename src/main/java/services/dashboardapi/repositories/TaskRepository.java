package services.dashboardapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import services.dashboardapi.entities.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
