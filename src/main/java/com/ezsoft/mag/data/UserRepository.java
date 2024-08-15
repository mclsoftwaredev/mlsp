package com.ezsoft.mag.data;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByProfession(String profession);

    List<User> findByDateCreatedBetween(Date dateCreatedStart, Date dateCreatedEnd);

    User findById(long id);
}