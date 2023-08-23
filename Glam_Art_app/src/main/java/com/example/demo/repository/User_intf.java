package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User_pojo;

public interface User_intf extends JpaRepository<User_pojo, Integer>{

}
