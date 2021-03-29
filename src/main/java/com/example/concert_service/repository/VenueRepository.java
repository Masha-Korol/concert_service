package com.example.concert_service.repository;

import com.example.concert_service.data.model.User;
import com.example.concert_service.data.model.Venue;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Integer> {
}
