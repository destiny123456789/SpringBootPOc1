/*package com.poc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.http.MediaType;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.poc.controller.RegistrationController;
import com.poc.model.User;
import com.poc.repo.UserRepo;
import com.poc.service.UserService;
import com.poc.model.Response;
//import io.micrometer.core.ipc.http.HttpSender.Response;
import junit.framework.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

//@SpringBootTest(classes = Poc3Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@SpringBootTest
@RunWith(SpringRunner.class)
//@WebAppConfiguration
//@WebMvcTest(value=RegistrationController.class)
public class Poc3ApplicationTests { 
	
	@Autowired
	private UserService uservice;
	
	@MockBean
	private UserRepo userrepo;
	
	/*@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private UserService usesevice;*/
	
	
	
/*	@Test
	public void addusertest() {
		User user = new User(99,"Nilesh","Kotkar","Chalisgaon","424101","12-04-1970","02-03-2020");
	
		when(userrepo.save(user)).thenReturn(user);
		assertEquals(user, uservice.adduser(user));
	
	}*/
	/*@Test
	public void createusertest() throws Exception {
		
		 User user = new User();
		   user.setId(10);
		   user.setAddress("Pune");
		   user.setDob("12/04/1994");
		   user.setFirstName("Digvijay");
		   user.setJoindate("04/03/2021");
		   user.setLastName("Patil");
		   user.setPincode("424101");
		   
		  String InputinJson=this.mapToJSon(user);
		  String URI="/user/add";
		  
		  Mockito.when(usesevice.adduser(Mockito.any(User.class))).thenReturn(user);
		  
		 
		  
		  RequestBuilder requestbuilder= MockMvcRequestBuilders.post(URI)
		  .accept(MediaType.APPLICATION_JSON).content(InputinJson)
		  .contentType(MediaType.APPLICATION_JSON);
		  
		  MvcResult result =mockMvc.perform(requestbuilder).andReturn();
		  
		  MockHttpServletResponse response=result.getResponse();
		  
		 String outputInjson= response.getContentAsString();
		 
		 assertThat(outputInjson).isEqualTo(InputinJson);
		 assertEquals(HttpStatus.OK.value(),response.getStatus());
		 
		 
		
	}
	public String mapToJSon (Object object) throws JsonProcessingException {
		ObjectMapper objectmapper = new ObjectMapper();
		return objectmapper.writeValueAsString(object);
		
		
		
		
	}*/
	
	
	
	
	/*@Autowired
    private TestRestTemplate restTemplate;*/

   /* @LocalServerPort
    private int port;*/

   /* private String getRootUrl() {
        return "http://localhost:" + port;
    }*/
	
	/*
	@MockBean
	UserRepo userrepo;
	
	@MockBean
	UserService userservice;
	
	@InjectMocks
	RegistrationController registrationcontroller;
	
	@Autowired(required=true)
	Response response;
	
	
	
	public MockMvc mockMvc;

	  @Autowired
	  private WebApplicationContext context;
	  
	  
	  @Before
	  private void setUp() {
		 // final RegistrationController RegistrationController = new RegistrationController();
		  mockMvc=MockMvcBuilders.webAppContextSetup(context).build();
		 /* mockMvc = MockMvcBuilders.webAppContextSetup(context)
	                .addFilter(springSecurityFilterChain)
	                .build();
	  }*/
	/*  ObjectMapper om = new ObjectMapper();

	@Test
	void contextLoads() {
	}*/
	//@SuppressWarnings("deprecation")
/*	@Test
	public void createuser() throws Exception {
		 User user = new User();
		   user.setId(10);
		   user.setAddress("Pune");
		   user.setDob("12/04/1994");
		   user.setFirstName("Digvijay");
		   user.setJoindate("04/03/2021");
		   user.setLastName("Patil");
		   user.setPincode("424101");
		   
		   String jsonRequest = om.writeValueAsString(user);
		   MvcResult result = mockMvc.perform(post("/user/add").content(jsonRequest).content(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().isOk()).andReturn();
		   System.out.println("Result is "+result);
		   String resultContent = result.getResponse().getContentAsString();
		   Response response = om.readValue(resultContent, Response.class);
		  // Assert.assertTrue(condition);
		//   Assert.assertTrue(response.isSuccessful() == Boolean.TRUE);
		   org.junit.Assert.assertTrue(response.isStatus() == Boolean.TRUE);
		   
	}*/
	
	/*@Test
    public void testdeletedbyid() {
         int id = 2;
         User user = restTemplate.getForObject(getRootUrl() + "/udelete/25", User.class);
         System.out.println("user is "+user);
         assertNotNull(user);
         restTemplate.delete(getRootUrl() + "/udelete/2");
         try {
        	 user = restTemplate.getForObject(getRootUrl() + "/udelete/25" , User.class);
        	// restTemplate.
        	 System.out.println("user updated  is "+user);
         } catch (final HttpClientErrorException e) {
              assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
         }
    }*/
	
	 
	/*@Test
     public void testsearchbyname() {
     HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/firstname/Akash",
        HttpMethod.GET, entity, String.class);  
        assertNotNull(response.getBody());
    }*/
	/*   @Test
  public void deletedbyid() throws Exception {
	      String uri = "http://localhost:8081/user/udelete/2";
	      MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
	      int status = mvcResult.getResponse().getStatus();
	      System.out.println("Status is "+status);
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      assertEquals(content, "Data is deleted successsfully");
	      
	      ObjectMapper mapper = new ObjectMapper();
	      Response response =mapper.readValue(mvcResult.getResponse().getContentAsString(),Response.class);
	      assertsEquals(c)
	   
	   }
	   */
	   
	   
	   
	
	
	/*@Test
	public void createuser() throws Exception {
	   String uri = "/user/add";
	   User user = new User();
	  // user.setId(25);
	   user.setAddress("Kolkata");
	   user.setDob("23-07-2000");
	   user.setFirstName("Anil");
	   user.setJoindate("01-01-2020");
	   user.setLastName("Chaudhari");
	   user.setPincode("424101");
	   
	 
	   String inputJson = mapToJson(user);
	   MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post(uri)
	      .contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();
	   
	   int status = mvcResult.getResponse().getStatus();
	   assertEquals(201, status);
	   String content = mvcResult.getResponse().getContentAsString();
	   assertEquals(content, "Product is created successfully");
	}*/