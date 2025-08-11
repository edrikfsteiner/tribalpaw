package com.tribalpaw.api.province.dto;

import com.tribalpaw.api.building.dto.BuildingRequestDto;
import com.tribalpaw.api.country.dto.CountryRequestDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public record ProvinceRequestDto(
        @NotEmpty(message = "Invalid id")
        Long id,

        @NotBlank(message = "Invalid name")
        String name,

        @NotEmpty(message = "Invalid country")
        CountryRequestDto country,

        List<BuildingRequestDto> buildings
) {}