package com.tribalpaw.api.dto.country;

import com.tribalpaw.api.model.army.Army;
import com.tribalpaw.api.model.province.Province;

import java.util.ArrayList;

public record CountryResponseDto(
        Long id,
        String name,
        Integer population,
        Double wood,
        Double stone,
        Double metal,
        Double gold,
        Double tech,
        ArrayList<Province> provinces,
        ArrayList<Army> armies
) {}