package com.amarjeet.thymleaf.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model model) {
		model.addAttribute("name","Amarjeet");
		model.addAttribute("city", "Banglore");
		model.addAttribute("currentdate", new Date().toLocaleString());
		System.out.println("inside the handller");
		return "about";
	}
	
	@GetMapping("/example-loop")
	public String Iterator(Model m)
	{
		List<String> list = List.of("amarjeet","sanjeet","hira");
		m.addAttribute("lists", list);
		return "Iterator";
	}
	
	@GetMapping("/condition")
	public String conditionHandler(Model m)
	{
		System.out.println("Condition handler executed...");
		m.addAttribute("isActive", false);
		m.addAttribute("gender", "F");
		List<Integer> list=List.of(12);
		m.addAttribute("mylist", list);
		return "condition";
	}

}
