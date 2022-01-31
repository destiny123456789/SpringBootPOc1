package com.poc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



public class Response {
	
	private String message;
	private boolean status;
	
	
	public Response() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Response(boolean status, String message) {
		super();
		this.status = status;
		this.message = message;
	}


	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
