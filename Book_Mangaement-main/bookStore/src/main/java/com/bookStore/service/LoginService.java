package com.bookStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bookStore.entity.Login;
import com.bookStore.repository.LoginRepository;

@Service
public class LoginService {

    @Autowired
    private LoginRepository repo;

    public Login login(String username, String password) {
        Login user = repo.findByUsernameAndPassword(username, password);
        return user;
    }

}