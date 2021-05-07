package demo.business.abstracts;

import java.util.List;

import demo.entities.concretes.Customer;

public interface ProductService {

	void add(Customer customer, List<Customer> customers);
	void add(Customer customer);
	
}
