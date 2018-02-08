package Classes;

public class House 
{
	//Declaring Variables
	public int HouseRef;
	public String HouseLocation;
	public int NumBedrooms=0;
	public boolean Garage;
	
	//getting the house details
	public int getHouseRef()
	{
	return HouseRef;
	}
	//ensures house ref within range or prints out of range
	public void setHouseRef(int houseref)throws Exception{
		if (houseref < 100 || houseref >999)
		{
			Exception ex = new Exception (" House Reference Number out of Range");
			throw ex;
		}
		else
		{
			HouseRef = houseref;
			}
	}
		public String getHouseLocation()
		{
		return HouseLocation;
		}	
	public void setHouseLocation(String houselocation)
	{
	
		HouseLocation = houselocation;
	}
	public int getNumBedrooms()
	{
	return NumBedrooms;
	}	
public void setNumBedrooms(int numbedrooms)
{

	NumBedrooms = numbedrooms;
}
// Sets garage from a string entered into the Boolean
public boolean hasGarage()
{
return Garage;
}	
public void setGarage(boolean garage)
{

Garage = garage;
}
	public void setGarage(String garage){
		if (garage.toLowerCase().startsWith("Y"))
		{
			Garage = true;
		}
		else
		{
			Garage = false;
		}
	}
	public String getgarage(){
		if (Garage)
		{
			return "Garage";
		}
			else 
			{
				return "No Garage";
			}
	}

			// Display the Details of the house entered 
		public void Display()
		{
			System.out.println("Details of House");
			System.out.println("________________");
			System.out.println("House Reference Number:   " + getHouseRef());
			System.out.println("Location of House:    " + getHouseLocation());
			System.out.println("Number of Bedrooms:   " + getNumBedrooms());
			System.out.println("The property has:     " + hasGarage());
		
		}
			
			
		public House (int HouseRef, String HouseLocation, int NumBedrooms, boolean Garage)throws Exception{

		setHouseRef(HouseRef);
		setHouseLocation(HouseLocation);
		setNumBedrooms(NumBedrooms);
		setGarage(Garage);
		}
		public House()throws Exception
		{
			setHouseRef(999);
			setHouseLocation("hamletLocation");
			setNumBedrooms(3);
			setGarage(true);
		}
		
}
		

