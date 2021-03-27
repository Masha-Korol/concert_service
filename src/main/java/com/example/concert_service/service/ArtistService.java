package com.example.concert_service.service;

import com.example.concert_service.data.model.Artist;
import com.example.concert_service.repository.ArtistRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ArtistService {

    private final ArtistRepository artistRepository;

    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public void addArtist(Artist artist){
        artistRepository.save(artist);
    }

    public List<Artist> getAll(){
        return (List<Artist>) artistRepository.findAll();
    }
}
