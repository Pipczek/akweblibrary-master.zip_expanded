package com.klb.schedulers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.klb.model.User;
import com.klb.service.EmailService;
import com.klb.service.UserService;

@Service
public class AdvService
{
	@Autowired
	private UserService userService;
	
	@Autowired
	private EmailService emailService;
	
	
	
	
    @Scheduled(fixedDelay = 10000)
    public void demoServiceMethod()
    {
    	List<User> users = userService.findAll();
    	
    	if(users == null) {
    		return;
    	}
    	
    	for(User u : users) {
    		emailService.sendEmail("test54321010@gmail.com", 
    				u.getEmail(), "Reklama", "Super biblioteka!!!");
    	}
    }
}
