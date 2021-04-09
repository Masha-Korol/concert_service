package com.example.concert_service.service;

import com.example.concert_service.data.dto.location.LocationCreationDto;
import com.example.concert_service.data.mapper.location.LocationCreationMapper;
import com.example.concert_service.repository.LocationRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class LocationService {

    private final LocationRepository locationRepository;
    private final LocationCreationMapper locationCreationMapper;

    public LocationService(LocationRepository locationRepository, LocationCreationMapper locationCreationMapper) {
        this.locationRepository = locationRepository;
        this.locationCreationMapper = locationCreationMapper;
    }

    public void add(LocationCreationDto location){
        locationRepository.save(locationCreationMapper.toEntity(location));
    }

    public List<LocationCreationDto> getAll(){
        return locationCreationMapper.toDto(locationRepository.findAll());
    }
}
