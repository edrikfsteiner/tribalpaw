package com.tribalpaw.api.mapper;

import com.tribalpaw.api.dto.province.ProvinceRequestDto;
import com.tribalpaw.api.dto.province.ProvinceResponseDto;
import com.tribalpaw.api.model.province.Province;

public class ProvinceMapper {
    public static ProvinceResponseDto toDto(Province model) {
        return new ProvinceResponseDto(
                model.getId(),
                model.getName(),
                model.getPopulation(),
                model.getPopGrowth(),
                model.getWoodGrowth(),
                model.getStoneGrowth(),
                model.getMetalGrowth(),
                model.getGoldGrowth(),
                model.getTechGrowth(),
                model.getCountry(),
                model.getBuildings()
        );
    }

    public static Province toModel(ProvinceRequestDto dto) {
        return Province.builder()
                .name(dto.name())
                .country(dto.country())
                .buildings(dto.buildings())
                .build();
    }
}