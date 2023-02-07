package servlet_project_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import servlet_project_dto.Student;

public class StudentDao {
 public EntityManager getEntityManager() {
	 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	 return entityManagerFactory.createEntityManager();
 }
 public void signUpStudent(Student student) {
	 EntityManager entityManager=getEntityManager();
	 EntityTransaction entityTransaction=entityManager.getTransaction();
	 entityTransaction.begin();
	 entityManager.persist(student);
	 entityTransaction.commit();
 }
 public Student loginStudent(int id) {
	  EntityManager entityManager=getEntityManager();
      Student student=entityManager.find(Student.class, id);
	  
	  return student;
	  
	  
 }
}
