package com.tribalpaw.api.dto.country;

import com.tribalpaw.api.dto.army.ArmyRequestDto;
import com.tribalpaw.api.dto.province.ProvinceRequestDto;
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