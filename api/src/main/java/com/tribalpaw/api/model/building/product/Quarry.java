package com.tribalpaw.api.model.building.product;

import com.tribalpaw.api.model.building.Building;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Quarry implements Building {
    private final String name = "Quarry";
    private Integer level = 1;
    private Double stone_growth = 1.0;

    @Override
    public Integer levelUp() {
        this.level += 1;
        this.stone_growth *= 2;
        return this.level;
    }
}