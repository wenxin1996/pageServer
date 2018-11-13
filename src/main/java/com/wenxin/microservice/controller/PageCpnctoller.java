package com.wenxin.microservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageCpnctoller {
	@RequestMapping("/")
	public String home() {
		return "index";
	}
}
