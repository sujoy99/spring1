package org.itbl.controller;

import java.util.Arrays;
import java.util.List;

import org.itbl.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

	@GetMapping("/home")
	public String home(Model model) {
		
		User user = new User();
		List<User> userList = null;
		
		model.addAttribute("user", user);
		model.addAttribute("userList", userList);
		
		return "index";
	}
	
	@PostMapping("/home")
	public String home_submit(Model model, User user) {
		
//		User user1 = user;
		
		List<User> userList = Arrays.asList(user);
		model.addAttribute("user", new User());
		model.addAttribute("userList", userList);
		
		return "index";
	}
}
