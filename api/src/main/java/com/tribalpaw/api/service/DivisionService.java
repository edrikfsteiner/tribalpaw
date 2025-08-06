package com.tribalpaw.api.service;

import com.tribalpaw.api.dto.division.DivisionRequestDto;
import com.tribalpaw.api.dto.division.DivisionResponseDto;
import com.tribalpaw.api.exception.BadRequestException;
import com.tribalpaw.api.exception.NotFoundException;
import com.tribalpaw.api.mapper.DivisionMapper;
import com.tribalpaw.api.model.division.Division;
import com.tribalpaw.api.repository.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class DivisionService {
    @Autowired
    private DivisionRepository repository;

    public List<DivisionResponseDto> getAll() {
        List<Division> divisions = repository.findAll();
        if (divisions.isEmpty()) {
            throw new NotFoundException("No divisions found");
        }
        return divisions.stream().map(DivisionMapper::toDto).toList();
    }

    public DivisionResponseDto getById(Long id) {
        return DivisionMapper.toDto(
                repository.findById(id)
                        .orElseThrow(() -> new NotFoundException("Division not found"))
        );
    }

    @Transactional
    public DivisionResponseDto post(DivisionRequestDto dto) {
        return DivisionMapper.toDto(repository.save(DivisionMapper.toModel(dto)));
    }

    @Transactional
    public DivisionResponseDto put(DivisionRequestDto dto) {
        Optional<Division> division = repository.findById(dto.id());
        Optional<Division> army = repository.findById(dto.army().id());

        if (division.isEmpty()) {
            throw new NotFoundException("Division not found");
        }
        if (dto.type().name().isBlank()) {
            throw new BadRequestException("Invalid type");
        }
        if (army.isEmpty()) {
            throw new BadRequestException("Invalid army");
        }

        return DivisionMapper.toDto(repository.save(DivisionMapper.toModel(dto)));
    }

    @Transactional
    public void delete(Long id) {
        repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Division not found"));
        repository.deleteById(id);
    }
}