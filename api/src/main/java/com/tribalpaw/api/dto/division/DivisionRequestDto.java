package com.tribalpaw.api.dto.division;

import com.tribalpaw.api.dto.army.ArmyRequestDto;
import com.tribalpaw.api.model.division.DivisionType;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record DivisionRequestDto(
        @NotEmpty(message = "Invalid id")
        Long id,

        @NotEmpty(message = "Invalid division type")
        DivisionType type,

        @NotNull
        Integer level,

        Double organization,
        Double damage,
        Double defense,

        @NotEmpty(message = "Invalid army")
        ArmyRequestDto army
) {}