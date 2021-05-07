package demo.business.concrete;

import java.util.List;
import java.util.Scanner;

import demo.business.abstracts.ProductService;
import demo.core.GoogleAuthServiceAdapter;
import demo.core.IMailVerifiction;
import demo.core.MailVerificationService;
import demo.core.ValidationService;
import demo.dataAccess.abstracts.CustomerDao;
import demo.entities.concretes.Customer;

public class ProductManager implements ProductService {
	
	CustomerDao customerDao;
	IMailVerifiction mailverifiction;

	public ProductManager(CustomerDao customerDao, IMailVerifiction mailverifiction) {
		super();
		this.customerDao = customerDao;
		this.mailverifiction = mailverifiction;
	}

	@Override
	public void add(Customer customer,List<Customer> customers) {
	ValidationService validService = new ValidationService();
	
	if(validService.MailAvailable(customer,customers)) {
		if(validService.isNameSurnameValid(customer.name, customer.surname)&&
				validService.isMailValid(customer.mail)&&
				validService.isPasswordValid(customer.password)) {
			
				if(mailverifiction.sendVerificationMail(customer)) customerDao.save(customer);
				
				else System.out.println("kayıt yapılamadı");	
					
				}
				else {
					System.out.println("kayıt yapılamadı");
				}
					
				}
	else System.out.println("Bu mail mevcut");
	
	}

	@Override
	public void add(Customer customer) {
		ValidationService validService = new ValidationService();
		MailVerificationService mailVerification = new MailVerificationService();
		
	
		if(validService.isNameSurnameValid(customer.name, customer.surname)&&
				validService.isMailValid(customer.mail)&&
				validService.isPasswordValid(customer.password)) {
					
				if(mailVerification.sendVerificationMail(customer)) customerDao.save(customer);
				
				else System.out.println("kayıt yapılamadı");	
					
				}
				else {
					System.out.println("kayıt yapılamadı");
		
	}
	
	
	
	

	}
}