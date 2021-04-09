package com.example.concert_service.controller;

import com.example.concert_service.data.dto.concert.ConcertCreationDto;
import com.example.concert_service.data.dto.concert.ConcertInfoDto;
import com.example.concert_service.data.model.Concert;
import com.example.concert_service.service.ConcertService;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/v1/concerts")
public class ConcertController {

    private final ConcertService concertService;

    public ConcertController(ConcertService concertService) {
        this.concertService = concertService;
    }

    @PostMapping("/")
    public void add(@RequestBody ConcertCreationDto concert){
        concertService.add(concert);
    }

    @GetMapping("/")
    public List<ConcertInfoDto> getAll(){
        return concertService.getAll();
    }
}
