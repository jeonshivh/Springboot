package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Sev_model;

public interface Seven_intf extends JpaRepository<Sev_model, Integer>{

	@Query(value="select * from cart where owners=:sn",nativeQuery=true)
	public List <Sev_model>getodet(@Param("sn") int owners);
	
	@Query(value="select * from cart where address =:ad",nativeQuery=true)
	public List <Sev_model>getadet(@Param("ad") String address);
	
	@Query(value="select * from cart where carName=:cn",nativeQuery=true)
	public List <Sev_model>getcdet(@Param("cn") String carName);
	
	@Query(value="select * from cart where owners=:sn and carType=:ct",nativeQuery=true)
	public List <Sev_model>getocdet(@Param("sn") int owners,@Param("ct") String carType);
}
