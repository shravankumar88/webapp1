package com.example.assignment.entities;

import javax.persistence.*;

@Entity
public class UserImages {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long imageId;

    private Long userId;

    private String imageURL;

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
