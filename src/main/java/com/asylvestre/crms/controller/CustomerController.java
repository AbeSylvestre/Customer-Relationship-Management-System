package com.asylvestre.crms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.asylvestre.crms.jpa.Customer;
import com.asylvestre.crms.service.CustomerServiceInterface;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerServiceInterface customerService;

	@GetMapping("/list")
	public String listCustomers(Model model) {
		List<Customer> customerList = customerService.getAllCustomers();
		model.addAttribute("customerList", customerList);

		return "list-customers";
	}

	@GetMapping("/customerForm")
	public String fetchCustomerForm(Model model) {
		// Create model attribute to bind form data
		Customer customer = new Customer();
		model.addAttribute("customer", customer);

		return "customer-form";
	}

	@GetMapping("/updateCustomer")
	public String updateCustomer(@RequestParam("customerId") long customerId, Model model) {
		Customer customer = customerService.find(customerId);
		model.addAttribute(customer);

		return "customer-form";
	}

	@GetMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam("customerId") long customerId) {
		customerService.deleteCustomer(customerId);

		return "redirect:/customer/list";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.saveCustomer(customer);

		return "redirect:/customer/list";
	}

}
