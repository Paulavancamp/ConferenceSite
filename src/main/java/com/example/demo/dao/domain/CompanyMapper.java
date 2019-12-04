package com.example.demo.dao.domain;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.domain.participator;
import com.example.demo.domain.Reviews;

@Mapper
public interface CompanyMapper {

	@Insert("insert into participator(email, firstname, minit, lastname, phone, affiliation, password)"
			+ "values (#{email}, #{firstname}, #{minit}, #{lastname}, #{phone}, #{affiliation}, #{password})")
	public void createNewParticipator(participator person);
	

	
	/*@Insert("INSERT INTO reviews VALUES (revemail, paperID, techMerit, readability, originality, relavance, "
			+ "overallrecomm, commentForCommittee, commentForAuthor );"
			+"values (#{revemail}, #{paperID}, #{techMerit}, #{readability}, #{originality}, #{relevance}, "
			+ "#{overallrecomm}, #{commentForCommittee}, #{commentForAuthor})")
	*/
	
	//Insert Review into Reviews 
		@Insert("INSERT INTO reviews VALUES (#{revemail}, #{paperID}, #{techMerit}, #{readability}, #{originality}, #{relevance}, #{overallrecomm}, #{commentForCommittee}, #{commentForAuthor})")
		public void createNewReview(Reviews review);

	
}
