package com.metafourarnob.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metafourarnob.model.Customer;
import com.metafourarnob.repository.CustomerRepository;


@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	/* (non-Javadoc)
	 * @see com.metafourarnob.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	

}
