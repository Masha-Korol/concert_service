package com.example.concert_service.data.mapper;

import com.example.concert_service.data.dto.ArtistDto;
import com.example.concert_service.data.model.Artist;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class ArtistMapper extends BaseMapper<Artist, ArtistDto> {
}
