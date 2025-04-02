package com.tribalpaw.api.dto.army;

import com.tribalpaw.api.model.army.division.Division;
import com.tribalpaw.api.model.country.Country;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.ArrayList;

public record ArmyRequestDto(
        @NotBlank(message = "Invalid name")
        String name,

        @NotEmpty(message = "Invalid country")
        Country country,

        @NotEmpty(message = "Invalid divisions")
        ArrayList<Division> divisions
) {}