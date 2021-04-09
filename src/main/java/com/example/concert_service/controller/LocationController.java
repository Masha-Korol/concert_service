package com.example.concert_service.controller;

import com.example.concert_service.data.dto.location.LocationCreationDto;
import com.example.concert_service.service.LocationService;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping(path = "/api/v1/locations")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @PostMapping("/")
    public void add(@RequestBody LocationCreationDto location){
        locationService.add(location);
    }

    @GetMapping("/")
    public List<LocationCreationDto> getAll(){
     return locationService.getAll();
    }
}
