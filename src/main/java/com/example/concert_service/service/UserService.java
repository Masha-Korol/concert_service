package com.example.concert_service.service;

import com.example.concert_service.data.model.User;
import com.example.concert_service.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void add(User user){
        userRepository.save(user);
    }

    public List<User> getAll(){
        return (List<User>) userRepository.findAll();
    }
}
