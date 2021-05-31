package com.asylvestre.crms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asylvestre.crms.dao.CustomerDao;
import com.asylvestre.crms.jpa.Customer;

/**
 * Service class for Customer-related processing and DB calls
 * 
 * @author Abraham Sylvestre
 *
 */
@Component
public class CustomerService {

	@Autowired
	CustomerDao customerDao;

	public List<Customer> fetchAllCustomers() {
		return customerDao.fetchAllCustomers();
	}

}
