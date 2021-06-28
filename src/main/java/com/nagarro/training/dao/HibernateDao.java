package com.nagarro.training.dao;

import org.hibernate.Session;

/**
 * To deal with hibernate sessions.
 * 
 * @author nikhilsharma05
 *
 */
public interface HibernateDao {
	public Session getSession();

	public void begin();

	public void commit();

	public void close();

	public void rollback();
}
