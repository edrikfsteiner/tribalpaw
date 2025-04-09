package com.tribalpaw.api.mapper;

import com.tribalpaw.api.dto.division.DivisionRequestDto;
import com.tribalpaw.api.dto.division.DivisionResponseDto;
import com.tribalpaw.api.model.division.Division;
import com.tribalpaw.api.model.division.DivisionBuilder;

public class DivisionMapper {
    public static DivisionResponseDto toDto(Division model) {
        return new DivisionResponseDto(
                model.getId(),
                model.getType(),
                model.getLevel(),
                model.getOrganization(),
                model.getDamage(),
                model.getDefense(),
                model.getArmy()
        );
    }

    public static Division toModel(DivisionRequestDto dto) {
        return new DivisionBuilder().build(dto.type());
    }
}