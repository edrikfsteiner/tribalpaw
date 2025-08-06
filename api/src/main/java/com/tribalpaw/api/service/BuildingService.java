package com.tribalpaw.api.service;

import com.tribalpaw.api.dto.building.BuildingRequestDto;
import com.tribalpaw.api.dto.building.BuildingResponseDto;
import com.tribalpaw.api.exception.BadRequestException;
import com.tribalpaw.api.exception.NotFoundException;
import com.tribalpaw.api.mapper.BuildingMapper;
import com.tribalpaw.api.model.building.Building;
import com.tribalpaw.api.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class BuildingService {
    @Autowired
    private BuildingRepository repository;

    public List<BuildingResponseDto> getAll() {
        List<Building> buildings = repository.findAll();
        if (buildings.isEmpty()) {
            throw new NotFoundException("No buildings found");
        }
        return buildings.stream().map(BuildingMapper::toDto).toList();
    }

    public BuildingResponseDto getById(Long id) {
        return BuildingMapper.toDto(
                repository.findById(id)
                        .orElseThrow(() -> new NotFoundException("Building not found"))
        );
    }

    @Transactional
    public BuildingResponseDto post(BuildingRequestDto dto) {
        return BuildingMapper.toDto(repository.save(BuildingMapper.toModel(dto)));
    }

    @Transactional
    public BuildingResponseDto put(BuildingRequestDto dto) {
        Optional<Building> building = repository.findById(dto.id());
        Optional<Building> province = repository.findById(dto.province().id());

        if (building.isEmpty()) {
            throw new NotFoundException("Building not found");
        }
        if (dto.name().isEmpty()) {
            throw new BadRequestException("Invalid name");
        }
        if (province.isEmpty()) {
            throw new BadRequestException("Invalid province");
        }

        return BuildingMapper.toDto(repository.save(BuildingMapper.toModel(dto)));
    }

    @Transactional
    public void delete(Long id) {
        repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Building not found"));
        repository.deleteById(id);
    }
}