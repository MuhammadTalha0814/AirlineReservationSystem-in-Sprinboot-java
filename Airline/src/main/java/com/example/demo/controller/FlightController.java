package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.repository.FlightRepository;

@Controller
public class FlightController {

	@Autowired
	private FlightRepository repof;
	@GetMapping({"/test"})
	public ModelAndView getAllEmployees() {
		ModelAndView mav = new ModelAndView("test");
		mav.addObject("employees", repof.findAll());
		return mav;
	}
}
