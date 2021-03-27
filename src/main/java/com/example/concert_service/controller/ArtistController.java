package com.example.concert_service.controller;

import com.example.concert_service.data.model.Artist;
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
    public void addArtist(@RequestBody Artist artist){
        artistService.addArtist(artist);
    }

    @GetMapping("/")
    public List<Artist> getAll(){
        return artistService.getAll();
    }
}
