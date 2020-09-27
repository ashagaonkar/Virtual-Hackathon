import java.util.Scanner;

public class User extends App {
	private Scanner in;
	void user()
	{
        Scanner in=new Scanner(System.in);
        System.out.println("1.Download App 2.Add/Upload App");
        System.out.println("Enter the choice");
        int choice = in.nextInt();
        if(choice==1)
        {
        	System.out.println("You can download any app");
        }
        else
        {
        String filename;
	    String des;
		System.out.println("\n\n....Enter app details....");
		System.out.println("Enter the app name");			
		filename=in.next();
		System.out.println("Description abou the app");
		des=in.next();
		System.out.println("Your app is successfully uploaded");
		System.out.println("Thank YOU...");
        }
	}
}
	
	
	