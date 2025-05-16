package com.tribalpaw.api.util;

import com.tribalpaw.api.dto.division.DivisionRequestDto;
import com.tribalpaw.api.dto.division.DivisionResponseDto;
import com.tribalpaw.api.dto.army.ArmyRequestDto;
import com.tribalpaw.api.dto.army.ArmyResponseDto;
import com.tribalpaw.api.model.division.Division;
import com.tribalpaw.api.model.army.Army;
import com.tribalpaw.api.model.division.DivisionBuilder;
import com.tribalpaw.api.model.division.DivisionType;

import java.util.List;

public class DivisionCreator {
    private static final DivisionType type = DivisionType.LEVY;
    private static final DivisionBuilder builder = new DivisionBuilder();
    private static final Army army = ArmyCreator.createArmy();
    private static final ArmyRequestDto armyRequestDto = ArmyCreator.createArmyRequestDto();
    private static final ArmyResponseDto armyResponseDto = ArmyCreator.createArmyResponseDto();

    public static Division createDivision() {
        return builder.build(type);
    }

    public static List<Division> createDivisions() {
        return List.of(
                builder.build(type)
        );
    }

    public static DivisionRequestDto createDivisionRequestDto() {
        return new DivisionRequestDto(
                1L,
                type,
                1,
                1.0,
                1.0,
                1.0,
                armyRequestDto
        );
    }

    public static List<DivisionRequestDto> createDivisionsRequestDto() {
        return List.of(
                new DivisionRequestDto(
                        1L,
                        type,
                        1,
                        1.0,
                        1.0,
                        1.0,
                        armyRequestDto
                )
        );
    }

    public static DivisionResponseDto createDivisionResponseDto() {
        return new DivisionResponseDto(
                1L,
                type,
                1,
                1.0,
                1.0,
                1.0,
                armyResponseDto
        );
    }

    public static List<DivisionResponseDto> createDivisionsResponseDto() {
        return List.of(
                new DivisionResponseDto(
                        1L,
                        type,
                        1,
                        1.0,
                        1.0,
                        1.0,
                        armyResponseDto
                )
        );
    }
}