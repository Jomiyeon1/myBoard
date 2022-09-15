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
	    EntityManager em = emf.createEntityManager(); //��ƼƼ�Ŵ��� ����
	    EntityTransaction tx = em.getTransaction(); //Ʈ����� ��� ȹ��
		
		tx.begin();
		System.out.println("UserRe Start...");
		try {
			
			em.persist(user);
			
			tx.commit();
			
		} catch (Exception e) {
			
            e.printStackTrace();
            tx.rollback();//Ʈ����� �ѹ�
            
		}finally {
			
			 em.close(); //��ƼƼ�Ŵ��� ����
			 
		}
		
		
		System.out.println("UserRe End...");
		
		
		emf.close();
		
	}

	@Override
	public User findUser(String userId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaboard");
	    EntityManager em = emf.createEntityManager(); //��ƼƼ�Ŵ��� ����
	    EntityTransaction tx = em.getTransaction(); //Ʈ����� ��� ȹ��
		
	    User findUser = new User();
	    
		tx.begin();
		System.out.println("UserRe Start...");
		try {
			
			findUser = em.find(User.class, userId);
			
			tx.commit();
			
			return findUser;
			
		} catch (Exception e) {
			
            e.printStackTrace();
            tx.rollback();//Ʈ����� �ѹ�
            
		}finally {
			
			 em.close(); //��ƼƼ�Ŵ��� ����
			 
		}
		
			System.out.println("UserRe End...");
		
		
		emf.close();
		
		return findUser;
	
		
	}
	
	

}
