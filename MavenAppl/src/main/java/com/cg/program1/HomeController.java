package com.cg.program1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/Home")
	public String home() {
		return "Hello Home Page!!!";
	}

	@RequestMapping("/About")
	public String about() {
		return "About ";
	}
}
