package com.zensar.zenlabs.zeva.voiceid.data;

import java.util.List;


import org.hibernate.Session;

public class EnrollmentDAL {

	public static void saveEnrollment(Enrollment e){
		 try{
				Session session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
			   
			    session.saveOrUpdate(e);
			    session.getTransaction().commit();
			    
			      }finally{
			    	  HibernateUtil.shutdown();
			      }
			 
	}
	
	@SuppressWarnings("unchecked")
	public static List<Enrollment> getALLEnrollments(){
		 try{
				Session session = HibernateUtil.getSessionFactory().openSession();
				 
			   return session.createCriteria(Enrollment.class).list();
			    
			      }finally{
			    	  HibernateUtil.shutdown();
			      }
			 
	}
	
}
