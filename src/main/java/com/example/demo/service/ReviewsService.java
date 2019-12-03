package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.ReviewDAO;
import com.example.demo.domain.Reviews;

@Component
public class ReviewsService {
	
	
	@Autowired
	ReviewDAO reviewDAO; 

		public void createNewReview(Reviews review) {
			
			reviewDAO.createNewReview(review);
			
		}
}
