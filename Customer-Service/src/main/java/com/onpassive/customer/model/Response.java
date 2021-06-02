package com.onpassive.customer.model;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Response {

	
	private int statusCode;
	private String statusMessage;
	private HttpStatus httpStatus;
}
