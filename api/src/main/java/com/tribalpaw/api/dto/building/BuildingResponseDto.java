package com.tribalpaw.api.dto.building;

import com.tribalpaw.api.dto.province.ProvinceResponseDto;

public record BuildingResponseDto(
        Long id,
        String name,
        Integer level,
        Double resourceGrowth,
        ProvinceResponseDto province
) {}