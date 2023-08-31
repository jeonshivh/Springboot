package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.User_pojo;

import jakarta.transaction.Transactional;

public interface User_intf extends JpaRepository<User_pojo, Integer>
{
	
	@Query(value="select * from Selection_Category where userid=:di",nativeQuery=true)
	public List <User_pojo> getid (@Param("di") int userid);
	
	@Modifying
	@Transactional
	@Query (value="update  Selection_Category c set c.userid=?1 where c.userid=?2",nativeQuery=true)
	public Integer  uid (int userid,int newid);
	
	@Modifying
	@Transactional
	@Query(value="delete from Selection_Category where userid=:did",nativeQuery=true)
	public Integer  deid (@Param("did") int userid);

	
}
