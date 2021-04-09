package com.example.concert_service.data.mapper.artist;

import com.example.concert_service.data.dto.artist.ArtistInfoDto;
import com.example.concert_service.data.mapper.BaseMapper;
import com.example.concert_service.data.model.Artist;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class ArtistInfoMapper extends BaseMapper<Artist, ArtistInfoDto> {
}
