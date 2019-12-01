package services.dashboard.api.entities;

import lombok.Data;

@Data
public class EmployeeStat extends BaseEntity {
    private String firstName;
    private String lastName;
    private float salary;

    private Country country;
}
