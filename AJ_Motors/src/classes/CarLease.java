package classes;

public class CarLease extends Car {
	private int customerReference;
	private double leasePerMonth;
	private int leaseLength;
	private String status;

	public int getCustomerReference() {
		return customerReference;
	}

	public void setCustomerReference(int newCustomerReference) {
		customerReference = newCustomerReference;
	}

	public double getLeasePerMonth() {
		return leasePerMonth;
	}

	public void setLeasePerMonth(double newLeasePerMonth) {
		leasePerMonth = newLeasePerMonth;
	}

	public int getLeaseLength() {
		return leaseLength;
	}

	public void setLeaseLength(int newLeaseLength) {
		leaseLength = newLeaseLength;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String newStatus) {
		status = newStatus;
	}

	public CarLease(int newCarCode, String newMake, String newModel, int newNumberOfSeats, int newEngineSize,
			boolean newPetrol, int newCustomerReference, double newLeasePerMonth, int newLeaseLength, String newStatus)
			throws Exception {
		super(newCarCode, newMake, newModel, newNumberOfSeats, newEngineSize, newPetrol);
		setCustomerReference(newCustomerReference);
		setLeasePerMonth(newLeasePerMonth);
		setLeaseLength(newLeaseLength);
		setStatus(newStatus);
	}

	public CarLease() throws Exception {
		super();
		setCustomerReference(99);
		setLeasePerMonth(99);
		setLeaseLength(99);
		setStatus("dftStatus");
	}

	public void display() {
		super.display();
		System.out.println("Cust Ref        " + getCustomerReference());
		System.out.println("Lease amount    " + getLeasePerMonth());
		System.out.println("Lease length    " + getLeaseLength());
		System.out.println("Status          " + getStatus());
	}
}
