package com.project.erp_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDto {

	private String firstName;
	private String lastName;
	private String email;
	private int phone;
	private String password;

}
