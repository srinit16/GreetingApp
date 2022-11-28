package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class GreetingController {
		
		@GetMapping("/greeting")
		public String greeting(@RequestParam(name="name", required=false, defaultValue="Students") String name, Model model) {
			// logic reading time and greet people Good Morning, Good noon, Good Afternoon, Good Evening etc
			//g="Good Morning";
			model.addAttribute("name",name);
			return "greet";
		}
}
