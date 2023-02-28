package com.codingdojo.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/your_server")
public class MainController {

	
    @GetMapping("")
    public String index(HttpSession session) {
    	//Save a session
    	if(session.getAttribute("counter") == null) {
    		session.setAttribute("counter", 0);
    	}
    	else {
    		Integer counter = (Integer) session.getAttribute("counter");
    		session.setAttribute("counter", counter+1);
    	}
    	
        return "index.jsp";
    }
        
    @GetMapping("/counterPlusTwo") 
    public String plusTwo(HttpSession session) {
    	if(session.getAttribute("counter") == null) {
    		session.setAttribute("counter", 0);
    	}
        else {
    		Integer counter = (Integer) session.getAttribute("counter");
    		session.setAttribute("counter", counter+2);
    	}
        
    	return "plusTwo.jsp";
    }

    @GetMapping("/reset") 
    public String reset(HttpSession session) {
    		session.setAttribute("counter", 0);

    	return "reset.jsp";
    }

    
    
    
    
    
	
    @GetMapping("/counter")
    public String showCounter(HttpSession session, Model model) {
		Integer currentCount = (Integer) session.getAttribute("counter");
		model.addAttribute("countToShow", currentCount);
		return "showCount.jsp";
		
    }
    
		
}