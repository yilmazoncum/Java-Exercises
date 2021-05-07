import java.util.ArrayList;

import demo.business.concrete.ProductManager;
import demo.core.GoogleAuthServiceAdapter;
import demo.dataAccess.concrete.HibernateCustomerDao;
import demo.entities.concretes.Customer;

public class Main {

	
	public static void main(String[] args) {
		ProductManager customerManager = new ProductManager(new HibernateCustomerDao(),new GoogleAuthServiceAdapter());
		
		
		Customer customer1 = new Customer("Oncum", "Yilmaz","1234567", "oncumkorkmaz@gmail.com");
		Customer customer2 = new Customer("Abasdasd","dasdafasdasd","123asdaasd","oncumkorkmaz@gmail.com");
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customerManager.add(customer1);
		customers.add(customer1);

		
		
		customerManager.add(customer2,customers);
		customers.add(customer2);
	}

}
