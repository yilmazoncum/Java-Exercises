package demo.entities.concretes;

public class Customer {
	public String name;
	public String surname;
	public String password;
	public String mail;
	public Customer(String name, String surname, String password, String mail) {
		super();
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.mail = mail;
	}
}
