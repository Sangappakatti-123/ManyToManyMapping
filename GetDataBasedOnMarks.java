package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.persistence.Query;

public class GetDataBasedOnMarks {
 public static void main(String[] args) {
	EntityManagerFactory  entityManagerFactory=Persistence.createEntityManagerFactory("sangu");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	Query query= entityManager.createQuery("select s from Student s where phno=?1");
	 query.setParameter(1, 9585252525l);
	 Student student =(Student)query.getSingleResult();
	 System.out.println(student.getName());
	 System.out.println(student.getAge());
	 System.out.println(student.getMarks());
	 
	  List<Course> c1=student.getCourses();
	  for(Course c:c1) {
		  System.out.println(c.getName());
		  System.out.println(c.getTrainer());
		  System.out.println(c.getFees());
		  System.out.println("*************************************");
	  }
	 
}
}
