package com.tribalpaw.api.model.building.product;

import com.tribalpaw.api.model.building.Building;
import com.tribalpaw.api.model.province.Province;

public class Lumber extends Building {
    public Lumber(Long id, String name, Integer level, Double resource_growth, Province province) {
        super(id, name, level, resource_growth, province);
    }
}