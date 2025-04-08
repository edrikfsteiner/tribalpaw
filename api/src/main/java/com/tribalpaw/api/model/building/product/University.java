package com.tribalpaw.api.model.building.product;

import com.tribalpaw.api.model.building.Building;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class University implements Building {
    private final String name = "University";
    private Integer level = 1;
    private Double tech_growth = 1.0;

    @Override
    public Integer levelUp() {
        this.level += 1;
        this.tech_growth *= 2;
        return this.level;
    }
}