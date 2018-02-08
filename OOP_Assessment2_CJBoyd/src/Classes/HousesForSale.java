package Classes;

public class HousesForSale extends House
{
// varibales for HouseForSale
	public int CustomerNumber;
	public Double Price;
	public String Status; 

	
	//Constructor for holding the houses for sale details
	public int CustomerNumber()
	{
		return CustomerNumber;
		}
	public void setCustomerNumber(int customerNumber)
	{
		CustomerNumber = customerNumber;
	}
	public Double Price()
	{
		return Price;
	}
	public void setPrice (Double price)
	{
		Price = price;
	}
	public String Status(){
		return Status;
	}
	public void setStatus (String status){
		Status =status;
	}
	public void Display()
	{
		super.Display();
		System.out.println("Houses For Sale");
		System.out.println("________________");
		System.out.println("Customer Reference Number:   " + CustomerNumber());
		System.out.println("House Price:   " + Price ());
		System.out.println("House Status Sold/ Available/Under Offer:   " + Status());
	}
	public HousesForSale(int HouseRef, String HouseLocation, int NumBedrooms, boolean Garage, 
			int CustomerNumber, Double Price, String Status)throws Exception
	{
		super(HouseRef, HouseLocation, NumBedrooms, Garage);
		setCustomerNumber(CustomerNumber);
		setPrice(Price);
		setStatus(Status);
	}
	public HousesForSale()throws Exception
	{
	super();
	CustomerNumber = 12;
	Price = 999.00;
	Status = "Available";
		
		
	}	
	}

