package services.dashboard.api.entities;

import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
@Data
public class Sale extends BaseEntity {
    private LocalDateTime datetime;
}
