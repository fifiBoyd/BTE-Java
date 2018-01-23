import java.io.BufferedReader;
import java.io.InputStreamReader;
public class GolfClub {

	public static void main(String[] args) {
		// Golf members enter details and the fees are calculated and displayed correctly
		

			
								
			int yearlyfee = 0;
			String fullmembertype;
			String associatemember;
			String ladiesmember;
			String underagemember;
			String membertype;
			
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(input);
							
							
							
			try
			{
			System.out.println("Please enter the type of membership you require?");
								
			membertype = reader.readLine();
								
			System.out.println("Are you a new member?");
								
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

	}

}
