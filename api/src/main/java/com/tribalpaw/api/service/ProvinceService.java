package com.tribalpaw.api.service;

import com.tribalpaw.api.dto.province.ProvinceRequestDto;
import com.tribalpaw.api.dto.province.ProvinceResponseDto;
import com.tribalpaw.api.exception.BadRequestException;
import com.tribalpaw.api.exception.NotFoundException;
import com.tribalpaw.api.mapper.ProvinceMapper;
import com.tribalpaw.api.model.province.Province;
import com.tribalpaw.api.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProvinceService {
    @Autowired
    private ProvinceRepository repository;

    public List<ProvinceResponseDto> getAll() {
        List<Province> provinces = repository.findAll();
        if (provinces.isEmpty()) {
            throw new NotFoundException("No provinces found");
        }
        return provinces.stream().map(ProvinceMapper::toDto).toList();
    }

    public ProvinceResponseDto getById(Long id) {
        return ProvinceMapper.toDto(
                repository.findById(id)
                        .orElseThrow(() -> new NotFoundException("Province not found"))
        );
    }

    @Transactional
    public ProvinceResponseDto post(ProvinceRequestDto dto) {
        return ProvinceMapper.toDto(repository.save(ProvinceMapper.toModel(dto)));
    }

    @Transactional
    public ProvinceResponseDto put(ProvinceRequestDto dto) {
        Optional<Province> province = repository.findById(dto.id());
        Optional<Province> country = repository.findById(dto.country().getId());

        if (province.isEmpty()) {
            throw new NotFoundException("Province not found");
        }
        if (dto.name().isEmpty()) {
            throw new BadRequestException("Invalid name");
        }
        if (country.isEmpty()) {
            throw new BadRequestException("Invalid country");
        }

        return ProvinceMapper.toDto(repository.save(ProvinceMapper.toModel(dto)));
    }

    @Transactional
    public void delete(Long id) {
        repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Province not found"));
        repository.deleteById(id);
    }
}