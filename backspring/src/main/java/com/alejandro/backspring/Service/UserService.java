package com.alejandro.backspring.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alejandro.backspring.Entity.User;
import com.alejandro.backspring.Repository.UserRepository;

@Service
public class UserService {
    
    private final UserRepository userRepository;

    public UserService (UserRepository userRepository){
        this.userRepository=userRepository;
    }
    
    public User createUser (User user){
        return userRepository.save(user);
    }

    public void deleteUser (Integer id){
        userRepository.deleteById(id);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

}
