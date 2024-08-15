package com.ezsoft.mag.controller;

import com.ezsoft.mag.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.ezsoft.mag.data.User;

import java.sql.Date;
import java.util.List;

@RestController()
public class UserController {

    @Autowired
    UserRepository repository;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") String id) {
        return repository.findById(Long.parseLong(id));
    }

    @GetMapping("/user/profession/{profession}")
    public List<User> getUserByProfession(@PathVariable("profession") String profession) {
        return repository.findByProfession(profession);
    }

    @GetMapping("/user/startDate/{start}/endDate/{end}")
    public List<User> getUserByDateRange(@PathVariable("start") String start, @PathVariable("end") String end) {
        return repository.findByDateCreatedBetween(Date.valueOf(start), Date.valueOf(end));
    }
}