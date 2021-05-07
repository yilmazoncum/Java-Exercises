package demo.core;

import demo.entities.concretes.Customer;

public interface IMailVerifiction {

	public boolean sendVerificationMail(Customer customer);
	
}
