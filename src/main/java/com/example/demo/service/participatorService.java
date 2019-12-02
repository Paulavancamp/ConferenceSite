package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.participatorDAO;
import com.example.demo.domain.participator;

@Component
public class participatorService {
	
	
	@Autowired
	participatorDAO participatorDAO; 

	/*	public List<participator> getPList() {
			List<participator> pList = new ArrayList<participator>();
			
			pList = participatorDAO.getPList();
			
			
			return pList;
			

		}
*/
		public void createNewParticipator(participator person) {
			
			participatorDAO.createNewParticipator(person);
			
		}
}
