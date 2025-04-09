package com.tribalpaw.api.dto.division;

import com.tribalpaw.api.model.army.Army;
import com.tribalpaw.api.model.division.DivisionType;
import jakarta.validation.constraints.NotEmpty;

public record DivisionRequestDto(
        @NotEmpty(message = "Invalid division type")
        DivisionType type,

        Integer level,
        Double organization,
        Double damage,
        Double defense,

        @NotEmpty(message = "Invalid army")
        Army army
) {}