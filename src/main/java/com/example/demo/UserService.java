package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        userRepository.save(new User(null,"Nikita","asdsad1"));
        userRepository.save(new User(null,"Gosha","aefgdfa"));
        userRepository.save(new User(null,"dasha","asxfvf"));
        return userRepository.findAll();
    }

    public User getById(Long id){
        return userRepository.findById(id);
    }

}
