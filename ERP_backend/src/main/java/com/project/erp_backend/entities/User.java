package com.project.erp_backend.entities;

import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.project.erp_backend.enums.Roles;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User extends AbstractEntity implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String firstName;

	private String lastName;

	private String password;

	private String email;

	private int phone;

	private String image;

	private boolean isEnabled;

	@Enumerated(EnumType.STRING)
	private Roles role;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		 return List.of(new SimpleGrantedAuthority(role.name()));
	}

	@Override
	public String getUsername() {

		return email;
	}

	@Override
	public boolean isAccountNonExpired() {

		return true;
	}

	@Override
	public boolean isAccountNonLocked() {

		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {

		return true;
	}

	@Override
	public boolean isEnabled() {

		return true;
	}

}
