package com.example.concert_service.service;

import com.example.concert_service.data.dto.venue.VenueCreationDto;
import com.example.concert_service.data.dto.venue.VenueInfoDto;
import com.example.concert_service.data.mapper.venue.VenueCreationMapper;
import com.example.concert_service.data.mapper.venue.VenueInfoMapper;
import com.example.concert_service.repository.VenueRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class VenueService {

    private final VenueRepository venueRepository;
    private final VenueCreationMapper venueCreationMapper;
    private final VenueInfoMapper venueInfoMapper;

    public VenueService(VenueRepository venueRepository,
                        VenueCreationMapper venueCreationMapper,
                        VenueInfoMapper venueInfoMapper) {
        this.venueRepository = venueRepository;
        this.venueCreationMapper = venueCreationMapper;
        this.venueInfoMapper = venueInfoMapper;
    }

    public void add(VenueCreationDto venue){
        venueRepository.save(venueCreationMapper.toEntity(venue));
    }

    public List<VenueInfoDto> getAll(){
        return venueInfoMapper.toDto(venueRepository.findAll());
    }
}
