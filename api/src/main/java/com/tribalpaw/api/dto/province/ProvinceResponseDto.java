package com.tribalpaw.api.dto.province;

import com.tribalpaw.api.model.building.Building;
import com.tribalpaw.api.model.country.Country;

import java.util.ArrayList;

public record ProvinceResponseDto(
        Long id,
        String name,
        Integer population,
        Double pop_growth,
        Double wood_growth,
        Double stone_growth,
        Double metal_growth,
        Double gold_growth,
        Double tech_growth,
        Country country,
        ArrayList<Building> buildings
) {}