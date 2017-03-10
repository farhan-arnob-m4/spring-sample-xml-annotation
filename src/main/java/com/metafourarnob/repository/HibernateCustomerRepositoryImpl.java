package com.metafourarnob.repository;

import java.util.ArrayList;
import java.util.List;

import com.metafourarnob.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.metafourarnob.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstName("Alandi");
		customer.setLastName("Houn");	
		customers.add(customer);
		return customers;

	}

}
