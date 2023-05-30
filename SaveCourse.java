package com.ty;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCourse {
 public static void main(String[] args) {
	 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sangu");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student=new Student();
		student.setName("Sheldon");
		student.setAge(36);
		student.setPhno(9585252525l);
		student.setMarks(99.3);
		
		Student student1=new Student();
		student1.setName("Leonard");
		student1.setAge(36);
		student1.setPhno(958415525l);
		student1.setMarks(79.3);
		
		Student student2=new Student();
		student2.setName("Howard");
		student2.setAge(26);
		student2.setPhno(9585141525l);
		student2.setMarks(89.3);
		
		Course course=new Course();
		course.setName("Theoratical Physics");
		course.setFees(600000);
		course.setTrainer("Einstein");
		
		Course course1=new Course();
		course1.setName("Experimental  Physics");
		course1.setFees(90000);
		course1.setTrainer("Maxwell");
		
		Course course2=new Course();
		course2.setName("Engineering");
		course2.setFees(360000);
		course2.setTrainer("Larry");
		
		Course course3=new Course();
		course3.setName("Quantum Mechanics");
		course3.setFees(750000);
		course3.setTrainer("Schrodinger");
		
		Course course4=new Course();
		course4.setName("Philosophy");
		course4.setFees(3600);
		course4.setTrainer("Aristotle");
		
		List<Course> list=new ArrayList();
		list.add(course);
		list.add(course3);
		list.add(course4);
		
		List<Course> list1=new ArrayList();
		list1.add(course1);
		list1.add(course3);
		list1.add(course2);
		
		List<Course> list2=new ArrayList();
		list2.add(course3);
		list2.add(course2);
		list2.add(course1);
		
		student.setCourses(list);
		student1.setCourses(list1);
		student2.setCourses(list2);
		
		entityTransaction.begin();
	    entityManager.persist(student);
	    entityManager.persist(student1);
	    entityManager.persist(student2);
	    entityManager.persist(course);
	    entityManager.persist(course1);
	    entityManager.persist(course2);
	    entityManager.persist(course3);
	    entityManager.persist(course4);
	    entityTransaction.commit();
		
		
		
}
}
