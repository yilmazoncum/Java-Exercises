package demo.core;

import GoogleAuthService.GoogleMailAutService;
import demo.entities.concretes.Customer;

public class GoogleAuthServiceAdapter implements IMailVerifiction{

	@Override
	public boolean sendVerificationMail(Customer customer) {
		GoogleMailAutService googleAuth = new GoogleMailAutService();
		
		System.out.println("debug");
		
		googleAuth.mail();
		return true;
	}

}
