package Classes;

public class HousesForRent extends House
{// variables for HouseForSale
	public int CustomerNumber;
	public Double RentPerMonth;
	public String Status; 

	
	//Constructor for holding the houses for Rent details
	public int CustomerNumber()
	{
		return CustomerNumber;
		}
	public void setCustomerNumber(int customerNumber)
	{
		CustomerNumber = customerNumber;
	}
	public Double RentPerMonth()
	{
		return RentPerMonth;
	}
	public void setRentPerMonth (Double rentpermonth)
	{
		RentPerMonth = rentpermonth;
	}
	public String Status(){
		return Status;
	}
	public void setStatus (String status){
		Status =status;
	}
	//Displaying houses for rent details
	public void Display()
	{
		super.Display();
		System.out.println("Houses For Rent");
		System.out.println("________________");
		System.out.println("Customer Reference Number:   " + CustomerNumber());
		System.out.println("House Rent Per Month:   " + RentPerMonth ());
		System.out.println("House Status Available/Occupied/Awaiting Confirmation:   " + Status());
	}
	public HousesForRent(int HouseRef, String HouseLocation, int NumBedrooms, boolean Garage, 
			int CustomerNumber, Double Price, String Status)throws Exception
	{
		super(HouseRef, HouseLocation, NumBedrooms, Garage);
		setCustomerNumber(CustomerNumber);
		setRentPerMonth(RentPerMonth);
		setStatus(Status);
	}
	public HousesForRent()throws Exception
	{
	super();
	CustomerNumber = 134;
	RentPerMonth = 300.00;
	Status = "Awaiting Confirmation";
		
		
	}	
	}



