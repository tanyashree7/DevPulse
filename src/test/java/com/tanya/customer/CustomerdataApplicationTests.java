package com.tanya.customer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tanya.customer.entities.Customer;
import com.tanya.customer.repos.CustomerRepository;

@SpringBootTest
class CustomerdataApplicationTests {
@Autowired
	CustomerRepository repo;
	@Test
	void testSaveStudent() {
		Customer customer=new Customer();
		customer.setName("Raj");
		customer.setEmail("Rajshree@gmail.com");
		repo.save(customer);
		
	}
	@Test
	void testReadStudent() {
		Customer customer=repo.findById(1).get();
		System.out.println(customer);
	}
	@Test
	void testUpdateStudent() {
		Customer customer=repo.findById(1).get();
		customer.setName("Tanu");
		repo.save(customer);
		
	}
	@Test
	void testDeleteStudent() {
		Customer customer=repo.findById(1).get();
		repo.delete(customer);
	}

}
