package com.oehm4.Hibernate.mavenAssignmentProject.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.oehm4.Hibernate.mavenAssignmentProject.DTO.BikeDTO;

public class BikeDAO 
{

	
		public void saveBikeDetails(BikeDTO bikeDTO) 
		{
			Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(BikeDTO.class);
		 	SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(bikeDTO);
			transaction.commit();	
		}
		
		public BikeDTO getBikeDetailsById(Long id) {
			System.out.println("entered");
			Configuration configuration = new Configuration();
			configuration.configure();
			//configuration.addAnnotatedClass(AccountDTO.class);
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			return session.get(BikeDTO.class, id);
		}
		
		public void updatePriceById(Long id, Double price) {
			BikeDTO bikeDTO = getBikeDetailsById(id);
			if(bikeDTO!=null) {
				
				/*Configuration configuration = new Configuration();
				configuration.configure();
				configuration.addAnnotatedClass(AccountDTO.class);
				SessionFactory sessionFactory = configuration.buildSessionFactory();*/
				Session session = MySessionFactory.createSessionFactory().openSession();
				Transaction transaction = session.beginTransaction();
				bikeDTO.setPrice(price);
				session.update(bikeDTO);
				transaction.commit();
			}else {
				System.out.println("Price Update failed");
			}
		
	}
	
}
