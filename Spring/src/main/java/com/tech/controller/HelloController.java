package com.tech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping({ "/", "/home" })
	@ResponseBody
	public String hi() {
		return "Hello, world.";
	}

	@RequestMapping("test")
	public String test() {
		return "test";
	}

	@RequestMapping("login")
	public String login() {
		return "login";
	}
}