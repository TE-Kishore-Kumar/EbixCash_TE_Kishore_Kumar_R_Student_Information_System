package com.ebix.studentinformationsystem.Dao;

import java.util.List;

import com.ebix.studentinformationsystem.beans.StudentInfo;

public interface StudentDao {

	public boolean register(StudentInfo info);
	
	public StudentInfo authenticate(Integer rollNumber, String password);

	public List<StudentInfo> getAll(Integer rollNumber);

}
