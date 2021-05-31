package com.asylvestre.crms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.asylvestre.crms.jpa.Customer;

@Repository
public class CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<Customer> fetchAllCustomers() {
		Session session = sessionFactory.getCurrentSession();
		Query<Customer> query = session.createQuery("from Customer", Customer.class);
		List<Customer> customerList = query.getResultList();

		return customerList;
	}

}
