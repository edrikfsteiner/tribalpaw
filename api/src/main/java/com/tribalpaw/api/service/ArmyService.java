package com.tribalpaw.api.service;

import com.tribalpaw.api.dto.army.ArmyRequestDto;
import com.tribalpaw.api.dto.army.ArmyResponseDto;
import com.tribalpaw.api.exception.BadRequestException;
import com.tribalpaw.api.exception.NotFoundException;
import com.tribalpaw.api.mapper.ArmyMapper;
import com.tribalpaw.api.model.army.Army;
import com.tribalpaw.api.repository.ArmyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ArmyService {
    @Autowired
    private ArmyRepository repository;

    public List<ArmyResponseDto> getAll() {
        List<Army> armies = repository.findAll();
        if (armies.isEmpty()) {
            throw new NotFoundException("No armies found");
        }
        return armies.stream().map(ArmyMapper::toDto).toList();
    }

    public ArmyResponseDto getById(Long id) {
        return ArmyMapper.toDto(
                repository.findById(id)
                        .orElseThrow(() -> new NotFoundException("Army not found"))
        );
    }

    @Transactional
    public ArmyResponseDto post(ArmyRequestDto dto) {
        return ArmyMapper.toDto(repository.save(ArmyMapper.toModel(dto)));
    }

    @Transactional
    public ArmyResponseDto put(ArmyRequestDto dto) {
        Optional<Army> army = repository.findById(dto.id());
        Optional<Army> country = repository.findById(dto.country().getId());

        if (army.isEmpty()) {
            throw new NotFoundException("Army not found");
        }
        if (dto.name().isEmpty()) {
            throw new BadRequestException("Invalid name");
        }
        if (country.isEmpty()) {
            throw new BadRequestException("Invalid country");
        }

        return ArmyMapper.toDto(repository.save(ArmyMapper.toModel(dto)));
    }

    @Transactional
    public void delete(Long id) {
        repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Army not found"));
        repository.deleteById(id);
    }
}