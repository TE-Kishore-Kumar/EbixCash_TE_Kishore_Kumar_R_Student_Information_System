package com.ebix.studentinformationsystem.service;

import java.util.List;

import com.ebix.studentinformationsystem.beans.StudentInfo;

public interface StudentService {

	public boolean register(StudentInfo info);
	
	public StudentInfo authenticate(Integer rollNumber, String password);

	public List<StudentInfo> getAll(Integer rollNumber);


}
