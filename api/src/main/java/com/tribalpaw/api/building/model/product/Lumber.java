package com.tribalpaw.api.building.model.product;

import com.tribalpaw.api.building.model.Building;
import com.tribalpaw.api.province.model.Province;

public class Lumber extends Building {
    public Lumber(Long id, String name, Integer level, Double resource_growth, Province province) {
        super(id, name, level, resource_growth, province);
    }
}