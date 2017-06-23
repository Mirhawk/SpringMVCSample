package com.app.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
	
	public HelloController() {
		System.out.println("In constructor of hello world!");
	}
	
	@RequestMapping("/hello")
	public String helloFunction() {
		System.out.println("in say hello");
		return "welcome";
	}
	
	@RequestMapping("/hello1")
	public ModelAndView helloFunction1() {
		System.out.println("in say hello of date");
		return new ModelAndView("welcome",
				"server_dt",new Date());
	}
	
	
	
}