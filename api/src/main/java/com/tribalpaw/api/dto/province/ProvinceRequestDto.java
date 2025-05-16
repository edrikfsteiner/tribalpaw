package com.tribalpaw.api.dto.province;

import com.tribalpaw.api.dto.building.BuildingRequestDto;
import com.tribalpaw.api.dto.country.CountryRequestDto;
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