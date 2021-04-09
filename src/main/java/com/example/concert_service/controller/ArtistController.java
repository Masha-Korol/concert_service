package com.example.concert_service.controller;

import com.example.concert_service.data.dto.artist.ArtistCreationDto;
import com.example.concert_service.service.ArtistService;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping(path = "/api/v1/artists")
public class ArtistController {

    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @PostMapping("/")
    public void add(@RequestBody ArtistCreationDto artist){
        artistService.add(artist);
    }

    @GetMapping("/")
    public List<ArtistCreationDto> getAll(){
        return artistService.getAll();
    }
}
