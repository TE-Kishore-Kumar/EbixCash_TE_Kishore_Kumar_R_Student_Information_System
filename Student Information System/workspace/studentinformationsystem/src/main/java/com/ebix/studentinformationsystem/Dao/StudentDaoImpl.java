package com.ebix.studentinformationsystem.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ebix.studentinformationsystem.beans.StudentInfo;
import com.ebix.studentinformationsystem.exception.StudentException;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Override
	public boolean register(StudentInfo info) {
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
	public StudentInfo authenticate(Integer rollNumber, String password) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("studentsunit");
		EntityManager manager = factory.createEntityManager();
		StudentInfo info = manager.find(StudentInfo.class, rollNumber);
		if (info != null) {
			if (info.getPassword().equals(password)) {
				return info;
			}
		}
		manager.close();
		throw new StudentException("Invalid Credentials");
	}

	@Override
	public List<StudentInfo> getAll(Integer rollNumber) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		try {
			factory = Persistence.createEntityManagerFactory("studentsunit");
			manager = factory.createEntityManager();
			StudentInfo info = manager.find(StudentInfo.class, rollNumber);
			String fetch = "from StudentInfo where rollNumber=:rn";
			Query query = manager.createQuery(fetch);
			query.setParameter("rn", rollNumber);
			List<StudentInfo> result =  query.getResultList();
			if (result != null) {
				return result;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		throw new StudentException("Login First");
	}

}
