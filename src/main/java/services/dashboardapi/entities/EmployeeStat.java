package services.dashboardapi.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
public class EmployeeStat extends BaseEntity {
    private String firstName;
    private String lastName;
    private float salary;

    @ManyToOne
    private Country country;
}
