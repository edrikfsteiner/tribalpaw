package com.tribalpaw.api.building.model.product;

import com.tribalpaw.api.building.model.Building;
import com.tribalpaw.api.province.model.Province;

public class University extends Building {
    public University(Long id, String name, Integer level, Double resourceGrowth, Province province) {
        super(id, name, level, resourceGrowth, province);
    }
}