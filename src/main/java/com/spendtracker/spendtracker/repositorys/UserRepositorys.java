package com.spendtracker.spendtracker.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spendtracker.spendtracker.models.UserModel;

public interface UserRepositorys extends JpaRepository<UserModel,Long> {
    
}