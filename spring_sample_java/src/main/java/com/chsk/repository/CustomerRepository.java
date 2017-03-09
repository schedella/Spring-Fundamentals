package com.chsk.repository;

import java.util.List;

import com.chsk.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}