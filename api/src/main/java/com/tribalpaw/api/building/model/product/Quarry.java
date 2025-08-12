package com.tribalpaw.api.building.model.product;

import com.tribalpaw.api.building.model.Building;
import com.tribalpaw.api.province.model.Province;

public class Quarry extends Building {
    public Quarry(Long id, String name, Integer level, Double resourceGrowth, Province province) {
        super(id, name, level, resourceGrowth, province);
    }
}