package com.tribalpaw.api.division.dto;

import com.tribalpaw.api.army.dto.ArmyResponseDto;
import com.tribalpaw.api.division.model.DivisionType;

public record DivisionResponseDto(
        Long id,
        DivisionType type,
        Integer level,
        Double organization,
        Double damage,
        Double defense,
        ArmyResponseDto army
) {}