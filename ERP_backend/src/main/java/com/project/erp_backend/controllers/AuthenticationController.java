package com.project.erp_backend.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.erp_backend.dto.LoginDto;
import com.project.erp_backend.dto.RegisterDto;
import com.project.erp_backend.dto.RegisterResponse;
import com.project.erp_backend.dto.authResponse;
import com.project.erp_backend.services.AuthenticationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/erp/auth")
@CrossOrigin(origins = "*", maxAge = 3600)
@RequiredArgsConstructor
public class AuthenticationController {

	private final AuthenticationService service;

	@PostMapping("/register")
	public ResponseEntity<RegisterResponse> register(@RequestBody RegisterDto request) {

		String msg = service.register(request);
		if (msg ==null)
			return new ResponseEntity<>(new RegisterResponse("Un compte avec cet email existe déja"),
					HttpStatus.CONFLICT);
		return new ResponseEntity<>(new RegisterResponse(msg), HttpStatus.CREATED);

	}

	@PostMapping("/authenticate")
	public ResponseEntity<authResponse> authenticate(@RequestBody LoginDto request) {
		return ResponseEntity.ok(service.authenticate(request));
	}

}
