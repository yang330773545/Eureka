package com.vinzor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/foo")
	public String foo(String foo) {
		return "hello"+foo;
	}
}
