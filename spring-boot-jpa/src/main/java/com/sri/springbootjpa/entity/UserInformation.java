package com.sri.springbootjpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Table(name="user")
@Entity
public class UserInformation {

    @Id
    @Column(name="user_id")
    private int userId;
    @Column(name="name")
    private String userName;
    @Column(name="contact")
    private String contact;

}
