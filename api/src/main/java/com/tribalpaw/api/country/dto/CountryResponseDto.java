package com.tribalpaw.api.country.dto;

import com.tribalpaw.api.army.dto.ArmyResponseDto;
import com.tribalpaw.api.province.dto.ProvinceResponseDto;

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