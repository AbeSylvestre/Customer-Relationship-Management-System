package com.asylvestre.crms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asylvestre.crms.dao.CustomerDao;
import com.asylvestre.crms.jpa.Customer;

/**
 * Service class for Customer-related processing and DB calls
 * 
 * @author Abraham Sylvestre
 *
 */
@Service
public class CustomerService implements CustomerServiceInterface {

	@Autowired
	CustomerDao customerDao;

	/**
	 * Gets a single {@link Customer} by their id.
	 */
	@Override
	@Transactional
	public Customer find(long customerId) {
		return customerDao.find(customerId);
	}

	@Override
	@Transactional
	public List<Customer> getAllCustomers() {
		return customerDao.fetchAllCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);
	}

	@Override
	@Transactional
	public void deleteCustomer(long customerId) {
		customerDao.deleteCustomer(customerId);
	}

}
