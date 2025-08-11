package com.tribalpaw.api.country.dto;

import com.tribalpaw.api.army.dto.ArmyRequestDto;
import com.tribalpaw.api.province.dto.ProvinceRequestDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public record CountryRequestDto(
        @NotEmpty(message = "Invalid id")
        Long id,

        @NotBlank(message = "Invalid name")
        String name,

        List<ProvinceRequestDto> provinces,

        List<ArmyRequestDto> armies
) {}