package com.tribalpaw.api.dto.building;

import com.tribalpaw.api.model.province.Province;

public record BuildingResponseDto(
        Long id,
        String name,
        Integer level,
        Double pop_growth,
        Double wood_growth,
        Double stone_growth,
        Double metal_growth,
        Double gold_growth,
        Double tech_growth,
        Province province
) {}