package com.example.concert_service.data.mapper.venue;

import com.example.concert_service.data.dto.venue.VenueInfoDto;
import com.example.concert_service.data.mapper.BaseMapper;
import com.example.concert_service.data.mapper.location.LocationInfoMapper;
import com.example.concert_service.data.model.Venue;
import com.example.concert_service.repository.LocationRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class VenueInfoMapper extends BaseMapper<Venue, VenueInfoDto> {

    @Autowired
    protected LocationRepository locationRepository;
    @Autowired
    protected LocationInfoMapper locationInfoMapper;

    @Mapping(target = "location",
            expression = "java(locationInfoMapper.toDto(locationRepository.findById(entity.getVenueId()).orElse(null)))")
    public abstract VenueInfoDto toDto(Venue entity);
}
