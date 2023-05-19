package com.project.erp_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

	private String name;

	private String email;

	private String code;

	private String currency;

	private String taxRegistrationNumber;

	private String adress;

	private String phone;

}
