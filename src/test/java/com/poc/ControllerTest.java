/*package com.poc;

import static org.assertj.core.api.Assertions.assertThat;
//import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
/*import com.fasterxml.jackson.databind.ObjectMapper;
import com.poc.controller.*;
import com.poc.model.User;
import com.poc.repo.UserRepo;
import com.poc.service.UserService;

//@SpringBootTest
@RunWith(SpringRunner.class)
@WebMvcTest(value=RegistrationController.class)
public class ControllerTest {
	
	
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private UserService usersevice;
	
	
	@MockBean
	private UserRepo userrepo;
	*/
	
	/*
	@Test
	public void createusertest() throws Exception {
		
		 User user = new User();
		// User user2 = new User();
		//List<User> userlist = new ArrayList<User>();
		
		  // user.setId(10);
		   user.setAddress("Pune");
		   user.setDob("12/04/1994");
		   user.setFirstName("Digvijay");
		   user.setJoindate("04/03/2021");
		   user.setLastName("Patil");
		   user.setPincode("424101");
		  // userlist.add(user);
		   String InputinJson=this.mapToJSon(user);
		   String URI="/user/add";
		   Mockito.when(usersevice.adduser(Mockito.any(User.class))).thenReturn(user);
			  
		   RequestBuilder requestbuilder= MockMvcRequestBuilders.post(URI)
					  .accept(MediaType.APPLICATION_JSON).content(InputinJson)
					  .contentType(MediaType.APPLICATION_JSON);
					  
					  MvcResult result =mockMvc.perform(requestbuilder).andReturn();
					  
					  MockHttpServletResponse response=result.getResponse();
					  
					 String outputInjson= response.getContentAsString();
					 
					 assertThat(outputInjson).isEqualTo(InputinJson);
					 assertEquals(HttpStatus.OK.value(),response.getStatus());
}
	*/
/*	@Test
	public void findbyfirstnameTest() throws Exception {
		
		
		   List<User> userlist = new ArrayList<>();
		   User user = new User();
		   
		   User user2 = new User();
		   user.setAddress("Mumbai");
		   user.setDob("12/04/1994");		  
		   user.setFirstName("updateddigvijay");
		   user.setJoindate("04/03/2021");
		   user.setLastName("Patil");
		   user.setPincode("424101");
		   
		   userlist.add(user);
		   
		   user2.setAddress("rert");
		   user2.setDob("12/04/1594");
		   user2.setFirstName("frg");
		   //user2.setJoindate("04/03/2021");
		   user2.setJoindate("11/03/2021");
		   user2.setLastName("g");
		   user2.setPincode("fvfb");
		   
		   userlist.add(user2);
		
		   String InputinJson=this.mapToJSon(userlist);
		  
		  
		   
		  String URI="/firstname/updateddigvijay";
		  String URI1="/firstname/rert";
		  when(usersevice.findbyfirstnameservice(Mockito.anyString())).thenReturn(userlist);
			  
		   RequestBuilder requestbuilder= MockMvcRequestBuilders.get(URI)
					  .accept(MediaType.APPLICATION_JSON);
					  
					  MvcResult result =mockMvc.perform(requestbuilder).andReturn();
					  String expecdtedjson=this.mapToJSon(userlist);
					  
					  MockHttpServletResponse response=result.getResponse();
					  
					// String outputInjson= response.getContentAsString();
					 String outputInjson= result.getResponse().getContentAsString();
					 
					 assertThat(outputInjson).isEqualTo(expecdtedjson);
					// assertEquals(HttpStatus.OK.value(),response.getStatus());
}*/
	/*public String mapToJSon (Object object) throws JsonProcessingException {
		ObjectMapper objectmapper = new ObjectMapper();
		return objectmapper.writeValueAsString(object);
		
		
		
		
	}
	 */