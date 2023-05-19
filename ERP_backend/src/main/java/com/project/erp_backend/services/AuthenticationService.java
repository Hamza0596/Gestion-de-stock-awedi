package com.project.erp_backend.services;

import com.project.erp_backend.dto.LoginDto;
import com.project.erp_backend.dto.RegisterDto;
import com.project.erp_backend.dto.authResponse;

public interface AuthenticationService {
	
	public String register(RegisterDto request);
	
	public authResponse authenticate(LoginDto request);

}
