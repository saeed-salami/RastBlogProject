package com.mapsa.blog.modules.users.service;

import com.mapsa.blog.modules.users.model.Users;
import com.mapsa.blog.modules.users.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class UsersService {

    private final UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Users registerUsers(Users users) {
        return this.usersRepository.save(users);
    }

    public List<Users> findAllUsers() {
        return this.usersRepository.findAll();
    }

    public void deleteUserById(Long id) {
        usersRepository.deleteById(id);
    }


}
