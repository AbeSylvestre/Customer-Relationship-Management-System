package com.asylvestre.crms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.asylvestre.crms.jpa.Customer;

@Repository
public class CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * Gets a single Customer record by id
	 * 
	 * @param customerId the customer id
	 * @return Customer
	 */
	public Customer find(long customerId) {
		Session session = sessionFactory.getCurrentSession();
		Customer customer = session.get(Customer.class, customerId);

		return customer;
	}

	/**
	 * Gets all records within the Customer table
	 * 
	 * @return List of {@link Customer}
	 */
	public List<Customer> fetchAllCustomers() {
		Session session = sessionFactory.getCurrentSession();
		Query<Customer> query = session.createQuery("from Customer", Customer.class);
		List<Customer> customerList = query.getResultList();

		return customerList;
	}

	/**
	 * Saves the customer record
	 * 
	 * @param customer Customer
	 */
	public void saveCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.merge(customer);

	}

	public void deleteCustomer(long customerId) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("DELETE FROM Customer WHERE id = :customerId");
		query.setParameter("customerId", customerId);

		query.executeUpdate();
	}

}
