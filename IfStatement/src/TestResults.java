import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestResults {

			public static void main(String []args){
			
				
			int testscore = 0 ;
			char grade;
			
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(input);
			
			
			
			try
			{
				System.out.println("Please enter the test result?");
				
				testscore = Integer.parseInt(reader.readLine());
			}
			catch(Exception ex){
				System.out.print("Please enter a number value");
			}
			
			if (testscore >= 90)
			{
				grade = 'A';
			}
			else if(testscore >= 80)
			{
				grade = 'B';
			}
			else if (testscore >=70)
			{
				grade = 'C';
			}
			else if (testscore >=60)
			{
				grade = 'D';
			}
			else
			{
				grade = 'F';
			}
			System.out.println("Grade = "+ grade);
		}
			
			
				
					

	}


