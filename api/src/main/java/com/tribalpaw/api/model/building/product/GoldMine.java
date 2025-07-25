package com.tribalpaw.api.model.building.product;

import com.tribalpaw.api.model.building.Building;
import com.tribalpaw.api.model.province.Province;

public class GoldMine extends Building {
    public GoldMine(Long id, String name, Integer level, Double resource_growth, Province province) {
        super(id, name, level, resource_growth, province);
    }
}