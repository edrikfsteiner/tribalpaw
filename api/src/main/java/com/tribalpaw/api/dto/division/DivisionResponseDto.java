package com.tribalpaw.api.dto.division;

import com.tribalpaw.api.model.army.Army;
import com.tribalpaw.api.model.division.DivisionType;

public record DivisionResponseDto(
        Long id,
        DivisionType type,
        Integer level,
        Double organization,
        Double damage,
        Double defense,
        Army army
) {}