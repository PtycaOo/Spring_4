package com.example.demo.controller;

import com.example.demo.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Controller
@RequestMapping("/users")
public class userController {

    private UserService userService;

    public userController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> findAll(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        Optional<User> user = userService.getById(id);
        return user.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
    }

//    @GetMapping
//    public String listUsers(Model model){
//        model.addAttribute("users",userService.getAllUsers());
//        return "users";
//    }
//
//    @GetMapping("/{id}")
//    public String getUser(@PathVariable Long id, Model model){
//        model.addAttribute("user", userService.getById(id));
//        return "userProfile";
//    }

    @PostMapping
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @PostMapping("/{id}")
    public User update(@RequestBody User user, @PathVariable Long id){
        user.setId(id);
        return save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        userService.deleteById(id);
    }
}
