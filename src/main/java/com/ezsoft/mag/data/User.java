package com.ezsoft.mag.data;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import java.sql.Timestamp;

@Builder
@Getter
@Setter
public class User {
    @Id int id;
    String firstname;
    String lastname;
    String email;
    String profession;
    Timestamp dateCreated;
    String country;
    String city;
}
