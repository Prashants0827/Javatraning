package com.example.demomvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Mycontroller {
	@GetMapping("/sayhello")
	public String greeting(@RequestParam(name="name",required=false,defaultValue="Prashant")String fname, Model model){
model.addAttribute("Collegename",fname);
return "hello";
	}
}
