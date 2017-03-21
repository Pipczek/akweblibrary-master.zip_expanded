package com.klb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klb.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

	//Query creation from method names
    User findByEmail(String email);

}

// @Component
// @Controller - @Service - @Repository


