package com.tribalpaw.api.dto.army;

import com.tribalpaw.api.dto.country.CountryRequestDto;
import com.tribalpaw.api.dto.division.DivisionRequestDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public record ArmyRequestDto(
        @NotEmpty(message = "Invalid id")
        Long id,

        @NotBlank(message = "Invalid name")
        String name,

        @NotEmpty(message = "Invalid country")
        CountryRequestDto country,

        @NotEmpty(message = "Invalid divisions")
        List<DivisionRequestDto> divisions
) {}