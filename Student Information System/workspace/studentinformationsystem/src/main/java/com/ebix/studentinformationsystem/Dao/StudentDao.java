package com.ebix.studentinformationsystem.Dao;

import java.util.List;

import com.ebix.studentinformationsystem.beans.StudentInfo;
import com.ebix.studentinformationsystem.beans.StudentInfo2;
import com.ebix.studentinformationsystem.beans.StudentInfo3;

public interface StudentDao {

	public boolean registerYear1(StudentInfo info);
	
	public boolean registerYear2(StudentInfo2 info2);
	
	public boolean registerYear3(StudentInfo3 info3);
	
	public StudentInfo authenticate(Integer rollNumber, String password);

//	public List<StudentInfo> getAll(Integer rollNumber);

	public List<StudentInfo> getFirst();

	public List<StudentInfo2> getSecond();

	public List<StudentInfo3> getThird();

}
