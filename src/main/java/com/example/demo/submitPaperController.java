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
public class submitPaperController {

	private static final Logger logger = LoggerFactory.getLogger(submitPaperController.class);
	
	
    @RequestMapping(value = "/submitPaper")
    public String loadSubmissionPage( Model model) {
    	
        return "submitPaper";
        
    }   
    
    @RequestMapping(value = "/submitNewPaper", method = RequestMethod.POST)
    public String saveParticipator(Model model) {

    	model.addAttribute("message","Thank you for your submission!");
    	
        return "submitPaper";
        
    } 
    
	
}