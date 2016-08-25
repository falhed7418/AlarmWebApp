package com.alarm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class AlarmController {

	
	@RequestMapping(value="/alarm", method=RequestMethod.GET)
	public String mainList(Model model){
		 		
		return "index";
	}
	
}
