package com.example.concert_service.controller;

import com.example.concert_service.data.dto.LocationDto;
import com.example.concert_service.data.model.Location;
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

    /*@PostMapping("/")
    public void add(@RequestBody LocationDto location){
        locationService.add(location);
    }

    @GetMapping("/")
    public List<LocationDto> getAll(){
     return locationService.getAll();
    }*/
}
