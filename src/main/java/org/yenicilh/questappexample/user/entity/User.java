package org.yenicilh.questappexample.user.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import static org.yenicilh.questappexample.user.constant.EntityConstants.USER;

@Getter
@Setter
@Entity
@Table(name = USER)
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String firstName;

    private String lastName;

    private String password;
}
