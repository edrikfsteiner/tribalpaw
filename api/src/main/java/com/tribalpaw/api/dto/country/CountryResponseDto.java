package com.tribalpaw.api.dto.country;

import com.tribalpaw.api.dto.army.ArmyResponseDto;
import com.tribalpaw.api.dto.province.ProvinceResponseDto;

import java.util.List;

public record CountryResponseDto(
        Long id,
        String name,
        Integer population,
        Double wood,
        Double stone,
        Double metal,
        Double gold,
        Double tech,
        List<ProvinceResponseDto> provinces,
        List<ArmyResponseDto> armies
) {}