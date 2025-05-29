package com.sri.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_dtl")
public class UserDetails {
    @Id
    private long userId;
    private String name;
    private String gender;
    // defining relationship
    // entity class of address table
    // 1 -> N
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id_addr_id")
    private List<Address> addresses;
}
