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

import com.example.demo.domain.Reviews;
import com.example.demo.service.ReviewsService;


@Controller
public class reviewController {

	private static final Logger logger = LoggerFactory.getLogger(reviewController.class);
	
	@Autowired
	ReviewsService rService; 
	
    @RequestMapping(value = "/reviewPaper")
    public String blankReview(@ModelAttribute Reviews review, Model model) {
    	
    	review = new Reviews("", "", "", "", "", "", "", "", "");
    	model.addAttribute("newReview", review);
    	
    	model.addAttribute("allValues", populateRadio());
    	
        return "reviewPaper";
        
    }   
      
    @RequestMapping(value = "/submitReview", method = RequestMethod.POST)
    public String saveReview(@ModelAttribute Reviews review, Model model) {

    	rService.createNewReview(review);
    	model.addAttribute("message","Success");
    	model.addAttribute("newReview", review);
    	model.addAttribute("allValues", populateRadio());
        return "reviewPaper";
        
    }
    
    private List<String> populateRadio(){
    	List<String> allValues = new ArrayList<String>();
    	allValues.add("1");
    	allValues.add("2");
    	allValues.add("3");
    	allValues.add("4");
    	allValues.add("5");
    	allValues.add("6");
    	allValues.add("7");
    	allValues.add("8");
    	allValues.add("9");
    	allValues.add("10");
    	
    	return allValues;
    }
	
    
	
}