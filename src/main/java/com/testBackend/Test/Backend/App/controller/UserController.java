package com.testBackend.Test.Backend.App.controller;

import com.testBackend.Test.Backend.App.dto.UserDTO;
import com.testBackend.Test.Backend.App.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin


public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/getUsers")
    public List<UserDTO> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateUser")
    public String updateUser() {
        return "User Updated";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser() {
        return "User Deleted";
    }
}
