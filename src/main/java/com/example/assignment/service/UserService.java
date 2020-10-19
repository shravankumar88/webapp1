package com.example.assignment.service;

import com.example.assignment.entities.User;
import com.example.assignment.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepo;

    public User saveUser( User user) throws Exception {
        return userRepo.save(user);
    }

    public User getUser(Long id) throws Exception {
        return userRepo.findById(id).orElseThrow(()->new Exception("no entity"));
    }
}
