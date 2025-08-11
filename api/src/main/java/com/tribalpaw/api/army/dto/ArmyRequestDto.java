package com.tribalpaw.api.army.dto;

import com.tribalpaw.api.country.dto.CountryRequestDto;
import com.tribalpaw.api.division.dto.DivisionRequestDto;
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

        List<DivisionRequestDto> divisions
) {}