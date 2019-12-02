package com.example.demo.dao.domain;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.domain.participator;

@Mapper
public interface CompanyMapper {
/*	
	@Select("SELECT EMAIL, FIRSTNAME, LASTNAME FROM PARTICIPATOR")
	public List<participator> getPList();
*/
	@Insert("insert into participator(email, firstname, minit, lastname, phone, affiliation, password)"
			+ "values (#{email}, #{firstname}, #{minit}, #{lname}, #{phone}, #{affiliation}, #{password})")
	public void createNewParticipator(participator person);
	
}
