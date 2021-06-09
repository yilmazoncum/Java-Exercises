package coffeeCustomerApp;

public class StarCustomerService extends BaseCustomerManager{
	
	MernisServiceAdapter mernis = new MernisServiceAdapter();
	
	
	
	@Override
	public void save(Customer customer) {
		
		if(mernis.CheckIfRealPerson(customer)) {
			 super.save(customer);
		}
		
		else System.out.println("not valid customer");
		
		
		
	}

}
