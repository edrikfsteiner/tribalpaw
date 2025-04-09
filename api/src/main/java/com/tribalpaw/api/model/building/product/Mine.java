package com.tribalpaw.api.model.building.product;

import com.tribalpaw.api.model.building.Building;
import com.tribalpaw.api.model.province.Province;
import lombok.Getter;
import lombok.Setter;

public class Mine extends Building {
    public Mine(Long id, String name, Integer level, Double resource_growth, Province province) {
        super(id, name, level, resource_growth, province);
    }
}