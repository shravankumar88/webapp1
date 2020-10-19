package com.example.assignment.repositories;

import com.example.assignment.entities.UserImages;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserImagesRepository extends JpaRepository<UserImages, Long> {

    Page<UserImages> findByUserId(Long userId, Pageable pageable);

}
