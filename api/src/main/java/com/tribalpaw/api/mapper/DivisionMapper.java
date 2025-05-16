package com.tribalpaw.api.mapper;

import com.tribalpaw.api.dto.division.DivisionRequestDto;
import com.tribalpaw.api.dto.division.DivisionResponseDto;
import com.tribalpaw.api.model.division.Division;
import com.tribalpaw.api.model.division.DivisionBuilder;

import java.util.List;

public class DivisionMapper {
    public static List<Division> toListModel(List<DivisionRequestDto> dto) {
        return dto.stream().map(DivisionMapper::toModel).toList();
    }

    public static Division toModel(DivisionRequestDto dto) {
        return new DivisionBuilder().build(dto.type());
    }

    public static List<DivisionResponseDto> toListDto(List<Division> model) {
        return model.stream().map(DivisionMapper::toDto).toList();
    }

    public static DivisionResponseDto toDto(Division model) {
        return new DivisionResponseDto(
                model.getId(),
                model.getType(),
                model.getLevel(),
                model.getOrganization(),
                model.getDamage(),
                model.getDefense(),
                ArmyMapper.toDto(model.getArmy())
        );
    }
}