package com.tribalpaw.api.division.dto;

import com.tribalpaw.api.army.dto.ArmyMapper;
import com.tribalpaw.api.division.model.Division;
import com.tribalpaw.api.division.model.DivisionBuilder;

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