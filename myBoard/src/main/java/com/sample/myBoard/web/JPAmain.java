package com.sample.myBoard.web;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.sample.myBoard.domain.User;

public class JPAmain {

	public JPAmain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Filed
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaboard");
		EntityManager em = emf.createEntityManager(); // ��ƼƼ�Ŵ��� ����
		EntityTransaction tx = em.getTransaction(); // Ʈ����� ��� ȹ��

		tx.begin(); // Ʈ����� ����

		try {
			
			User user = new User();
			
			user.setUserId("1111");
			user.setPassword("1111");
			user.setName("1111");
			
			em.persist(user);
			
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();// Ʈ����� �ѹ�
		} finally {
			em.close();
		}
		emf.close();
	}

}
