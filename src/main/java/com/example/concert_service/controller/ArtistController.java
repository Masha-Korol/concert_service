package com.example.concert_service.controller;

import com.example.concert_service.data.dto.ArtistDto;
import com.example.concert_service.data.mapper.ArtistMapper;
import com.example.concert_service.data.model.Artist;
import com.example.concert_service.service.ArtistService;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping(path = "/api/v1/artists")
public class ArtistController {

    private final ArtistService artistService;
    private final ArtistMapper artistMapper;

    public ArtistController(ArtistService artistService, ArtistMapper artistMapper) {
        this.artistService = artistService;
        this.artistMapper = artistMapper;
    }

    @PostMapping("/")
    public void add(@RequestBody ArtistDto artist){
        artistService.add(artist);
    }

    @GetMapping("/")
    public List<ArtistDto> getAll(){
        return artistService.getAll();
    }
}
