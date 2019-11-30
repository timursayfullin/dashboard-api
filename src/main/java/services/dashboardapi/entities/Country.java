package services.dashboardapi.entities;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Country extends BaseEntity{
    private String name;
    private String code;
}
