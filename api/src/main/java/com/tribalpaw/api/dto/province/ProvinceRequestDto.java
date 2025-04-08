package com.tribalpaw.api.dto.province;

import com.tribalpaw.api.model.building.Building;
import com.tribalpaw.api.model.country.Country;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.ArrayList;

public record ProvinceRequestDto(
        @NotBlank(message = "Invalid name")
        String name,

        @NotEmpty(message = "Invalid country")
        Country country,

        ArrayList<Building> buildings
) {}