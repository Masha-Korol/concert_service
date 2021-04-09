package com.example.concert_service.service;

import com.example.concert_service.data.dto.concert.ConcertCreationDto;
import com.example.concert_service.data.dto.concert.ConcertInfoDto;
import com.example.concert_service.data.mapper.concert.ConcertCreationMapper;
import com.example.concert_service.data.mapper.concert.ConcertInfoMapper;
import com.example.concert_service.data.model.Concert;
import com.example.concert_service.repository.ConcertRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ConcertService {

    private final ConcertRepository concertRepository;
    private final ConcertCreationMapper concertCreationMapper;
    private final ConcertInfoMapper concertInfoMapper;

    public ConcertService(ConcertRepository concertRepository,
                          ConcertCreationMapper concertCreationMapper, ConcertInfoMapper concertInfoMapper) {
        this.concertRepository = concertRepository;
        this.concertCreationMapper = concertCreationMapper;
        this.concertInfoMapper = concertInfoMapper;
    }

    public void add(ConcertCreationDto concert){
        concertRepository.save(concertCreationMapper.toEntity(concert));
    }

    public List<ConcertInfoDto> getAll(){
        return concertInfoMapper.toDto(concertRepository.findAll());
    }
}
