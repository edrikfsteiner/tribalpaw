package com.tribalpaw.api.army.dto;

import com.tribalpaw.api.country.dto.CountryMapper;
import com.tribalpaw.api.division.dto.DivisionMapper;
import com.tribalpaw.api.army.model.Army;

import java.util.List;

public class ArmyMapper {
    public static List<Army> toListModel(List<ArmyRequestDto> dto) {
        return dto.stream().map(ArmyMapper::toModel).toList();
    }

    public static Army toModel(ArmyRequestDto dto) {
        return Army.builder()
                .name(dto.name())
                .country(CountryMapper.toModel(dto.country()))
                .divisions(DivisionMapper.toListModel(dto.divisions()))
                .build();
    }

    public static List<ArmyResponseDto> toListDto(List<Army> dto) {
        return dto.stream().map(ArmyMapper::toDto).toList();
    }

    public static ArmyResponseDto toDto(Army model) {
        return new ArmyResponseDto(
                model.getId(),
                model.getName(),
                CountryMapper.toDto(model.getCountry()),
                DivisionMapper.toListDto(model.getDivisions())
        );
    }
}