package com.example.SpringBootProjectSimplilearn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/welcome")
	public String greeting(@RequestParam (value="name",defaultValue="User") String name)
	{
		return " Welcome "+ name;
	}

}
