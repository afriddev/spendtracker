package com.spendtracker.spendtracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spendtracker.spendtracker.models.UserModel;
import com.spendtracker.spendtracker.repositorys.UserRepositorys;

@RestController
@RequestMapping("/usr")
public class UserController {


    @Autowired
    UserRepositorys userRepo  ;


    @GetMapping("/a")
    public List<UserModel> getUsers(){
        return userRepo.findAll();
    }




    
}
