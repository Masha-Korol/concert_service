package com.example.concert_service.service;

import com.example.concert_service.data.model.Venue;
import com.example.concert_service.repository.VenueRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class VenueService {

    private final VenueRepository venueRepository;

    public VenueService(VenueRepository venueRepository) {
        this.venueRepository = venueRepository;
    }

    public void add(Venue venue){
        venueRepository.save(venue);
    }

    public List<Venue> getAll(){
        return (List<Venue>) venueRepository.findAll();
    }
}
