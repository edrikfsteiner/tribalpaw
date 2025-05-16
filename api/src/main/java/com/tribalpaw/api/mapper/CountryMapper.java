package com.tribalpaw.api.mapper;

import com.tribalpaw.api.dto.country.CountryRequestDto;
import com.tribalpaw.api.dto.country.CountryResponseDto;
import com.tribalpaw.api.model.country.Country;

import java.util.List;

public class CountryMapper {
    public static List<Country> toListModel(List<CountryRequestDto> dto) {
        return dto.stream().map(CountryMapper::toModel).toList();
    }

    public static Country toModel(CountryRequestDto dto) {
        return Country.builder()
                .name(dto.name())
                .provinces(ProvinceMapper.toListModel(dto.provinces()))
                .armies(ArmyMapper.toListModel(dto.armies()))
                .build();
    }

    public static List<CountryResponseDto> toListDto(List<Country> dto) {
        return dto.stream().map(CountryMapper::toDto).toList();
    }

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
                ProvinceMapper.toListDto(model.getProvinces()),
                ArmyMapper.toListDto(model.getArmies())
        );
    }
}