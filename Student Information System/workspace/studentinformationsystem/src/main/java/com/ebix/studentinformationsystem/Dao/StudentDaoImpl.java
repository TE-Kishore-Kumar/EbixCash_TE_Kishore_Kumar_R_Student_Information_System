package com.ebix.studentinformationsystem.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ebix.studentinformationsystem.beans.StudentInfo;
import com.ebix.studentinformationsystem.beans.StudentInfo2;
import com.ebix.studentinformationsystem.beans.StudentInfo3;
import com.ebix.studentinformationsystem.exception.StudentException;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	static Integer rollnumber;

	@Override
	public boolean registerYear1(StudentInfo info) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			factory = Persistence.createEntityManagerFactory("studentsunit");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(info);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			return false;
		}
	}
	
	@Override
	public boolean registerYear2(StudentInfo2 info2) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			factory = Persistence.createEntityManagerFactory("studentsunit");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(info2);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			return false;
		}
	}
	
	@Override
	public boolean registerYear3(StudentInfo3 info3) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			factory = Persistence.createEntityManagerFactory("studentsunit");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(info3);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			return false;
		}
	}


	@Override
	public StudentInfo authenticate(Integer rollNumber, String password) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("studentsunit");
		EntityManager manager = factory.createEntityManager();
		StudentInfo info = manager.find(StudentInfo.class, rollNumber);
		if (info != null) {
			if (info.getPassword().equals(password)) {
				rollnumber =info.getRollNumber();
				return info;
			}
		}
		manager.close();
		throw new StudentException("Invalid Credentials");
	}

//	@Override
//	public List<StudentInfo> getAll(Integer rollNumber) {
//		EntityManagerFactory factory = null;
//		EntityManager manager = null;
//		try {
//			factory = Persistence.createEntityManagerFactory("studentsunit");
//			manager = factory.createEntityManager();
//			StudentInfo info = manager.find(StudentInfo.class, rollNumber);
//			String fetch = "from StudentInfo where rollNumber=:rn";
//			Query query = manager.createQuery(fetch);
//			query.setParameter("rn", rollNumber);
//			List<StudentInfo> result =  query.getResultList();
//			if (result != null) {
//				return result;
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		throw new StudentException("Login First");
//	}

	@Override
	public List<StudentInfo> getFirst() {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		try {
			factory = Persistence.createEntityManagerFactory("studentsunit");
			manager = factory.createEntityManager();
//			StudentInfo info = manager.find(StudentInfo.class, rollnumber);
			String que = "from  StudentInfo where rollNumber =: rn";
			Query query = manager.createQuery(que);
			query.setParameter("rn", rollnumber);
			List<StudentInfo> result = query.getResultList();
			if(result != null) {
				return result;
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return null;
	}

	@Override
	public List<StudentInfo2> getSecond() {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		try {
			factory = Persistence.createEntityManagerFactory("studentsunit");
			manager = factory.createEntityManager();
//			StudentInfo2 info = manager.find(StudentInfo2.class, rollnumber);
			String que = "from  StudentInfo2 where rollNumber=:rn";
			Query query = manager.createQuery(que);
			query.setParameter("rn", rollnumber);
			List<StudentInfo2> result = query.getResultList();
			if(result != null) {
				return result;
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return null;
	}

	@Override
	public List<StudentInfo3> getThird() {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		try {
			factory = Persistence.createEntityManagerFactory("studentsunit");
			manager = factory.createEntityManager();
//			StudentInfo3 info = manager.find(StudentInfo3.class, rollnumber);
			String que = "from  StudentInfo3 where rollNumber=:rn";
			Query query = manager.createQuery(que);
			query.setParameter("rn", rollnumber);
			List<StudentInfo3> result = query.getResultList();
			if(result != null) {
				return result;
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return null;
	}

}
