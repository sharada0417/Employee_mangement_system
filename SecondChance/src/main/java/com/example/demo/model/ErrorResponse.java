package com.example.demo.model;

public class ErrorResponse {
	private int statusCode;
	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	private String errorMessage;
	
	public ErrorResponse() {
	}
	
	public ErrorResponse(int statusCode,String errorMessage) {
		super();
		this.statusCode = statusCode;
		this.errorMessage = errorMessage; 
	}
	
	
	
	
	
}
