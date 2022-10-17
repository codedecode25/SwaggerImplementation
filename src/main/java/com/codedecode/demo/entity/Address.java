package com.codedecode.demo.entity;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
public class Address {
	private String pinCode = "12345";
	private String addressLines;
	private String Country = "India";

}
