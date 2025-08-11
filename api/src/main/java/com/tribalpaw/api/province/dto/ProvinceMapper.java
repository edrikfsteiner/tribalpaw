package com.tribalpaw.api.province.dto;

import com.tribalpaw.api.province.model.Province;
import com.tribalpaw.api.building.dto.BuildingMapper;
import com.tribalpaw.api.country.dto.CountryMapper;

import java.util.List;

public class ProvinceMapper {
    public static List<Province> toListModel(List<ProvinceRequestDto> dto) {
        return dto.stream().map(ProvinceMapper::toModel).toList();
    }

    public static Province toModel(ProvinceRequestDto dto) {
        return Province.builder()
                .name(dto.name())
                .country(CountryMapper.toModel(dto.country()))
                .buildings(BuildingMapper.toListModel(dto.buildings()))
                .build();
    }

    public static List<ProvinceResponseDto> toListDto(List<Province> dto) {
        return dto.stream().map(ProvinceMapper::toDto).toList();
    }

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
                CountryMapper.toDto(model.getCountry()),
                BuildingMapper.toListDto(model.getBuildings())
        );
    }
}