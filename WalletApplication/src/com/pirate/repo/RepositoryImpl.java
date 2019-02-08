package com.pirate.repo;

import java.util.List;

import com.pirate.bean.Customer;

public interface RepositoryImpl {

	boolean save(Customer customer);

	List<Customer> showByName(String name);

}