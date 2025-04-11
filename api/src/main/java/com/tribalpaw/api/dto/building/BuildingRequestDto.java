package com.tribalpaw.api.dto.building;

import com.tribalpaw.api.model.province.Province;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record BuildingRequestDto(
        @NotEmpty(message = "Invalid id")
        Long id,

        @NotBlank(message = "Invalid name")
        String name,

        @NotNull(message = "Invalid level")
        Integer level,

        @NotEmpty(message = "Invalid province")
        Province province
) {}