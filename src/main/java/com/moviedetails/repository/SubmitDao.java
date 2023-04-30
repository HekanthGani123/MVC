package com.moviedetails.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.moviedetails.entity.SubmitDto;

@Repository
public class SubmitDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void submitMovieDetails(SubmitDto submitDto) {
		
		Session session = sessionFactory.openSession();
		session.save(submitDto);
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		
	}

}
