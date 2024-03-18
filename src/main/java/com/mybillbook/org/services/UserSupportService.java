package com.mybillbook.org.services;

import java.util.Optional;

import com.mybillbook.org.entities.UserSupport;

public interface UserSupportService {
	
      public UserSupport createTicketNumber(UserSupport users);
      public UserSupport updateTicketNumber(UserSupport users);
      public String deleteTicketNumber(int users);
      public Optional<UserSupport> getbyTicketNumberId(UserSupport users);
      
}
