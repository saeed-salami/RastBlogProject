package com.mapsa.blog.modules.users.controller;

import com.mapsa.blog.modules.users.model.Users;
import com.mapsa.blog.modules.users.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UsersController {

    private UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping()
    public List<Users> getUsers() {
        return usersService.findAllUsers();
    }

    @PostMapping()
    public Users registerUser(@RequestBody Users users) {
        return usersService.registerUsers(users);
    }

    @DeleteMapping()
    public void deleteUsersById(@RequestParam Long id) {
        usersService.deleteUserById(id);
    }


}
