package com.alejandro.backspring.Controller;

import com.alejandro.backspring.Entity.User;
import com.alejandro.backspring.Service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {
    
    private final UserService userService;

    public UserController (UserService userService){
        this.userService=userService;
    }

    @PostMapping
    public User createUser (@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
    }
}
