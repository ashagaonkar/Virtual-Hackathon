import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception{
		Scanner in =new Scanner(System.in);
		// Create new account or login
		Login l=new Login();
		int log=l.login();
		//Display the contents
		if(log!=0)
		{
			Information i=new Information();
			i.infor();
			System.out.println("\n\n1.User Option 2.Exit");
			System.out.println("Enter your Choice");
			int choice=in.nextInt();
			if(choice==1)
			{		
				User u=new User();
				u.user();
			}
		}
	}
}
	

	
