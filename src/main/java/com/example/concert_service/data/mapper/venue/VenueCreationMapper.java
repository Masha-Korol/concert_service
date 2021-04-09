package com.example.concert_service.data.mapper.venue;

import com.example.concert_service.data.dto.venue.VenueCreationDto;
import com.example.concert_service.data.mapper.BaseMapper;
import com.example.concert_service.data.model.Venue;
import com.example.concert_service.repository.LocationRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class VenueCreationMapper extends BaseMapper<Venue, VenueCreationDto> {

    @Autowired
    protected LocationRepository locationRepository;

    @Mapping(target = "location",
    expression = "java(locationRepository.findById(dto.getLocationId()).orElse(null))")
    public abstract Venue toEntity(VenueCreationDto dto);
}
