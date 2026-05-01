package com.example.assettracker;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

	@GetMapping("/api/hello")
	Map<String, String> hello() {
		return Map.of("message", "Hello from Tiny Corp Laptop Tracker");
	}

}
