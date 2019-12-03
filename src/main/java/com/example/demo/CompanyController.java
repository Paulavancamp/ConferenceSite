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
public class CompanyController {

	private static final Logger logger = LoggerFactory.getLogger(CompanyController.class);
	
	@Autowired
	participatorService pService;
	
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(@ModelAttribute participator person, Model model) {

    	person = new participator("", "", "", "", "", "", "");
    	model.addAttribute("participator", person);
        return "register";
        
    }
	
    @RequestMapping(value = "/createNewParticipator", method = RequestMethod.POST)
    public String saveParticipator(@ModelAttribute participator person, Model model) {

    	pService.createNewParticipator(person);
    	/*
    	if(person == author) {
    		add to author table using person.email
    	}
    	if(person == reviewer) {
    		add to reviewer table 
    	}
    	*/
    	
    	model.addAttribute("message","Success");
    	model.addAttribute("participator", person);
    	
        return "register";
        
    }   
	
}