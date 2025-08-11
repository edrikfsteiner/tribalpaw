package com.tribalpaw.api.util;

import com.tribalpaw.api.building.dto.BuildingRequestDto;
import com.tribalpaw.api.building.dto.BuildingResponseDto;
import com.tribalpaw.api.province.dto.ProvinceRequestDto;
import com.tribalpaw.api.province.dto.ProvinceResponseDto;
import com.tribalpaw.api.building.model.Building;
import com.tribalpaw.api.province.model.Province;

import java.util.List;

public class BuildingCreator {
    private static final Province province = ProvinceCreator.createProvince();
    private static final ProvinceRequestDto provinceRequestDto = ProvinceCreator.createProvinceRequestDto();
    private static final ProvinceResponseDto provinceResponseDto = ProvinceCreator.createProvinceResponseDto();

    public static Building createBuilding() {
        return Building.builder()
                .id(1L)
                .name("Building")
                .level(1)
                .resourceGrowth(1.0)
                .province(province)
                .build();
    }

    public static List<Building> createBuildings() {
        return List.of(
                Building.builder()
                        .id(1L)
                        .name("Lumber")
                        .level(1)
                        .resourceGrowth(1.0)
                        .province(province)
                        .build()
        );
    }

    public static BuildingRequestDto createBuildingRequestDto() {
        return new BuildingRequestDto(
                1L,
                "Lumber",
                1,
                provinceRequestDto
        );
    }

    public static List<BuildingRequestDto> createBuildingsRequestDto() {
        return List.of(
                new BuildingRequestDto(
                        1L,
                        "Lumber",
                        1,
                        provinceRequestDto
                )
        );
    }

    public static BuildingResponseDto createBuildingResponseDto() {
        return new BuildingResponseDto(
                1L,
                "Lumber",
                1,
                1.0,
                provinceResponseDto
        );
    }

    public static List<BuildingResponseDto> createBuildingsResponseDto() {
        return List.of(
                new BuildingResponseDto(
                        1L,
                        "Lumber",
                        1,
                        1.0,
                        provinceResponseDto
                )
        );
    }
}