package com.tribalpaw.api.building.dto;

import com.tribalpaw.api.province.dto.ProvinceResponseDto;

public record BuildingResponseDto(
        Long id,
        String name,
        Integer level,
        Double resourceGrowth,
        ProvinceResponseDto province
) {}