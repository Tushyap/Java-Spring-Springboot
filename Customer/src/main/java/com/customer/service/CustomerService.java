package com.customer.service;

import java.util.List;

import com.customer.entity.CustomerTb;

public interface CustomerService {

	public CustomerTb saveCustomer(CustomerTb customerTb);

	public List<CustomerTb> getAllCustomers();

	public CustomerTb getCustomer(Long customerId);

	public String deleteCustomer(CustomerTb customerTb);

	public CustomerTb updateCustomer(CustomerTb customerTb);
}
