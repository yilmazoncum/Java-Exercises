package demo.dataAccess.concrete;

import demo.dataAccess.abstracts.CustomerDao;
import demo.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {

	@Override
	public void save(Customer customer) {
		System.out.println("Hibernate ile eklendi");
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
