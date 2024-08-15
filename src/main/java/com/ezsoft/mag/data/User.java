package com.ezsoft.mag.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
public class User {
    @Id
    Long id;
    String firstname;
    String lastname;
    String email;
    String profession;
    Date dateCreated;
    String country;
    String city;

    public User() {}
}
