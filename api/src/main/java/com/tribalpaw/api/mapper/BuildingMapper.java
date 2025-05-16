package com.tribalpaw.api.mapper;

import com.tribalpaw.api.dto.building.BuildingResponseDto;
import com.tribalpaw.api.dto.building.BuildingRequestDto;
import com.tribalpaw.api.model.building.Building;

import java.util.List;

public class BuildingMapper {
    public static List<Building> toListModel(List<BuildingRequestDto> dto) {
        return dto.stream().map(BuildingMapper::toModel).toList();
    }

    public static Building toModel(BuildingRequestDto dto) {
        return Building.builder()
                .name(dto.name())
                .level(dto.level())
                .province(ProvinceMapper.toModel(dto.province()))
                .build();
    }

    public static List<BuildingResponseDto> toListDto(List<Building> dto) {
        return dto.stream().map(BuildingMapper::toDto).toList();
    }

    public static BuildingResponseDto toDto(Building model) {
        return new BuildingResponseDto(
                model.getId(),
                model.getName(),
                model.getLevel(),
                model.getResourceGrowth(),
                ProvinceMapper.toDto(model.getProvince())
        );
    }
}