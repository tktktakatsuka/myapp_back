package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;



@RestController
@RequestMapping("/api")
public class HelloApplicationController {
    @Autowired
    private MyEntityService service;

    @GetMapping("/entities")
    public List<forums> getAllEntities() {
        return service.getAllEntities();
    }


	@RequestMapping("/hello") // ルートへこのメソッドをマップする
	public String test() {
		return "Hello World";
	}
}
