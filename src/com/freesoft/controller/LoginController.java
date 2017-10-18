package com.freesoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.freesoft.service.GenericService;

@Controller
public class LoginController {

	@Autowired
	private GenericService service;
	
	@RequestMapping("/")
	public String doWelcome(Model model) {
		List<String> welcomeMessage = service.getWelcomeMessage("Dina Bogdan");
		
		model.addAttribute("myWelcomeMessage", welcomeMessage);
		
		return "login";
	}
}
