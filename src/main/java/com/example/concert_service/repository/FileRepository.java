package com.example.concert_service.repository;

import com.example.concert_service.data.model.File;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FileRepository extends PagingAndSortingRepository<File, Integer> {
}
