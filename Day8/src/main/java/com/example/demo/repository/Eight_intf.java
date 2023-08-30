package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Eight_mc;

public interface Eight_intf extends JpaRepository<Eight_mc, Integer>{
	
	@Query(value="select * from Bike where year=:y",nativeQuery=true)
	public List <Eight_mc> getyr(@Param("y") int year);
	
	@Query(value="select *from Bike where year=:y and bikename=:bn",nativeQuery=true)
	public List <Eight_mc>  getyrbn (@Param("y") int year,@Param("bn") String bikename);
	
	

}
