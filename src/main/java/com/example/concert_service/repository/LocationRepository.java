package com.example.concert_service.repository;

import com.example.concert_service.data.model.Location;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LocationRepository extends PagingAndSortingRepository<Location, Integer> {
}
