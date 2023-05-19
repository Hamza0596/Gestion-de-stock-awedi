package com.project.erp_backend.services.impl;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.erp_backend.configuration.JwtService;
import com.project.erp_backend.dto.LoginDto;
import com.project.erp_backend.dto.RegisterDto;
import com.project.erp_backend.dto.authResponse;
import com.project.erp_backend.entities.User;
import com.project.erp_backend.enums.Roles;
import com.project.erp_backend.repositories.UserRepository;
import com.project.erp_backend.services.AuthenticationService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

	private final UserRepository repository;
	private final PasswordEncoder passwordEncoder;
	private final JwtService jwtService;
	private final AuthenticationManager authenticationManager;
	
	@Override
	public String register(RegisterDto request) {

		if (repository.existsByEmail(request.getEmail()))
			return null;
		var user = User.builder().firstName(request.getFirstName()).lastName(request.getLastName()).phone(request.getPhone())
				.email(request.getEmail()).password(passwordEncoder.encode(request.getPassword())).role(Roles.USER)
				.build();
		repository.save(user);
		
		return "Le compte est créé avec succès";
	}
	
	@Override
	public authResponse authenticate(LoginDto request) {
		Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
		var user = repository.findByEmail(request.getEmail()).orElseThrow();
		var jwtToken = jwtService.generateToken(user);
		SecurityContextHolder.getContext().setAuthentication(authentication);
	
	
		return authResponse.builder().token(jwtToken).build();
	}

}
