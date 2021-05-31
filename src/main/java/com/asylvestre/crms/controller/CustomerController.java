package com.asylvestre.crms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asylvestre.crms.jpa.Customer;
import com.asylvestre.crms.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@RequestMapping("/list")
	public String listCustomers(Model model) {
		List<Customer> customerList = customerService.fetchAllCustomers();
		model.addAttribute("customerList", customerList);

		return "list-customers";
	}

}
