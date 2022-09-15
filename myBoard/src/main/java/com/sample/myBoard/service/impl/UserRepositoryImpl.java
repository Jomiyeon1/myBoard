package com.sample.myBoard.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.sample.myBoard.domain.User;
import com.sample.myBoard.service.UserRepository;
import com.sample.myBoard.utils.JpaUtil;

@Repository
public class UserRepositoryImpl implements UserRepository{



	@Override
	public void save(User user) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaboard");
	    EntityManager em = emf.createEntityManager(); //엔티티매니저 생성
	    EntityTransaction tx = em.getTransaction(); //트랜잭션 기능 획득
		
		tx.begin();
		System.out.println("UserRe Start...");
		try {
			
			em.persist(user);
			
			tx.commit();
			
		} catch (Exception e) {
			
            e.printStackTrace();
            tx.rollback();//트랜잭션 롤백
            
		}finally {
			
			 em.close(); //엔티티매니저 종료
			 
		}
		
		
		System.out.println("UserRe End...");
		
		
		emf.close();
		
	}

	@Override
	public User findUser(String userId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaboard");
	    EntityManager em = emf.createEntityManager(); //엔티티매니저 생성
	    EntityTransaction tx = em.getTransaction(); //트랜잭션 기능 획득
		
	    User findUser = new User();
	    
		tx.begin();
		System.out.println("UserRe Start...");
		try {
			
			findUser = em.find(User.class, userId);
			
			tx.commit();
			
			return findUser;
			
		} catch (Exception e) {
			
            e.printStackTrace();
            tx.rollback();//트랜잭션 롤백
            
		}finally {
			
			 em.close(); //엔티티매니저 종료
			 
		}
		
			System.out.println("UserRe End...");
		
		
		emf.close();
		
		return findUser;
	
		
	}
	
	

}
