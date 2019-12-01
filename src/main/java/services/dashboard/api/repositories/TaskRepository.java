package services.dashboard.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import services.dashboard.api.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
