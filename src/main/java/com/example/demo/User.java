package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;


    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public Long id() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String email() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
