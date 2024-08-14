package com.ezsoft.mag.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.ezsoft.mag.data.User;

import java.sql.Timestamp;
import java.time.Instant;

@RestController()
public class UserController {

    @GetMapping("/user/{id}")
    public User getCustomerById(@PathVariable("id") String id) {
    return User.builder()
        .id(Integer.parseInt(id))
        .email("mclsoftwaredev@gmail.com")
        .city("Suwanee")
        .country("USA")
        .dateCreated(Timestamp.from(Instant.now()))
        .lastname("Lee")
        .profession("Software Developer")
        .firstname("Michael")
        .build();
    }
}