package com.klb.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.klb.model.User;

public interface UserService extends UserDetailsService {
	void save(User user);
	User findByEmail(String email);
	List<User> findAll();
	void delete(Long id);
	User findOne(Long id);
}
