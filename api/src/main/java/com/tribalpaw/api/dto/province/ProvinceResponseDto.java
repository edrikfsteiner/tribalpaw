package com.tribalpaw.api.dto.province;

import com.tribalpaw.api.dto.building.BuildingResponseDto;
import com.tribalpaw.api.dto.country.CountryResponseDto;

import java.util.List;

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
        CountryResponseDto country,
        List<BuildingResponseDto> buildings
) {}