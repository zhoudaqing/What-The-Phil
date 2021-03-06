package com.whatthephil.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class GreetingController {

	
	@GetMapping("/.well-known/acme-challenge/92da9-VSaIB-FGZ8vXji0SNog0HOyP4581xR7xwhePM")
	@ResponseBody
	public String wellknown() {
		return "92da9-VSaIB-FGZ8vXji0SNog0HOyP4581xR7xwhePM._C58mQk55lmZNmP0PSWBPQmTcPk4fBZWNuNgkpoKc3Q";
	}
	
	
	@GetMapping("/")
	public String greeting() {
		return "greeting";
	}

	@GetMapping("/jstest")
	public String jstest() {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = "https://api.binance.com/api/v3/depth?symbol=XTZUSDT&limit=5000";
		ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);
		String respsone = response.getBody();
		System.out.println(response);
		
		return "jstest";
	}

}
