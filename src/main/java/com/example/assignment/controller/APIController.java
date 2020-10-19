package com.example.assignment.controller;

import com.example.assignment.entities.User;
import com.example.assignment.entities.UserImages;
import com.example.assignment.service.UserImagesService;
import com.example.assignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class APIController {

    @Autowired
    UserService userService;

    @Autowired
    UserImagesService userImgsService;

    @GetMapping(value="/hello_world")
    public String helloWorld(){
        return "helloWorld";
    }

    @RequestMapping(value="/user/{userId}",method = RequestMethod.GET)
    public ResponseEntity<User> getUser(@PathVariable Long userId) throws Exception {

        return  new ResponseEntity<User>(userService.getUser(userId), HttpStatus.OK);

    }

    @GetMapping(value="/user/{userId}/images")
    public Page<UserImages> getUserImages(@PathVariable Long userId,Pageable pageable){

        return userImgsService.findByUserId(userId,pageable);

    }

    @PostMapping("/user")
    public ResponseEntity<User> saveUser(@RequestBody User user) throws Exception {
        return new ResponseEntity<User>(userService.saveUser(user), HttpStatus.OK);
    }

    @PostMapping("/image")
    public ResponseEntity<UserImages> saveUser(@RequestBody UserImages userImage) throws Exception {
        return new ResponseEntity<UserImages>(userImgsService.saveUserImage(userImage), HttpStatus.OK);
    }

}
