package com.ezsoft.mag.controller;

import com.ezsoft.mag.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.ezsoft.mag.data.User;

import java.util.List;

@RestController("/user")
public class UserController {

    @Autowired
    UserRepository repository;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") String id) {
        return repository.findById(Long.parseLong(id));
    }

    @GetMapping("/profession/{profession}")
    public List<User> getUserByProfession(@PathVariable("profession") String profession) {
        return repository.findByProfession(profession);
    }
}