package com.tribalpaw.api.util;

import com.tribalpaw.api.dto.province.ProvinceRequestDto;
import com.tribalpaw.api.dto.province.ProvinceResponseDto;
import com.tribalpaw.api.dto.country.CountryRequestDto;
import com.tribalpaw.api.dto.country.CountryResponseDto;
import com.tribalpaw.api.dto.building.BuildingRequestDto;
import com.tribalpaw.api.dto.building.BuildingResponseDto;
import com.tribalpaw.api.model.province.Province;
import com.tribalpaw.api.model.country.Country;
import com.tribalpaw.api.model.building.Building;

import java.util.List;

public class ProvinceCreator {
    private static final Country country = CountryCreator.createCountry();
    private static final List<Building> buildings = BuildingCreator.createBuildings();
    private static final CountryRequestDto countryRequestDto = CountryCreator.createCountryRequestDto();
    private static final List<BuildingRequestDto> buildingsRequestDto = BuildingCreator.createBuildingsRequestDto();
    private static final CountryResponseDto countryResponseDto = CountryCreator.createCountryResponseDto();
    private static final List<BuildingResponseDto> buildingsResponseDto = BuildingCreator.createBuildingsResponseDto();

    public static Province createProvince() {
        return Province.builder()
                .id(1L)
                .name("Province")
                .population(1000)
                .popGrowth(1.0)
                .woodGrowth(1.0)
                .stoneGrowth(1.0)
                .metalGrowth(1.0)
                .goldGrowth(1.0)
                .techGrowth(1.0)
                .country(country)
                .buildings(buildings)
                .build();
    }

    public static List<Province> createProvinces() {
        return List.of(
                Province.builder()
                        .id(1L)
                        .name("Province")
                        .population(1000)
                        .popGrowth(1.0)
                        .woodGrowth(1.0)
                        .stoneGrowth(1.0)
                        .metalGrowth(1.0)
                        .goldGrowth(1.0)
                        .techGrowth(1.0)
                        .country(country)
                        .buildings(buildings)
                        .build()
        );
    }

    public static ProvinceRequestDto createProvinceRequestDto() {
        return new ProvinceRequestDto(
                1L,
                "Province",
                countryRequestDto,
                buildingsRequestDto
        );
    }

    public static List<ProvinceRequestDto> createProvincesRequestDto() {
        return List.of(
                new ProvinceRequestDto(
                        1L,
                        "Province",
                        countryRequestDto,
                        buildingsRequestDto
                )
        );
    }

    public static ProvinceResponseDto createProvinceResponseDto() {
        return new ProvinceResponseDto(
                1L,
                "Province",
                1000,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                countryResponseDto,
                buildingsResponseDto
        );
    }

    public static List<ProvinceResponseDto> createProvincesResponseDto() {
        return List.of(
                new ProvinceResponseDto(
                        1L,
                        "Province",
                        1000,
                        1.0,
                        1.0,
                        1.0,
                        1.0,
                        1.0,
                        1.0,
                        countryResponseDto,
                        buildingsResponseDto
                )
        );
    }
}