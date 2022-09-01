package com.customer.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.entity.CustomerTb;
import com.customer.repository.CustomerRepository;
import com.customer.service.CustomerService;
import com.customer.exception.ResourceNotFoundException;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public CustomerTb saveCustomer(CustomerTb customerTb) {
		return customerRepository.save(customerTb);
	}

	@Override
	public List<CustomerTb> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public CustomerTb getCustomer(Long customerId) {
		return customerRepository.findById(customerId)
				.orElseThrow(() -> new ResourceNotFoundException("Customer", "customerId", customerId));
	}

	@Override
	public CustomerTb updateCustomer(CustomerTb customerTb) {
		return customerRepository.save(customerTb);
	}
	
	@Override
	public String deleteCustomer(CustomerTb customerTb) {
		customerRepository.delete(customerTb);
		return "Customer "+customerTb.getCustomerName()+" deleted";
	}

}
