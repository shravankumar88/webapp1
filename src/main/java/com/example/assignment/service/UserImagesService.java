package com.example.assignment.service;

import com.example.assignment.entities.UserImages;
import com.example.assignment.repositories.UserImagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserImagesService {
    @Autowired
    UserImagesRepository userImageRepo;

    public UserImages saveUserImage(UserImages userImg) throws Exception {
        return userImageRepo.save(userImg);
    }

    public Page<UserImages> findByUserId(Long userId, Pageable pageable){
        return userImageRepo.findByUserId(userId,pageable);
    }
}


