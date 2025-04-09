package com.tribalpaw.api.dto.army;

import com.tribalpaw.api.model.division.Division;
import com.tribalpaw.api.model.country.Country;

import java.util.ArrayList;

public record ArmyResponseDto(
        Long id,
        String name,
        Country country,
        ArrayList<Division> divisions
) {}