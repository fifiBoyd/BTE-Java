package classes;

import java.text.DecimalFormat;

public class CarSale extends Car {

	private int customerReference;
	private double price;
	private String status;

	public int getCustomerReference() {
		return customerReference;
	}

	public void setCustomerReference(int newCustomerReference) {
		customerReference = newCustomerReference;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double newPrice) {
		price = newPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String newStatus) {
		status = newStatus;
	}

	public CarSale() throws Exception {
		super();
		setCustomerReference(99);
		setPrice(9999.50);
		setStatus("dftStatus");
	}

	public CarSale(int newCarCode, String newMake, String newModel, int newNumberOfSeats, int newEngineSize,
			boolean newPetrol, int newCustomerReference, double newPrice, String newStatus) throws Exception {
		super(newCarCode, newMake, newModel, newNumberOfSeats, newEngineSize, newPetrol);
		setCustomerReference(newCustomerReference);
		setPrice(newPrice);
		setStatus(newStatus);
	}

	public void display() {
		super.display();
		System.out.println("Cust Ref        " + getCustomerReference());
		DecimalFormat myFormatter = new DecimalFormat("###,###.##");
		String output = myFormatter.format(getPrice());
		System.out.println("Price           " + output);
		System.out.println("Status          " + getStatus());
	}
}
