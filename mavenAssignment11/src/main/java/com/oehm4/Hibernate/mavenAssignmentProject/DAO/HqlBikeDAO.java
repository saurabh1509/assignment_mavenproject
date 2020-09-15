package com.oehm4.Hibernate.mavenAssignmentProject.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.oehm4.Hibernate.mavenAssignmentProject.DTO.BikeDTO;



public class HqlBikeDAO 
{

	public List<BikeDTO> getBikeDetails() {
		/*Configuration configuration = new Configuration();
		configuration.configure();
		//configuration.addAnnotatedClass(AccountDTO.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();*/
		Session session = MySessionFactory.createSessionFactory().openSession();
		String hql="from BikeDTO";
		Query query = session.createQuery(hql);
		List<BikeDTO> list = query.list();
		return list;
	}
	
	public BikeDTO getBikeDetailsByEnginecc(String  enginecc) {
		/*Configuration configuration = new Configuration();
		configuration.configure();
		//configuration.addAnnotatedClass(AccountDTO.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();*/
		Session session = MySessionFactory.createSessionFactory().openSession();
		String hql="from BikeDTO where Enginecc=:eEnginecc";
		Query query = session.createQuery(hql);
		query.setParameter("eEnginecc", enginecc );
		BikeDTO uniqueResult = (BikeDTO) query.uniqueResult();
		return uniqueResult;
	}
	
	public void updateChasisnoByBikeName(String bikeName,String newChasisno) {
		/*Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();*/
		Session session = MySessionFactory.createSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		String hql="update BikeDTO set chasisno=:newChasisno where bikeName=:bikeName";
		Query query = session.createQuery(hql);
		query.setParameter("newChasisno", newChasisno);
		query.setParameter("bikeName", bikeName);
		int updateRows = query.executeUpdate();
		transaction.commit();
		if(updateRows == 0) {
			System.out.println("Update Operation Failed");
			return;
		}
		System.out.println("Update Operation successfull");
	}
	
	public void deleteById(Long id) {
		/*Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();*/
		Session session = MySessionFactory.createSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		String hql="delete BikeDTO where id=:id";
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		int updateRows = query.executeUpdate();
		transaction.commit();
		if(updateRows == 0) {
			System.out.println("Delete Operation Failed");
			return;
		}
		System.out.println("Delete Operation successfull");
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	

