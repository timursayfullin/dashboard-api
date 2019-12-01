package services.dashboard.api.entities;

import lombok.Data;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Data
public class DaylySaleReport extends BaseEntity {
    private DayOfWeek day;
    private int quantity;
}
