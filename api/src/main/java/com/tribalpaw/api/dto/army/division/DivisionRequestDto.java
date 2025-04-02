package com.tribalpaw.api.dto.army.division;

import com.tribalpaw.api.model.army.Army;
import com.tribalpaw.api.model.army.division.DivisionType;
import jakarta.validation.constraints.NotEmpty;

public record DivisionRequestDto(
        DivisionType type,
        Integer level,
        Double organization,
        Double damage,
        Double defense,

        @NotEmpty(message = "Invalid army")
        Army army
) {}