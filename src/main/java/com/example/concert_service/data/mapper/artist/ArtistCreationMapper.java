package com.example.concert_service.data.mapper.artist;

import com.example.concert_service.data.dto.artist.ArtistCreationDto;
import com.example.concert_service.data.mapper.BaseMapper;
import com.example.concert_service.data.model.Artist;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class ArtistCreationMapper extends BaseMapper<Artist, ArtistCreationDto> {
}
