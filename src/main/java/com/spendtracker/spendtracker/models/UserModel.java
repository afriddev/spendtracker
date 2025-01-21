package com.spendtracker.spendtracker.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;



@Entity
@Data
@Table(name = "users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name",nullable = false)
    private String firstName;
    
    @Column(name = "last_name")
    private String lastName;
    
    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "passsword",nullable = false)
    private String password ;

    @Column(name = "otp")
    private int otp;

    @Column(name = "email_Id",nullable = false,unique = true )
    private String email;

}
