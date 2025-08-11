package com.tribalpaw.api.country.service;

import com.tribalpaw.api.country.dto.CountryRequestDto;
import com.tribalpaw.api.country.dto.CountryResponseDto;
import com.tribalpaw.api.exception.BadRequestException;
import com.tribalpaw.api.exception.NotFoundException;
import com.tribalpaw.api.country.dto.CountryMapper;
import com.tribalpaw.api.country.model.Country;
import com.tribalpaw.api.country.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    @Autowired
    private CountryRepository repository;

    public List<CountryResponseDto> getAll() {
        List<Country> countries = repository.findAll();
        if (countries.isEmpty()) {
            throw new NotFoundException("No countries found");
        }
        return countries.stream().map(CountryMapper::toDto).toList();
    }

    public CountryResponseDto getById(Long id) {
        return CountryMapper.toDto(
                repository.findById(id)
                        .orElseThrow(() -> new NotFoundException("Country not found"))
        );
    }

    @Transactional
    public CountryResponseDto post(CountryRequestDto dto) {
        return CountryMapper.toDto(repository.save(CountryMapper.toModel(dto)));
    }

    @Transactional
    public CountryResponseDto put(CountryRequestDto dto) {
        Optional<Country> country = repository.findById(dto.id());

        if (country.isEmpty()) {
            throw new NotFoundException("Army not found");
        }
        if (dto.name().isEmpty()) {
            throw new BadRequestException("Invalid name");
        }

        return CountryMapper.toDto(repository.save(CountryMapper.toModel(dto)));
    }

    @Transactional
    public void delete(Long id) {
        repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Country not found"));
        repository.deleteById(id);
    }
}