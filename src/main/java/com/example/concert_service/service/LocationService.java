package com.example.concert_service.service;

import com.example.concert_service.data.model.Location;
import com.example.concert_service.repository.LocationRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class LocationService {

    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public void add(Location location){
        locationRepository.save(location);
    }

    public List<Location> getAll(){
        return (List<Location>) locationRepository.findAll();
    }
}
