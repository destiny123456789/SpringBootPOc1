package com.poc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//import com.example.demo.Student;
import com.poc.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	User findById(int id);
	List<User> findByfirstName(String firstname);
	List<User> findBylastName(String surnamename);
	
	
	List<User> findByPincode(String pincode);
	
	
	
	@Query("FROM User ORDER BY dob ASC")
    List<User>  findAllorderByDobAsc();
	
	@Query("FROM User ORDER BY joindate ASC")
    List<User>  findAllorderByJoindateAsc();
	
}
