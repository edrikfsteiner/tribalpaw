package com.tribalpaw.api.dto.army;

import com.tribalpaw.api.dto.country.CountryResponseDto;
import com.tribalpaw.api.dto.division.DivisionResponseDto;

import java.util.List;

public record ArmyResponseDto(
        Long id,
        String name,
        CountryResponseDto country,
        List<DivisionResponseDto> divisions
) {}