package com.tribalpaw.api.mapper;

import com.tribalpaw.api.dto.country.CountryRequestDto;
import com.tribalpaw.api.dto.country.CountryResponseDto;
import com.tribalpaw.api.model.country.Country;

public class CountryMapper {
    public static CountryResponseDto toDto(Country model) {
        return new CountryResponseDto(
                model.getId(),
                model.getName(),
                model.getPopulation(),
                model.getWood(),
                model.getStone(),
                model.getMetal(),
                model.getGold(),
                model.getTech(),
                model.getProvinces(),
                model.getArmies()
        );
    }

    public static Country toModel(CountryRequestDto dto) {
        return Country.builder()
                .name(dto.name())
                .provinces(dto.provinces())
                .armies(dto.armies())
                .build();
    }
}