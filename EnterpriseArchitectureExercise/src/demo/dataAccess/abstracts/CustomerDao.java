package demo.dataAccess.abstracts;

import demo.entities.concretes.Customer;

public interface CustomerDao {
	void save(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
}
