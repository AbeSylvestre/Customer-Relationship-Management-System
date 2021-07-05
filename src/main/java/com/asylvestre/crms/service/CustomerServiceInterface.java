package com.asylvestre.crms.service;

import java.util.List;

import com.asylvestre.crms.jpa.Customer;

public interface CustomerServiceInterface {

	public Customer find(long customerId);

	public List<Customer> getAllCustomers();

	public void saveCustomer(Customer customer);

	public void deleteCustomer(long customerId);

}
