
package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.domain.CompanyMapper;
import com.example.demo.domain.participator;

@Component
public class participatorDAO {
	
	@Autowired
	private CompanyMapper companyMapper;
	
//	public List<participator> getPList() {
//		
//		List<participator> pList = new ArrayList<participator>();
//		
//		pList = companyMapper.getPList();
//		
//		
//		/*
//		 * Employee e1 = new Employee("John", "Smith", "123456"); Employee e2 = new
//		 * Employee("Sally", "jones", "234567"); Employee e3 = new Employee("Praveen",
//		 * "M", "345678");
//		 * 
//		 * empList.add(e1); empList.add(e2); empList.add(e3);
//		 */
//		return pList;
//	}

	public void createNewParticipator(participator person) {
		companyMapper.createNewParticipator(person);
	}
}
