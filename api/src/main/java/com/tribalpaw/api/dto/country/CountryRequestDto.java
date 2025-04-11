package com.tribalpaw.api.dto.country;

import com.tribalpaw.api.model.army.Army;
import com.tribalpaw.api.model.province.Province;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.ArrayList;

public record CountryRequestDto(
        @NotEmpty(message = "Invalid id")
        Long id,

        @NotBlank(message = "Invalid name")
        String name,

        ArrayList<Province> provinces,

        ArrayList<Army> armies
) {}