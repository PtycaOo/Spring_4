package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


//    private final Map<Long,User> users = new ConcurrentHashMap<>();
//    private AtomicLong count = new AtomicLong();
//
//    public List<User> findAll(){
//        return new ArrayList<>(users.values());
//    }
//
//    public User findById(Long id){
//        return users.get(id);
//    }
//
//    public User save(User user){
//        if(user.id() == null){
//            user.setId(count.incrementAndGet());
//        }
//        users.put(user.id(),user);
//        return user;
//    }
}
