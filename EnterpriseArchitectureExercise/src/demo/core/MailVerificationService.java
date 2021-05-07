package demo.core;

import java.util.Scanner;

import demo.entities.concretes.Customer;

public class MailVerificationService implements IMailVerifiction {
	

	@Override
	public boolean sendVerificationMail(Customer customer) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(customer.mail + " adresine doğrulama maili gönderildi");
		System.out.println("Doğrulama simülasyonu için \"1\"e basın");
		
		if(scan.nextInt() == 1) {
			System.out.println("Doğrulama başarılı");	
			return true;
		} 
		else {
			System.out.println("Doğrulama Başarısız");
			return false;
		}
	
	}
}