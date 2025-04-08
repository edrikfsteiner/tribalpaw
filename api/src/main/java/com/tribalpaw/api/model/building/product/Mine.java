package com.tribalpaw.api.model.building.product;

import com.tribalpaw.api.model.building.Building;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mine implements Building {
    private final String name = "Mine";
    private Integer level = 1;
    private Double metal_growth = 1.0;

    @Override
    public Integer levelUp() {
        this.level += 1;
        this.metal_growth *= 2;
        return this.level;
    }
}