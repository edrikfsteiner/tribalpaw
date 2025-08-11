package com.tribalpaw.api.building.model.product;

import com.tribalpaw.api.building.model.Building;
import com.tribalpaw.api.province.model.Province;

public class Mine extends Building {
    public Mine(Long id, String name, Integer level, Double resource_growth, Province province) {
        super(id, name, level, resource_growth, province);
    }
}