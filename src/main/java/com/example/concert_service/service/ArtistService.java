package com.example.concert_service.service;

import com.example.concert_service.data.dto.ArtistDto;
import com.example.concert_service.data.mapper.ArtistMapper;
import com.example.concert_service.data.model.Artist;
import com.example.concert_service.repository.ArtistRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ArtistService {

    private final ArtistRepository artistRepository;
    private final ArtistMapper artistMapper;

    public ArtistService(ArtistRepository artistRepository, ArtistMapper artistMapper) {
        this.artistRepository = artistRepository;
        this.artistMapper = artistMapper;
    }

    public void add(ArtistDto artist){
        artistRepository.save(artistMapper.toEntity(artist));
    }

    public List<ArtistDto> getAll(){
        return artistMapper.toDto((List<Artist>) artistRepository.findAll());
    }
}
