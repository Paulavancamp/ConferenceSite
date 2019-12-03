
package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.domain.CompanyMapper;
import com.example.demo.domain.Reviews;

@Component
public class ReviewDAO {
	
	@Autowired
	private CompanyMapper companyMapper;

	public void createNewReview(Reviews review) {
		companyMapper.createNewReview(review);
	}
}
