package com.example.demo;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.participator;
import com.example.demo.service.participatorService;


@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	participatorService pService;
	
    @RequestMapping(value = "/home", method=RequestMethod.GET)
    public String greeting(@ModelAttribute participator temp, Model model) {
    	
    	temp = new participator("", "", "", "", "", "", "");
    	model.addAttribute("participator", temp);
    	//model.addAttribute("message","Howdy Partner");
        return "home";
        
    }   
    
    @RequestMapping(value = "/login", method=RequestMethod.POST)
    public String loginInfo(@ModelAttribute participator temp, Model model) {
    	//call function to check if employee exists and passwords match
    	model.addAttribute("participator", temp);
    	
    	return "/landing";
        
    }   
    
    
	
}