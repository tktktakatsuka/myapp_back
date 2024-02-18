package com.example.myapp_back;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloApplicationController {
	@RequestMapping("/hello") // ルートへこのメソッドをマップする
	public String test() {
		return "Hello World";
	}
}
