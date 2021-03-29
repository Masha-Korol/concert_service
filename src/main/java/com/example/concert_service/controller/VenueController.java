package com.example.concert_service.controller;

import com.example.concert_service.data.dto.VenueDto;
import com.example.concert_service.data.model.Venue;
import com.example.concert_service.service.VenueService;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping(path = "/api/v1/venues")
public class VenueController {

    private final VenueService venueService;

    public VenueController(VenueService venueService) {
        this.venueService = venueService;
    }

    @PostMapping("/")
    public void add(@RequestBody Venue venue){
        venueService.add(venue);
    }

    /*@GetMapping("/")
    public List<VenueDto> getAll(){
        return venueService.getAll();
    }*/
}
