package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.UserDtls;
import com.example.demo.repository.UserRepository;


@Controller
public class UserController {

	@Autowired
	private UserRepository repo;
	
	@Autowired
	
	@GetMapping("/")
	public String home()
	{
		return "index";
		//return "test";
	}
	@GetMapping("/passengers")
	public String passengersadd()
	{
		return "passengers";
		//return "test";
	}
	@PostMapping(value = "/register")
	public String check(@ModelAttribute UserDtls u)
	{
		System.out.println(u);
		repo.save(u);
		
		return "redirect:/passengers";
	}

	@GetMapping({"/viewpassengers"})
	public ModelAndView getAllEmployees() {
		ModelAndView mav = new ModelAndView("viewpassengers");
		mav.addObject("employees", repo.findAll());
		return mav;
	}

}
