import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestAssignmentGrade {

	public static void main(String[] args) {
		// to allow a student to enter in examination and assignment marks to get grade
		
		
				
						
		int examscore = 0 ;
		int assignmentscore=0;
		String grade;
					
					InputStreamReader input = new InputStreamReader(System.in);
					BufferedReader reader = new BufferedReader(input);
					
					
					
					try
					{
						System.out.println("Please enter the test result?");
						
						examscore = Integer.parseInt(reader.readLine());
						
						System.out.println("Please enter your asssigment result?");
						
						assignmentscore = Integer.parseInt(reader.readLine());
					}
					catch(Exception ex){
						System.out.print("Please enter a number value");
					}
					
					if (examscore + assignmentscore /2 >= 60)
					{
						grade = ("Pass with Commendation");
					}
					else if(examscore + assignmentscore /2  >= 40)
					{
						grade = (" Pass");
					}
					else if (examscore + assignmentscore /2  <=40)
					{
						grade = "Sorry you did not pass";
										}
					else
					{
						grade = ("Fail");
					}
					{
					System.out.println ("Result:" + grade);
					}
				}
					
					
						
							

			}

