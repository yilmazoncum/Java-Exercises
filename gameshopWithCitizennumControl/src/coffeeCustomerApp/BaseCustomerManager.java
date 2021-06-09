package coffeeCustomerApp;

public class BaseCustomerManager implements Icustomer{

	@Override
	public void save(Customer customer) {
	System.out.println(customer.name + customer.surname + "saved to database");
		
	}

}
