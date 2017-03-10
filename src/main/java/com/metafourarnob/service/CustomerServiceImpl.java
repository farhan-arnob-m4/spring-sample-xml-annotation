package com.metafourarnob.service;

import java.util.List;

import com.metafourarnob.model.Customer;
import com.metafourarnob.repository.CustomerRepository;
import com.metafourarnob.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.metafourarnob.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	

}
