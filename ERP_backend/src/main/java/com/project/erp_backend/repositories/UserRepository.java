package com.project.erp_backend.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.erp_backend.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findByEmail(String email);
	
	Boolean existsByEmail(String email);

}
