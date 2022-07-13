package user.details;
//1. User details (user id, user f name, l name, user city)


class UserDetails{
	public  int userId ;
	public  String firstName;
	public String  lastName;
	public String city;
	public UserDetails(int userId, String firstName, String lastName, String city) {
	
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
	}
	
	
	
}
public class Userdetailsconstructor {

	public static void main(String[] args) {
		UserDetails  userObject = new UserDetails(2525140,"Tushyap","Bari","Lucknow");
		System.out.println("User's ID is : "+ userObject.userId);
		System.out.println("User's first name is : "+ userObject.firstName);
		System.out.println("User's last name is : "+ userObject.lastName);
		System.out.println("User's city is : "+ userObject.city);
       
	}

}
