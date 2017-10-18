package com.freesoft.service;

import java.util.ArrayList;
import java.util.List;

public class WelcomeService implements GenericService{
	
	@Override
	public List<String> getWelcomeMessage (String message){
		List<String> welcomeMessage = new ArrayList<>();
		welcomeMessage.add("This is a Spring-Maven Project");
		welcomeMessage.add("Hello " + message);
		return welcomeMessage;
		
	}

}
