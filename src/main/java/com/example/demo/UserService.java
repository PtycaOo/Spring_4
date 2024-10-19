package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getById(Long id){
        return userRepository.findById(id);
    }

}
