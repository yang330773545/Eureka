package com.vinzor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String index(@RequestParam String name) {
		return "hello "+name+"，this is first messge";
	}
	@RequestMapping("/foo")
	public String foo(String foo) {
	    return "hello "+foo+"!";
	}
}
