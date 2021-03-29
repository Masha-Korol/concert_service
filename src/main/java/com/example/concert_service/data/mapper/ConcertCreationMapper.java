package com.example.concert_service.data.mapper;

import com.example.concert_service.data.dto.concert.ConcertCreationDto;
import com.example.concert_service.data.model.Concert;
import com.example.concert_service.repository.ArtistRepository;
import com.example.concert_service.repository.VenueRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class ConcertCreationMapper extends BaseMapper<Concert, ConcertCreationDto>{

    @Autowired
    protected ArtistRepository artistRepository;
    @Autowired
    protected VenueRepository venueRepository;

    @Mappings({
            @Mapping(target = "artist",
                    expression = "java(artistRepository.findById(dto.getArtistId()).orElse(null))"),
            @Mapping(target = "venue",
            expression = "java(venueRepository.findById(dto.getVenueId()).orElse(null))")
    })
    public abstract Concert toEntity(ConcertCreationDto dto);
}
