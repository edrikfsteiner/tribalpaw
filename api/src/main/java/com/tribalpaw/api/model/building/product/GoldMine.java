package com.tribalpaw.api.model.building.product;

import com.tribalpaw.api.model.building.Building;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GoldMine implements Building {
    private final String name = "Gold mine";
    private Integer level = 1;
    private Double gold_growth = 1.0;

    @Override
    public Integer levelUp() {
        this.level += 1;
        this.gold_growth *= 2;
        return this.level;
    }
}