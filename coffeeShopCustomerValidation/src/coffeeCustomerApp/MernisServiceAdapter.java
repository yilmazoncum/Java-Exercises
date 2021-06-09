package coffeeCustomerApp;

import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements IcheckCustomer{
	
	KPSPublicSoap mernisService = new KPSPublicSoapProxy();
	
	

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean check = false;
		try {
			check = client.TCKimlikNoDogrula(Long.parseLong(customer.citizenNum), 
					customer.name.toUpperCase(), 
					customer.surname.toUpperCase(),
					customer.yearOfBirth);
		} catch (NumberFormatException e) {
			
		e.printStackTrace();
		}
		catch(RemoteException e) {
		
		e.printStackTrace();
		}
	
		System.out.println(check); //Debug
		return check;
	}
	
}