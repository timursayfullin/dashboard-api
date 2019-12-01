package services.dashboard.api.entities;

import lombok.Data;

import java.time.Month;

@Data
public class EmailSubscriptionReport extends BaseEntity {
    private Month month;
    private int quantity;
}
