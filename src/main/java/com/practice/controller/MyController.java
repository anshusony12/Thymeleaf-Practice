package com.practice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.thymeleaf.expression.Lists;

@Controller
public class MyController {
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model model) {
		System.out.println("inside about handler"); 
		model.addAttribute("name", "Anshu Sony");
		model.addAttribute("currentdate", new Date().toString());
		return "about";
		//about.html page
	}
//	iterate handller
	@GetMapping("/example-loop")
	public String iterateHandller(Model m) {
		List<String> names = List.of("Laxmi", "Karan", "Vikash");
		m.addAttribute("names", names);
		return "iterate";
	}
	
	@GetMapping("/condition")
	public String conditionalHandler(Model m) {
		System.out.println("this is conditional statement executed");
		m.addAttribute("isActive", true);
		m.addAttribute("gender", "F");
		List<Integer> mylist = List.of(223,33,34,55);
		m.addAttribute("l", mylist);
		return "condition";
	}
	// fragment handler
	@GetMapping("/services")
	public String fragmentHandler(Model m) {
		m.addAttribute("name", "Anshu Soni");
		return "services";
	}
	@GetMapping("/newAbout")
	public String newAbout() {
		return "newAbout";
	}
}
