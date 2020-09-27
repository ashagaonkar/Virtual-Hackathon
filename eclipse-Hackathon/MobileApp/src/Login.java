
import java.util.Scanner;

public class Login {
	private Scanner in;
	int login()
	{
		Scanner in =new Scanner(System.in);
		System.out.println("1.Create account 2.Login");
		System.out.println("enter your choice:");
		int choice = in.nextInt();
		String fname;
	    String lname;
		String email;
		String password;
		String cpassword;
		//Creating account
		if(choice==1)
			{
			    System.out.println("First Name:");
			    fname=in.next();
		        System.out.println("Last Name:");
		        lname=in.next();
		        System.out.println("Email Address:");
		        email=in.next();
		        System.out.println("Password:");
		        password=in.next();
		        System.out.println("Confirm Password:");
		        cpassword=in.next();
		        if(password.equals(cpassword))
		        {
		        	System.out.println();
		        }
		        else
		        {
		        	System.out.println("Password doesn't match!!!");
		        	return 0;
		        }
			}	
		//Logging in
		else
		{
			System.out.println("Email:");
	        email=in.next();
			System.out.println("Password:");
			password=in.next();
		}
		return 1;
	}
}
