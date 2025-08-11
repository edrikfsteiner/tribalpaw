package com.tribalpaw.api.province.dto;

import com.tribalpaw.api.building.dto.BuildingResponseDto;
import com.tribalpaw.api.country.dto.CountryResponseDto;

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