package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Ord_pojo;

public interface Ord_intf extends JpaRepository<Ord_pojo, Integer>{

}
