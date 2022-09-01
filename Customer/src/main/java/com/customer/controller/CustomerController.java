package com.customer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.customer.entity.Customer;
import com.customer.entity.CustomerTb;
import com.customer.entity.Ticket;
import com.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/save")
	public Customer saveCustomer(@RequestBody Customer customer) {
		CustomerTb customerObj = new CustomerTb();
		customerObj.setCustomerName(customer.getCustomerName());
		customerObj.setCustomerPassword(customer.getCustomerPassword());
		customerObj.setDateOfBirth(customer.getDateOfBirth());
		List<Long> list = new ArrayList<Long>();
		for (Ticket ticket : customer.getTicketList()) {
			list.add(ticket.getTicketId());
		}
		customerObj.setTicketIds(list);
		customerObj.setCustomerContact(customer.getCustomerContact());
		customerObj = customerService.saveCustomer(customerObj);
		customer.setCustomerId(customerObj.getCustomerId());
		return customer;
	}

	@GetMapping("/show")
	public List<Customer> showAllCustomer() {
		List<CustomerTb> customerObj = customerService.getAllCustomers();
		List<Customer> lists = new ArrayList<Customer>();
		for (CustomerTb temp : customerObj) {
			Customer customer = new Customer();
			customer.setCustomerId(temp.getCustomerId());
			customer.setCustomerName(temp.getCustomerName());
			customer.setCustomerPassword(temp.getCustomerPassword());
			customer.setDateOfBirth(temp.getDateOfBirth());
			for (Long ticket : temp.getTicketIds()) {
				customer.getTicketList()
						.add(restTemplate.getForObject("http://localhost:7777/ticket/get/" + ticket, Ticket.class));
			}
			customer.setCustomerContact(temp.getCustomerContact());
			lists.add(customer);
		}

		return lists;
	}

	@GetMapping("/show/{id}")
	public Customer showCustomer(@PathVariable("id") Long id) {
		CustomerTb temp = customerService.getCustomer(id);
		Customer customer = new Customer();
		customer.setCustomerId(temp.getCustomerId());
		customer.setCustomerName(temp.getCustomerName());
		customer.setCustomerPassword(temp.getCustomerPassword());
		customer.setDateOfBirth(temp.getDateOfBirth());
		List<Ticket> tickets = new ArrayList<Ticket>();
		for (Long ticket : temp.getTicketIds()) {
			tickets.add(restTemplate.getForObject("http://localhost:7777/ticket/get/" + ticket, Ticket.class));
		}
		customer.setTicketList(tickets);
		customer.setCustomerContact(temp.getCustomerContact());

		return customer;
	}

	@PutMapping("/update/{id}")
	public Customer saveCustomer(@PathVariable("id") Long id, @RequestBody Customer customer) {
		CustomerTb customerObj = new CustomerTb();
		customerObj.setCustomerId(id);
		customerObj.setCustomerName(customer.getCustomerName());
		customerObj.setCustomerPassword(customer.getCustomerPassword());
		customerObj.setDateOfBirth(customer.getDateOfBirth());
		List<Long> list = new ArrayList<Long>();
		for (Ticket ticket : customer.getTicketList()) {
			list.add(ticket.getTicketId());
		}
		customerObj.setTicketIds(list);
		customerObj.setCustomerContact(customer.getCustomerContact());
		customerObj = customerService.saveCustomer(customerObj);
		customer.setCustomerId(customerObj.getCustomerId());
		return customer;
	}

	@DeleteMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable("id") Long id) {
		return customerService.deleteCustomer(customerService.getCustomer(id));
	}
}
