package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.service.demo.GenericWelcomeService;
//import com.test.service.demo.WelcomeService;

@Controller
public class WelcomeController {
	
	@Autowired
	private GenericWelcomeService welcomeService;
	
	@RequestMapping("/")
	// http://localhost:8080/AppName/
	public String doWelcome(Model model) {
		
		List<String> welcomeMessage=welcomeService.getWelcomeMessage("Dhruv Kansal");
		
		model.addAttribute("myWelcomeMessage", welcomeMessage);
		
		
		return "welcomeNew";
	}
}
