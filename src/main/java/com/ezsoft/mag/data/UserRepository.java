package com.ezsoft.mag.data;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByProfession(String profession);

    @Query("SELECT u FROM User u WHERE u.dateCreated > :date")
    List<User> findByDateCreated(@Param("date") LocalDate date);

    User findById(long id);
}