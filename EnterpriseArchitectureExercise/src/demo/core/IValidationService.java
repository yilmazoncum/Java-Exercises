package demo.core;

import java.util.List;

import demo.entities.concretes.Customer;

public interface IValidationService {
	boolean isMailValid(String mail);
	
	boolean isNameSurnameValid(String name , String surname);
	
	boolean isPasswordValid(String password);
	boolean MailAvailable(Customer customer,List<Customer> customers);
}
