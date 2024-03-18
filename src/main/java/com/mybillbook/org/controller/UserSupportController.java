package com.mybillbook.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybillbook.org.entities.UserSupport;
import com.mybillbook.org.services.UserSupportService;

@RestController
@RequestMapping("/")
public class UserSupportController {
	@Autowired
	UserSupportService userSupportService;
	
	@GetMapping("/")
	public String home() {
		return "Welcome to Home";
	}
	
	@PostMapping("/save")
	public UserSupport saveMethod(@RequestBody UserSupport user) {
		 
		return userSupportService.createTicketNumber(user);
	}
	
	@PostMapping("/delete")
	public String deleteMethod(@RequestBody int ticketId) {
		return userSupportService.deleteTicketNumber(ticketId);
	} 
}
