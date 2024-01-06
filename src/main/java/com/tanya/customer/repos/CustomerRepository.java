package com.tanya.customer.repos;

import org.springframework.data.repository.CrudRepository;

import com.tanya.customer.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
