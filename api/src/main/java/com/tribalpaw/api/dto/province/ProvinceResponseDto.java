package com.tribalpaw.api.dto.province;

import com.tribalpaw.api.model.building.Building;
import com.tribalpaw.api.model.country.Country;

import java.util.ArrayList;

public record ProvinceResponseDto(
        Long id,
        String name,
        Integer population,
        Double popGrowth,
        Double woodGrowth,
        Double stoneGrowth,
        Double metalGrowth,
        Double goldGrowth,
        Double techGrowth,
        Country country,
        ArrayList<Building> buildings
) {}