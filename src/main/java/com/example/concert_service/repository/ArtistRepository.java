package com.example.concert_service.repository;

import com.example.concert_service.data.model.Artist;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ArtistRepository extends PagingAndSortingRepository<Artist, Integer> {
}
