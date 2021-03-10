package com.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.model.User;
import com.poc.repo.UserRepo;
import org.springframework.data.domain.Sort;


@Service
public class UserService {
	
	@Autowired
	UserRepo userrepo;
	
	public User adduser(User user) {
		System.out.println("in service");
		return  userrepo.save(user);
		//System.out.println(user1);
		//return user1;
	}
	
	
	public List<User> findAllOrderByDobAsc() {
        return userrepo.findAllorderByDobAsc();
    }
	public List<User> findAllOrderByDojAsc() {
        return userrepo.findAllorderByJoindateAsc();
    }


	public List<User> findbyfirstnameservice(String name) {
		// TODO Auto-generated method stubname
		return userrepo.findByfirstName(name);
	}
	
	/*
    public List<User> findAllOrderByDojAsc() {

        var sort = new Sort(Sort.Direction.ASC, "doj");
        return repository.findAllOrderByNameAsc(sort);
    }*/
	

}
