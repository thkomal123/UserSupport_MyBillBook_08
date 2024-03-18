package com.mybillbook.org.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybillbook.org.entities.UserSupport;
import com.mybillbook.org.repository.UserSupportRepository;

@Service
public class UserSupportServiceImpl implements UserSupportService {
     @Autowired
     UserSupportRepository userSupportRepository;
     
	@Override
	public UserSupport createTicketNumber(UserSupport users) {
		return userSupportRepository.save(users);
		
	}

	@Override
	public UserSupport updateTicketNumber(UserSupport users) {		
		return userSupportRepository.save(users);
	}

	@Override
	public String deleteTicketNumber(int ticketId) {
              userSupportRepository.deleteById(ticketId);
              return "Deleted Successfully";
	}

	@Override
	public Optional<UserSupport>  getbyTicketNumberId(UserSupport users) {
		 
		return userSupportRepository.findById(users.getTicketNumber());
	}
}
