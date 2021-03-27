package com.example.concert_service.repository;

import com.example.concert_service.data.model.Concert;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ConcertRepository extends PagingAndSortingRepository<Concert, Integer> {
}
