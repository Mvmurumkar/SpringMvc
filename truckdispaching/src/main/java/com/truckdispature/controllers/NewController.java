package com.truckdispature.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewController {

	@RequestMapping(value="/start")
	public String startPage()
	{
		return "dispatureHome";
		
	}
	
}
