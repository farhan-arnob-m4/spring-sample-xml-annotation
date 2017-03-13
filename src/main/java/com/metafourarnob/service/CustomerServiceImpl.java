package com.metafourarnob.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metafourarnob.model.Customer;
import com.metafourarnob.repository.CustomerRepository;


@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		// TODO Auto-generated constructor stub
		System.out.println("We are using constructor injection");
		this.customerRepository = customerRepository;
	}
	
	//@Autowired
	private void setCustomerRepository(CustomerRepository customerRepository){
		System.out.println("We are using setter injection");
		this.customerRepository = customerRepository;
		
	}
	
	/* (non-Javadoc)
	 * @see com.metafourarnob.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	

}
