package com.chatbot.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class chatbot {

	@GetMapping("/index")
	public String test() {
		return "/index";
	}

	@GetMapping("/help")
	public String help() {
		return "chatbot";
	}
	
	@PostMapping("/help")
	public String help2() {
		return "<div>that was funny</div>";
	}
	
}
