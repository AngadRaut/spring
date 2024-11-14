package com.springmvc.entity;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "User_Details")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "User_Email")
    private String email;

    @Column(name = "User_Password")
    private String userPassword;
    @Column(name = "User_Name")
    private String userName;
}
