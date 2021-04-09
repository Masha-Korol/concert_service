package com.example.concert_service.service;

import com.example.concert_service.data.dto.artist.ArtistCreationDto;
import com.example.concert_service.data.mapper.artist.ArtistCreationMapper;
import com.example.concert_service.data.model.Artist;
import com.example.concert_service.repository.ArtistRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ArtistService {

    private final ArtistRepository artistRepository;
    private final ArtistCreationMapper artistCreationMapper;

    public ArtistService(ArtistRepository artistRepository,
                         ArtistCreationMapper artistCreationMapper) {
        this.artistRepository = artistRepository;
        this.artistCreationMapper = artistCreationMapper;
    }

    public void add(ArtistCreationDto artist){
        artistRepository.save(artistCreationMapper.toEntity(artist));
    }

    public List<ArtistCreationDto> getAll(){
        return artistCreationMapper.toDto((List<Artist>) artistRepository.findAll());
    }
}
