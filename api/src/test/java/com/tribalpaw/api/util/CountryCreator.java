package com.tribalpaw.api.util;

import com.tribalpaw.api.dto.country.CountryRequestDto;
import com.tribalpaw.api.dto.country.CountryResponseDto;
import com.tribalpaw.api.dto.army.ArmyRequestDto;
import com.tribalpaw.api.dto.army.ArmyResponseDto;
import com.tribalpaw.api.dto.province.ProvinceRequestDto;
import com.tribalpaw.api.dto.province.ProvinceResponseDto;
import com.tribalpaw.api.model.country.Country;
import com.tribalpaw.api.model.army.Army;
import com.tribalpaw.api.model.province.Province;

import java.util.List;

public class CountryCreator {
    private static final List<Army> armies = ArmyCreator.createArmies();
    private static final List<Province> provinces = ProvinceCreator.createProvinces();
    private static final List<ArmyRequestDto> armiesRequestDto = ArmyCreator.createArmiesRequestDto();
    private static final List<ProvinceRequestDto> provincesRequestDto = ProvinceCreator.createProvincesRequestDto();
    private static final List<ArmyResponseDto> armiesResponseDto = ArmyCreator.createArmiesResponseDto();
    private static final List<ProvinceResponseDto> provincesResponseDto = ProvinceCreator.createProvincesResponseDto();

    public static Country createCountry() {
        return Country.builder()
                .id(1L)
                .name("Country")
                .wood(1.0)
                .stone(1.0)
                .metal(1.0)
                .gold(1.0)
                .tech(1.0)
                .provinces(provinces)
                .armies(armies)
                .build();
    }

    public static CountryRequestDto createCountryRequestDto() {
        return new CountryRequestDto(
                1L,
                "Country",
                provincesRequestDto,
                armiesRequestDto
        );
    }

    public static CountryResponseDto createCountryResponseDto() {
        return new CountryResponseDto(
                1L,
                "Country",
                1000,
                1.0,
                1.0,
                1.0,
                1.0,
                1.0,
                provincesResponseDto,
                armiesResponseDto
        );
    }
}