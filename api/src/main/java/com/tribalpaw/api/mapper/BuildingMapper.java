package com.tribalpaw.api.mapper;

import com.tribalpaw.api.dto.building.BuildingRequestDto;
import com.tribalpaw.api.dto.building.BuildingResponseDto;
import com.tribalpaw.api.model.building.Building;

public class BuildingMapper {
    public static BuildingResponseDto toDto(Building model) {
        return new BuildingResponseDto(
                model.getId(),
                model.getName(),
                model.getLevel(),
                model.getResourceGrowth(),
                model.getProvince()
        );
    }

    public static Building toModel(BuildingRequestDto dto) {
        return Building.builder()
                .name(dto.name())
                .level(dto.level())
                .province(dto.province())
                .build();
    }
}