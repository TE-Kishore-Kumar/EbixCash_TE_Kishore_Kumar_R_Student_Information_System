package com.ebix.studentinformationsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebix.studentinformationsystem.Dao.StudentDao;
import com.ebix.studentinformationsystem.beans.StudentInfo;
import com.ebix.studentinformationsystem.beans.StudentInfo2;
import com.ebix.studentinformationsystem.beans.StudentInfo3;

@Service
public class StudentServiceImpl implements StudentService{

	
	@Autowired(required = false)
	private StudentDao dao;
	
	@Override
	public boolean registerYear1(StudentInfo info) {
		double avg =(info.getEnglish()+info.getMaths()+info.getScience()+info.getComputerScience()+info.getPhysicalExcercise())/5;
		info.setAverage(avg);
		if(avg > 50 && avg < 70) {
			info.setGrade("C");
		}else if(avg >70 && avg < 90){
			info.setGrade("B");
		}else if(avg > 90) {
			info.setGrade("A");
		}
		return dao.registerYear1(info);
	
	}
	
	@Override
	public boolean registerYear2(StudentInfo2 info2) {
		double avg2 = (info2.getHmt()+info2.getFmm()+info2.getMechatronics()+info2.getFop()+info2.getFmmLab())/5;
		info2.setAverage2(avg2);
		if(avg2 > 50 && avg2 < 70) {
			info2.setGrade2("C");
		}else if(avg2 >70 && avg2 < 90){
			info2.setGrade2("B");
		}else if(avg2 > 90) {
			info2.setGrade2("A");
		}
		return dao.registerYear2(info2);
	}
	
	
	@Override
	public boolean registerYear3(StudentInfo3 info3) {
		double avg3 = (info3.getEngineeringGraphics()+info3.getEngineeringMechanics()+info3.getAutoCAD()+info3.getCreo()+info3.getAnsys())/5;
		info3.setAverage3(avg3);
		if(avg3 > 50 && avg3 < 70) {
			info3.setGrade3("C");
		}else if(avg3 >70 && avg3 < 90){
			info3.setGrade3("B");
		}else if(avg3 > 90) {
			info3.setGrade3("A");
		}
		return dao.registerYear3(info3);
	}


	@Override
	public StudentInfo authenticate(Integer rollNumber, String password) {
		if(rollNumber <= 0) {
			return null;
			}
			return dao.authenticate(rollNumber, password);
	}

//	@Override
//	public List<StudentInfo> getAll(Integer rollNumber) {
//	 return dao.getAll(rollNumber);
//	}

	@Override
	public List<StudentInfo> getFirst() {
		return dao.getFirst();
	}

	@Override
	public List<StudentInfo2> getSecond() {
		return dao.getSecond();
	}

	@Override
	public List<StudentInfo3> getThird() {
		return dao.getThird();
	}

}
