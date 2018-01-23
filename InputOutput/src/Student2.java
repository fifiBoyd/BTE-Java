import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Student2 {

	public static void main(String[] args) {
		
		//Variables
		int StudentNumber;
		String StudentName; 
		String CourseTitle;
		String CourseCode;
		String ModuleName;
		Boolean FeesPaid;
		
		InputStreamReader input =new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);
		
		//Program
		try{
			System.out.println("Please enter your name");
			Scanner s = new Scanner(System.in);
			StudentName = s.nextLine();
			
			System.out.println("What is your Student number?");
			StudentNumber = Integer.parseInt(reader.readLine());
			
			
			System.out.println("What is the title of your course?");
			CourseTitle = s.nextLine();
			
			System.out.println("What is your course code?");
			CourseCode = s.nextLine();
			
			System.out.println("What is the module name?");
			ModuleName = s.nextLine();
			
			System.out.println("Have you paid your course fees?");
			FeesPaid = Boolean.parseBoolean(s.nextLine());
			
			System.out.println(" Student Number:    " + StudentNumber + "Students name:    " 
			+ StudentName + "Course Tiltle:    " + CourseTitle + "Course Code:       "  + CourseCode + 
			" Module Name:           " + ModuleName + "Have you paid your Fees Yes/ No" + FeesPaid );
			
			
			
		}catch (Exception ex){
			
		}
		
		
	}

}
