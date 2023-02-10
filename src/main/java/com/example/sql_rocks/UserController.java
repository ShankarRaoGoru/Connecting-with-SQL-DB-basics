package com.example.sql_rocks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
    UserService userService;
@PostMapping("/add-user")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @GetMapping("/get-user")
    public User getUser(@RequestParam("q") int id){
    return userService.getUser(id);
    }
}
