package com.Mvcproject.DemoMVC.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	  @GetMapping("/")
	  public String  defaultPageOpen() {
		  
		  return"login";
	  }
	
}
