package com.tribalpaw.api.dto.building;

import com.tribalpaw.api.model.province.Province;

public record BuildingResponseDto(
        Long id,
        String name,
        Integer level,
        Double resourceGrowth,
        Province province
) {}