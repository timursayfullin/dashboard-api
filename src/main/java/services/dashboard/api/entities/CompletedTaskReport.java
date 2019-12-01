package services.dashboard.api.entities;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class CompletedTaskReport extends BaseEntity {
    private LocalTime time;
    private TaskStatus status = TaskStatus.COMPLETED;
    private int quantity;
}
