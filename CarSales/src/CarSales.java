import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CarSales {

			public static void main(String []args){
			
				
			double carprice = 0 ;
			double commission1;
			double commission2;
			double commission3;
			double commission4;
			
			
			
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(input);
			
					
			try
			{
				System.out.println("Please enter the price of the car?");
				
				carprice = Double.parseDouble(reader.readLine());
			}
			catch(Exception ex){
				System.out.print("Please enter a number value");
			}
			
			if (carprice <= 10000)
			{
				commission1 = (carprice /100 * 1.5);
				System.out.println(" The cost of the car and your Commission is  : £"  
				+ carprice + "   &  £" + commission1);
			}
			else if(carprice >=10000)
			{
				commission2 = (carprice / 100 *2.5);
				System.out.println(" The cost of the car and your Commission is  : £ "  
						+ carprice +" & £   " + commission2);
			}
			else if (carprice >=20001)
			{
				commission3 = (carprice / 100 * 5.0);
				System.out.println(" The cost of the car and your Commission is :  £ "  
						+ carprice +   " & £  " + commission3);
			}
			else if (carprice >=40000)
			{
				commission4 = (carprice /100 * 7.5);
				System.out.println(" The cost of the car and your Commission is :  £ "  
						+ carprice + "  & £ " + commission4);
			}
			
			{
				
			}
			
		}
			
			
				
					

	}



	
	


