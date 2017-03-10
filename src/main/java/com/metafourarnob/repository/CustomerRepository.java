package com.metafourarnob.repository;

import java.util.List;

import com.metafourarnob.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}