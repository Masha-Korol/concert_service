package com.example.concert_service.service;

import com.example.concert_service.data.dto.concert.ConcertCreationDto;
import com.example.concert_service.data.mapper.ConcertCreationMapper;
import com.example.concert_service.data.model.Concert;
import com.example.concert_service.repository.ConcertRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ConcertService {

    private final ConcertRepository concertRepository;
    private final ConcertCreationMapper concertCreationMapper;

    public ConcertService(ConcertRepository concertRepository, ConcertCreationMapper concertCreationMapper) {
        this.concertRepository = concertRepository;
        this.concertCreationMapper = concertCreationMapper;
    }

    public void add(ConcertCreationDto concert){
        concertRepository.save(concertCreationMapper.toEntity(concert));
    }

    public List<Concert> getAll(){
        return (List<Concert>) concertRepository.findAll();
    }
}
