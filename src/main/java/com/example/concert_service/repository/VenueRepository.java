package com.example.concert_service.repository;

import com.example.concert_service.data.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VenueRepository extends PagingAndSortingRepository<User, Integer> {
}
