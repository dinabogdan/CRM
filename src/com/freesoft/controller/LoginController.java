package com.freesoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.freesoft.service.GenericService;

@Controller
public class LoginController {

	@Autowired
	private GenericService service;

	@RequestMapping(value = "/")
	public String doWelcome() {
		return "login";
	}

	@RequestMapping(value = "/main-page", method=RequestMethod.GET)
	public String login(Model model) {
		return "main-page";
	}
	
	
	@RequestMapping(value="/loginfailed")
	public String loginFailed() {
		return "login";
	}
	
	@RequestMapping(value="/logout")
	@ResponseBody
	public String logout() {
		return "logout";
	}

}
