package services.dashboard.api.entities;

import lombok.Data;

@Data
public class Country extends BaseEntity {
    private String name;
    private String code;

    public Country() {
    }

    public Country(String name, String code) {
        this.name = name;
        this.code = code;
    }
}
