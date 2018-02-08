package Classes;

public class Customer {
	
	//declare the variables for the customer
	public int CustomerNumber;
	public String CustomerFirstName;
	public String CustomerSurname;
	public String Address;
	public String PhoneNumber;
	public String Email;
	public String Fax;
	
	//getting the Customers details
		public int getCustomerNumber()
		{
		return CustomerNumber;
		}
		
		//ensures Customer Number within range or prints out of range
		public void setCustomerNumber(int customernumber)throws Exception{
			if (customernumber < 100 || customernumber >999)
			{
				Exception ex = new Exception (" Customer Number out of Range");
				throw ex;
			}
			else
			{
				CustomerNumber = customernumber;
			}
		}// constructor to get customer details
			public String getCustomerFirstName()
			{
			return CustomerFirstName;
			}	
		public void setCustomerFirstName(String customerfirstname)
		{
		
			CustomerFirstName = customerfirstname;
			}
		public String getCustomerSurname()
		{
		return CustomerSurname;
		}	
	public void setCustomerSurname(String customersurname)
	{
	
		CustomerSurname = customersurname;
		}
	public String getAddress()
	{
	return Address;
	}	
public void setAddress(String address)
{

	Address = address;
	}
public String getPhoneNumber()
{
return PhoneNumber;
}	
public void setPhoneNumber(String phonenumber)
{

PhoneNumber = phonenumber;
}
public String getEmail()
{
return Email;
}	
public void setEmail(String email)
{

Email = email;
}
public String getFax()
{
return Fax;
}	
public void setFax(String fax)
{

Fax = fax;
}
		

// Display the Details of the Customer entered 
public void Display()
{
System.out.println("Customer details");
System.out.println("________________");
System.out.println("Customer Reference Number:   " + getCustomerNumber());
System.out.println("Customer name:    " + getCustomerFirstName()+ getCustomerSurname());
System.out.println("Address:   " + getAddress());
System.out.println("Customer Phone Number:     " + getPhoneNumber());
System.out.println("Customer Email:     " + getEmail());
System.out.println("Customer Fax:     " + getFax());

}

public Customer (int CustomerNumber, String CustomerFirstname, String CustomerSurname, String Address, String Phone, 
		String Email, String Fax)throws Exception{

setCustomerNumber(CustomerNumber);
setCustomerFirstName(CustomerFirstname);
setCustomerSurname(CustomerSurname);
setAddress(Address);
setPhoneNumber(PhoneNumber);
setEmail(Email);
setFax(Fax);

}
public Customer()throws Exception
{
setCustomerNumber(999);
setCustomerFirstName("fname");
setCustomerSurname("sname");
setAddress("home");
setPhoneNumber("22");
setEmail("ss@hotmail.com");
setFax("33");


}
}
	


