package com.learn.user.service.entiities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name= "micro_users")
public class User {
    @Id
     // You can use AUTO, IDENTITY, or SEQUENCE depending on your database setup

    @Column(name="ID")
    private String userId;
    @Column(name="NAME", length = 30)
    private String name;
    @Column(name="EMAIL")
    private String email;
    @Column(name="ABOUT")
    private String about;
    @Transient
    private List<Rating> ratings=new ArrayList<>();
}
