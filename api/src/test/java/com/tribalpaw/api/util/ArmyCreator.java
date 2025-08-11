package com.tribalpaw.api.util;

import com.tribalpaw.api.army.dto.ArmyRequestDto;
import com.tribalpaw.api.army.dto.ArmyResponseDto;
import com.tribalpaw.api.country.dto.CountryRequestDto;
import com.tribalpaw.api.country.dto.CountryResponseDto;
import com.tribalpaw.api.division.dto.DivisionRequestDto;
import com.tribalpaw.api.division.dto.DivisionResponseDto;
import com.tribalpaw.api.army.model.Army;
import com.tribalpaw.api.country.model.Country;
import com.tribalpaw.api.division.model.Division;

import java.util.List;

public class ArmyCreator {
    private static final Country country = CountryCreator.createCountry();
    private static final List<Division> divisions = DivisionCreator.createDivisions();
    private static final CountryRequestDto countryRequestDto = CountryCreator.createCountryRequestDto();
    private static final List<DivisionRequestDto> divisionsRequestDto = DivisionCreator.createDivisionsRequestDto();
    private static final CountryResponseDto countryResponseDto = CountryCreator.createCountryResponseDto();
    private static final List<DivisionResponseDto> divisionsResponseDto = DivisionCreator.createDivisionsResponseDto();

    public static Army createArmy() {
        return Army.builder()
                .id(1L)
                .name("Army")
                .country(country)
                .divisions(divisions)
                .build();
    }

    public static List<Army> createArmies() {
        return List.of(
                Army.builder()
                        .id(1L)
                        .name("Army")
                        .country(country)
                        .divisions(divisions)
                        .build()
        );
    }

    public static ArmyRequestDto createArmyRequestDto() {
        return new ArmyRequestDto(
                1L,
                "Army",
                countryRequestDto,
                divisionsRequestDto
        );
    }

    public static List<ArmyRequestDto> createArmiesRequestDto() {
        return List.of(
                new ArmyRequestDto(
                        1L,
                        "Army",
                        countryRequestDto,
                        divisionsRequestDto
                )
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

    public static List<ArmyResponseDto> createArmiesResponseDto() {
        return List.of(
                new ArmyResponseDto(
                        1L,
                        "Army",
                        countryResponseDto,
                        divisionsResponseDto
                )
        );
    }
}