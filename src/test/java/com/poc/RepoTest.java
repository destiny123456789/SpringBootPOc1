package com.poc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;


import com.poc.model.User;
import com.poc.repo.UserRepo;

@DataJpaTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class RepoTest {
	
	
	@Autowired
	private TestEntityManager testEntityManager;
    
	@Autowired
	private UserRepo userDao;
	
	@org.junit.Test
	public void fetchUser() {
		
		User user=new User();
		user.setFirstName("Nition");
		user.setLastName("Patil");
		user.setPincode("424101");
		user.setAddress("Pune");
		user.setDob("12-04-1994");
		user.setJoindate("8-3-2021");
		
	//	user.setId(55);
		testEntityManager.persist(user);
		
		
		User user1=userDao.findById(user.getId()).get();
		
		
		//assertNotNull(user1);
		
		
		assertEquals(user1.getPincode(), user.getPincode());
		//assertEquals(user2.getAge(), user.getAge());
	}
	
	

}
