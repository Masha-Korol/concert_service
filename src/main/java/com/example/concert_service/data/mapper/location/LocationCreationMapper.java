package com.example.concert_service.data.mapper.location;

import com.example.concert_service.data.dto.location.LocationCreationDto;
import com.example.concert_service.data.mapper.BaseMapper;
import com.example.concert_service.data.model.Location;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class LocationCreationMapper extends BaseMapper<Location, LocationCreationDto> {
}
