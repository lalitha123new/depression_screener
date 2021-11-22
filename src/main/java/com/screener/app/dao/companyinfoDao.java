package com.screener.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.screener.app.entity.ScrResponce;
import com.screener.app.entity.Users;
import com.screener.app.entity.companyinfo;
//import com.screener.app.services.CompanyService;
import com.screener.app.util.HibernateUtilConfig;

@Repository
public class companyinfoDao {

	@Autowired
	private HibernateUtilConfig hibernateUtilConfig;
	
	

	public int createCompany(companyinfo companyinfo) {
		Session session = null;
		SessionFactory sessionFactory = hibernateUtilConfig.getSessionFactory();

		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			
			companyinfo.setCompany_info_id(0);

			int Id = (int) session.save(companyinfo);

			System.out.println("companyid----" + Id);
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return 0;

	}
	
	
	public List<companyinfo> getCompany() {
		Session session = null;
		SessionFactory sessionFactory = hibernateUtilConfig.getSessionFactory();

		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			String hql = "select *from company_info";
			Query query = session.createSQLQuery(hql).addEntity(companyinfo.class);
			List<companyinfo> results = query.list();
			session.getTransaction().commit();
			return results;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return null;

	}


	public int getCompanyCode(String company_code) {
		
		
		Session session = null;
		SessionFactory sessionFactory = hibernateUtilConfig.getSessionFactory();

		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			String hql = "select company_info_id from company_info  where company_code = :company_code";
			Query query = session.createSQLQuery(hql);
			query.setParameter("company_code", company_code);
			Integer results = (Integer) query.uniqueResult();
			session.getTransaction().commit();
			if(results != null) {
				return results;
			}else {
				
				return 0;
			}
			
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return 0;
	}


	public int updateCompany(companyinfo companyinfo,Integer company_info_id) {
		Session session = null;
		SessionFactory sessionFactory = hibernateUtilConfig.getSessionFactory();

		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			companyinfo companyinfo1 = 
	                    (companyinfo)session.get(companyinfo.class, company_info_id); 
			companyinfo1.setCompany_name(companyinfo.getCompany_name());
			companyinfo1.setCompany_code(companyinfo.getCompany_code());
			companyinfo1.setCompany_address(companyinfo.getCompany_address());
			companyinfo1.setCreatedAt(null);
			session.update(companyinfo1);
			System.out.println(companyinfo.getCompany_address());
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return 0;
	}


	public List<companyinfo> getCompanyInd(Integer company_info_id) {
		Session session = null;
		SessionFactory sessionFactory = hibernateUtilConfig.getSessionFactory();

		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			String hql = "select * from company_info  where company_info_id = :company_info_id";
			Query query = session.createSQLQuery(hql);
			query.setParameter("company_info_id", company_info_id);
			List<companyinfo> results = query.list();
			session.getTransaction().commit();
			if(results != null) {
				return results;
			}else {
				
				return null;
			}
				

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return null;
	}


	//*********************RESPONCE CODE*****************************//
	
	public int saveResponce(ScrResponce scrResponce) {
		Session session = null;
		SessionFactory sessionFactory = hibernateUtilConfig.getSessionFactory();

		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			
			//companyinfo.setCompany_info_id(0);

			int Id = (int) session.save(scrResponce);

			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return 0;
	}


	public List<ScrResponce> getResBycompany(Integer company_info_id) {
		// TODO Auto-generated method stub
		
		
		Session session = null;
		SessionFactory sessionFactory = hibernateUtilConfig.getSessionFactory();

		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			String hql = "SELECT * FROM scr_responce  where company_info_id = :company_info_id";
			Query query = session.createSQLQuery(hql);
			query.setParameter("company_info_id", company_info_id);
			List<ScrResponce> results = query.list();
			session.getTransaction().commit();
			if(results != null) {
				return results;
			}else {
				
				return null;
			}
				

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return null;
		
	}


	public List<ScrResponce> getResByResId(Integer scr_responce_id) {
		// TODO Auto-generated method stub
		Session session = null;
		SessionFactory sessionFactory = hibernateUtilConfig.getSessionFactory();

		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			String hql = "SELECT * FROM scr_responce  where scr_responce_id = :scr_responce_id";
			Query query = session.createSQLQuery(hql);
			query.setParameter("scr_responce_id", scr_responce_id);
			List<ScrResponce> results = query.list();
			session.getTransaction().commit();
			if(results != null) {
				return results;
			}else {
				
				return null;
			}
				

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return null;
		
		
	}


	public int login(Users user) {
		// TODO Auto-generated method stub
				Session session = null;
				SessionFactory sessionFactory = hibernateUtilConfig.getSessionFactory();

				try {
					session = sessionFactory.openSession();
					session.beginTransaction();
					String hql = "SELECT users_id FROM users  where username = :username AND password = :password";
					Query query = session.createSQLQuery(hql);
					query.setParameter("username", user.getUsername());
					query.setParameter("password", user.getPassword());
					Integer results = (Integer) query.uniqueResult();
					session.getTransaction().commit();
					if(results != null) {
						return results;
					}else {
						
						return 0;
					}
						

				} catch (Exception e) {
					e.printStackTrace();
				} finally {

				}
				return 0;
				
	}

}
