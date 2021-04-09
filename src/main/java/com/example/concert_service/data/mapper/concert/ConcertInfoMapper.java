package com.example.concert_service.data.mapper.concert;

import com.example.concert_service.data.dto.concert.ConcertInfoDto;
import com.example.concert_service.data.mapper.BaseMapper;
import com.example.concert_service.data.mapper.artist.ArtistInfoMapper;
import com.example.concert_service.data.mapper.venue.VenueInfoMapper;
import com.example.concert_service.data.model.Concert;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class ConcertInfoMapper extends BaseMapper<Concert, ConcertInfoDto> {

    @Autowired
    protected ArtistInfoMapper artistInfoMapper;
    @Autowired
    protected VenueInfoMapper venueInfoMapper;

    @Mappings({
            @Mapping(target = "artist",
            expression = "java(artistInfoMapper.toDto(entity.getArtist()))"),
    @Mapping(target = "venue",
    expression = "java(venueInfoMapper.toDto(entity.getVenue()))")})
    @Override
    public abstract ConcertInfoDto toDto(Concert entity);
}
