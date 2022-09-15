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
		EntityManager em = emf.createEntityManager(); // 엔티티매니저 생성
		EntityTransaction tx = em.getTransaction(); // 트랜잭션 기능 획득

		tx.begin(); // 트랜잭션 시작

		try {
			
			User user = new User();
			
			user.setUserId("1111");
			user.setPassword("1111");
			user.setName("1111");
			
			em.persist(user);
			
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();// 트랜잭션 롤백
		} finally {
			em.close();
		}
		emf.close();
	}

}
