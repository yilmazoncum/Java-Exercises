package coffeeCustomerApp;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarCustomerService();
		
		Customer customer1 = new Customer();
		
		customer1.citizenNum = "10000000000";
		customer1.yearOfBirth = "2000";
		customer1.name = "ÖNCÜM KORKMAZ";
		customer1.surname = "YILMAZ";
		
		customerManager.save(customer1);

	}

}
