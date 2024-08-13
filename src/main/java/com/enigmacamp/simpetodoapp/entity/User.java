package com.enigmacamp.simpetodoapp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "ms_user")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class User {
    @Id
    @Column(nullable = false, name = "user_customer_id")
    private String id;
    @Column(nullable = false, unique = true, name = "username")
    private String username;
    @Column(nullable = false, name = "password")
    private String password;
    private String role;
}