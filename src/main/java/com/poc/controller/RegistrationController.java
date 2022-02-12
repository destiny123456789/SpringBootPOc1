package com.poc.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.poc.model.User;
import com.poc.repo.UserRepo;
import com.poc.service.UserService;


@RestController
@RequestMapping(value="/user")
public class RegistrationController {
	
	@Autowired
	UserService userservice;
	
    @Autowired
    UserRepo userrepo;
    
    
	@PostMapping(value="/add")
	@ResponseBody
	@CrossOrigin
	public User createuser(@RequestBody User user) {
		System.out.println(user);
		return userservice.adduser(user);
		
		
	}
	
	@PutMapping(value="/userupdate/{id}",consumes ="application/json")
	@CrossOrigin
	public ResponseEntity<Object> updateUser(@RequestBody User user,@PathVariable int id) {

		User useroptional = userrepo.findById(id);

		//if (!((Object) useroptional)id())
			//return ResponseEntity.notFound().build();
    //  Student s1= studentOptional.get(0);
		//useroptional.setId(user.getId());
		useroptional.setId(user.getId());
		useroptional.setAddress(user.getAddress());
		useroptional.setFirstName(user.getFirstName());
		useroptional.setLastName(user.getLastName());
		useroptional.setDob(user.getDob());
		useroptional.setJoindate(user.getJoindate());
		
		System.out.println("printingh studnet id "+id);
		userrepo.save(useroptional);

		//return ResponseEntity.noContent().build();
		return new  ResponseEntity<>("Data is updated successfully", HttpStatus.OK);
			}
	
	@DeleteMapping("/udelete/{id}")
	@CrossOrigin
	public ResponseEntity<Object> deletedbyid(@PathVariable int id) {
		 userrepo.deleteById(id);
		 return new ResponseEntity<>("Data is deleted successsfully", HttpStatus.OK);
	}
	
	@GetMapping("/firstname/{nameone}")
	@CrossOrigin
	public List<User> searchbyname(@PathVariable(value = "nameone") String name) {
		System.out.println("name is "+name);
		return userrepo.findByfirstName(name);
		//return userservice.findbyfirstnameservice(name);
		
	}
	@GetMapping("/surname/{surnamename}")
	@CrossOrigin
	public List<User> searchbysurname(@PathVariable(value = "surnamename") String surnamename) {
		return userrepo.findBylastName(surnamename);
		
	}
	@GetMapping("/pincode/{pinocde}")
	@CrossOrigin
	public List<User> searchbysurnamename(@PathVariable(value = "pinocde") String pincode) {
		return userrepo.findByPincode(pincode);
		
	}
	
	 @GetMapping(value = "/orderbydob")
	 @CrossOrigin
	    public List<User> getUsersbydob() {

	        return userservice.findAllOrderByDobAsc();
	    }
	 
	 @GetMapping(value = "/orderbydoj")
	 @CrossOrigin
	    public List<User> getUsersbydoj() {

	        return userservice.findAllOrderByDojAsc();
	    }
	@RequestMapping(value = "/hi", method = RequestMethod.GET, produces = "application/json")
	@CrossOrigin
	public String testing() {
		return "tested";
	}
	
	@RequestMapping("/all")
	@CrossOrigin
	public List<User> getall() {
		//System.out.println("name is "+name);
		return userrepo.findAll();
		//return userservice.findbyfirstnameservice(name);
		
	}
	
		

}

