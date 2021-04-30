package inheritence;

public class UserManager  {
	


	public void nameUpdate(User user, String name ,String surname) {
		System.out.println("nameUpdate is working");
		user.setName(name);
		user.setSurname(surname);
	}
	
	

}
