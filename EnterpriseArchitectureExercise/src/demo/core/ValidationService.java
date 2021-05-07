package demo.core;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import demo.entities.concretes.Customer;

public class ValidationService implements IValidationService{
	String regexMail = "^(.+)@(\\S+)$";
	String regexName = "^[a-zA-Z]{2}[a-zA-Z]*";
	String regexPassword = "^.{6,}";
	
	
	public boolean isMailValid(String mail) {
		
		Pattern pattern = Pattern.compile(regexMail);
		Matcher matcher = pattern.matcher(mail);
		
		if(matcher.matches())return true;
		
		else {
		System.out.println("Invalid Mail");
		return false;
		} 
		
		
	}
	
	public boolean isNameSurnameValid(String name , String surname) {
		Pattern pattern = Pattern.compile(regexName);
		Matcher matcher = pattern.matcher(name);
		Matcher matcher2 = pattern.matcher(surname);
		
		if(matcher.matches() && matcher2.matches())return true;
		
		else {
		System.out.println("Invalid name/surname");
		return false;
		} 
		
	}
	
	public boolean isPasswordValid(String password) {
		Pattern pattern = Pattern.compile(regexPassword);
		Matcher matcher = pattern.matcher(password);
		
		if(matcher.matches())return true;
		
		else {
		System.out.println("Invalid Password");
		return false;
		}
	}

	@Override
	public boolean MailAvailable(Customer customer, List<Customer> customers) {
		
		for(Customer x : customers) {
		  if(x.mail == customer.mail ) return false;	  
		}
		return true;
		
	}
	

}
