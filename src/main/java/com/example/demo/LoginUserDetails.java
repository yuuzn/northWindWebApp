package com.example.demo;

import org.springframework.security.core.authority.AuthorityUtils;

import lombok.Data;

@Data
public class LoginUserDetails extends org.springframework.security.core.userdetails.User{
	private final User user;

	public LoginUserDetails(User user) {
		super(user.getUsername(), user.getPassword(),AuthorityUtils.createAuthorityList("ROLE_USER"));
		this.user = user;
	}

}
