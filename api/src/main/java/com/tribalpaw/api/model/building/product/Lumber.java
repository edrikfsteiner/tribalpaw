package com.tribalpaw.api.model.building.product;

import com.tribalpaw.api.model.building.Building;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lumber implements Building {
    private final String name = "Lumber";
    private Integer level = 1;
    private Double wood_growth = 1.0;

    @Override
    public Integer levelUp() {
        this.level += 1;
        this.wood_growth *= 2;
        return this.level;
    }
}