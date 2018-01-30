package com.yui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LonginController {
	
	@RequestMapping("/web")
	public String getDefault() {
		
		return "index";
	}
}
