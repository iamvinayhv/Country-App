package com.bridgelabz.CountryApp.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bridgelabz.CountryApp.model.Country;

/**
 * @author vinay(vk)
 * @category implementation of CountryDAO
 * @since 2017-april-07
 */
@Repository
public class CountryDAOImpl implements CountryDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	@Override
	public Object addCountry(Country country) {
		
		Session session=sessionFactory.openSession();
		Transaction tr = null;
		try{
			tr = session.beginTransaction();
			Object object = session.save(country);
			tr.commit();
			return object;
		}
		catch(Exception e)
		{
			tr.rollback();
			return null;
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public List getCountries() {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("from Country");
		List list = query.list();
		session.close();
		return list;
	}

	@Override
	public int deleteById(int id) {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		String hql = "delete from Country where id=:id";
		
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		
		int result = query.executeUpdate();
		transaction.commit();
		session.close();
		return result;
	}

	@Override
	public int deleteByName(String name) {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		String hql = "delete from Country where name=:countryName";
		
		Query query = session.createQuery(hql);
		query.setParameter("countryName", name);
		
		int result = query.executeUpdate();
		transaction.commit();
		session.close();
		return result;
	}

	@Override
	public void updateCountryDetails(Country country) throws Exception {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(country);
		/*String hql = "update Country set countryCode=:countryCode ,name=:name , area=:area ,population=:population ,currency:currency ,date=:date";
		
		Query query =session.createQuery(hql);
		int result  = query.executeUpdate();*/
		transaction.commit();
	}

	@Override
	public Country detailsOfCountry(int id) {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		String hql = "from Country where id=:id";
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		Country country = (Country) query.uniqueResult();
		
		return country;
		
	}
	
	


}
