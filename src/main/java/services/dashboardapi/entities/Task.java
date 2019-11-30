package services.dashboardapi.entities;

import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
@Data
public class Task extends BaseEntity {
    private LocalDateTime datetime;
    private TaskStatus status;
}
