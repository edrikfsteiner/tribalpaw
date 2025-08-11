package com.tribalpaw.api.army.dto;

import com.tribalpaw.api.country.dto.CountryResponseDto;
import com.tribalpaw.api.division.dto.DivisionResponseDto;

import java.util.List;

public record ArmyResponseDto(
        Long id,
        String name,
        CountryResponseDto country,
        List<DivisionResponseDto> divisions
) {}