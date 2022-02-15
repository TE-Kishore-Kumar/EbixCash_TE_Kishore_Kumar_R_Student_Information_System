package com.ebix.studentinformationsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebix.studentinformationsystem.Dao.StudentDao;
import com.ebix.studentinformationsystem.beans.StudentInfo;

@Service
public class StudentServiceImpl implements StudentService{

	
	@Autowired(required = false)
	private StudentDao dao;
	
	@Override
	public boolean register(StudentInfo info) {
		double avg =(info.getEnglish()+info.getMaths()+info.getScience()+info.getComputerScience())/4;
		info.setAverage(avg);
		if(avg > 50 && avg < 70) {
			info.setGrade("C");
		}else if(avg >70 && avg < 90){
			info.setGrade("B");
		}else if(avg > 90) {
			info.setGrade("A");
		}
		return dao.register(info);
	
	}

	@Override
	public StudentInfo authenticate(Integer rollNumber, String password) {
		if(rollNumber <= 0) {
			return null;
			}
			return dao.authenticate(rollNumber, password);
	}

	@Override
	public List<StudentInfo> getAll(Integer rollNumber) {
	 return dao.getAll(rollNumber);
	}


}
