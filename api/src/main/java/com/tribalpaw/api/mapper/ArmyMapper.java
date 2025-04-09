package com.tribalpaw.api.mapper;

import com.tribalpaw.api.dto.army.ArmyRequestDto;
import com.tribalpaw.api.dto.army.ArmyResponseDto;
import com.tribalpaw.api.model.army.Army;

public class ArmyMapper {
    public static ArmyResponseDto toDto(Army model) {
        return new ArmyResponseDto(
                model.getId(),
                model.getName(),
                model.getCountry(),
                model.getDivisions()
        );
    }

    public static Army toModel(ArmyRequestDto dto) {
        return Army.builder()
                .name(dto.name())
                .country(dto.country())
                .divisions(dto.divisions())
                .build();
    }
}