package com.tribalpaw.api.util;

import com.tribalpaw.api.dto.army.ArmyRequestDto;
import com.tribalpaw.api.dto.army.ArmyResponseDto;
import com.tribalpaw.api.model.army.Army;
import com.tribalpaw.api.model.country.Country;
import com.tribalpaw.api.model.division.Division;

import java.util.ArrayList;

public class ArmyCreator {
    private static final Country country = CountryCreator.createCountry();
    private static final ArrayList<Division> divisions = DivisionCreator.createDivisions();
    private static final Country countryRequestDto = CountryCreator.createCountryRequestDto();
    private static final ArrayList<Division> divisionsRequestDto = DivisionCreator.createDivisionsRequestDto();
    private static final Country countryResponseDto = CountryCreator.createCountryResponseDto();
    private static final ArrayList<Division> divisionsResponseDto = DivisionCreator.createDivisionsResponseDto();

    public static Army createArmy() {
        return Army.builder()
                .id(1L)
                .name("Army")
                .country(country)
                .divisions(divisions)
                .build();
    }

    public static ArmyRequestDto createArmyRequestDto() {
        return new ArmyRequestDto(
                1L,
                "Army",
                countryRequestDto,
                divisionsRequestDto
        );
    }

    public static ArmyResponseDto createArmyResponseDto() {
        return new ArmyResponseDto(
                1L,
                "Army",
                countryResponseDto,
                divisionsResponseDto
        );
    }
}