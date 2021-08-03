package com.olamundo.olamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/oi")

public class OlaController {

	@GetMapping 
	public String oie() {
		return ("oi mundo!");
	}
}
