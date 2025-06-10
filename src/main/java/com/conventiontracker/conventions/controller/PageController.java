package com.conventiontracker.conventions.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/")
	public String home() {
		return "index.html";
	}

	@GetMapping("/conventions")
	public String conventions() {
		return "conventions.html";
	}
}