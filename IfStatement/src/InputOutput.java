import java.util.Scanner;

public class InputOutput {
	
	
	public static void main(String []args)
		{
		String firstName;
		String lastName;
		//Scanner
		Scanner s = new Scanner(System.in);
		// ask for the user name
		System.out.println("What is your firstname?");
		
		
		firstName =s.next();
		System.out.println ("Your first name is: "+ firstName);
		
		//ask for the surname
		System.out.println("What is your surname?");
		
		// Scanner
		lastName = s.next();
		System.out.println("Your Surname is " +lastName);
		System.out.println("Your full name is " + firstName + "  "+ lastName);
		}
	}


