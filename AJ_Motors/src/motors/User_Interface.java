package motors;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import classes.Car;
import classes.CarLease;
import classes.CarSale;

public class User_Interface {

	private static InputStreamReader input = new InputStreamReader(System.in);
	private static BufferedReader reader = new BufferedReader(input);
	private static final int ArraySize = 5;
	private static int intRecordCount = 0;
	private static Car cList[] = new Car[ArraySize];

	public static void main(String[] args) {
		MainMenu();
	}

	private static void MainMenu() {
		// Variables
		int intMenuChoice = 0;

		try {
			do {
				// Display Menu
				System.out.println(" Main Menu ");
				System.out.println("***********");
				System.out.println("1. Enter Rental Car Details");
				System.out.println("2. Enter Cars for Sale Details");
				System.out.println("3. Search Car Details ");
				System.out.println("4. Exit ");
				System.out.print("Enter choice   : ");
				intMenuChoice = Integer.parseInt(reader.readLine());
				if (intMenuChoice == 1) {
					if (intRecordCount < ArraySize) {
						System.out.println("\n\n\n Now accepting Car for Rent Details");
						AcceptLeaseDetails();
					} else {
						System.out.println("\n\n\n Error - no room for additional records");
					}
				} else if (intMenuChoice == 2) {
					if (intRecordCount < ArraySize) {
						System.out.println("\n\n\nNow accepting Cars for Sale Details");
						AcceptSaleDetails();
					} else {
						System.out.println("\n\n\n Error - no room for additional records");
					}
				} else if (intMenuChoice == 3) {
					if (intRecordCount > 0) {
						System.out.println("\n\n\nNow searching for car details");
						CarSearch();
					} else {
						System.out.println("\n\n\n Error - no details stored at present");
					}
				} else if (intMenuChoice == 4) {
					System.out.println("\n\n\nNow exiting");
				} else {
					System.out.println("\n\n\nInvalid menu option");
				}
			} while (intMenuChoice != 4);

		} catch (Exception ex) {
			System.out.println("\n\n\nInvalid menu option");
		}
	}

	private static void AcceptLeaseDetails() {
		int tempCustomerReference;
		int tempCarCode;
		String tempMake;
		String tempModel;
		int tempSeats;
		int tempEngineSize;
		String tempPetrol;
		double tempLeasePerMonth;
		int tempLeaseLength;
		String tempStatus;

		try {
			// Accept the information
			System.out.print("Enter customer reference : ");
			tempCustomerReference = Integer.parseInt(reader.readLine());
			System.out.print("Enter Car Code           : ");
			tempCarCode = Integer.parseInt(reader.readLine());
			System.out.print("Enter make of car        : ");
			tempMake = reader.readLine();
			System.out.print("Enter model of car       : ");
			tempModel = reader.readLine();
			System.out.print("Number of seats          : ");
			tempSeats = Integer.parseInt(reader.readLine());
			System.out.print("Engine Size              : ");
			tempEngineSize = Integer.parseInt(reader.readLine());
			System.out.print("Petrol (Yes / No)        : ");
			tempPetrol = reader.readLine();
			Boolean bPetrol = false;
			if (tempPetrol.toLowerCase().startsWith("y")) {
				bPetrol = true;
			}
			System.out.print("Lease amount per month   : ");
			tempLeasePerMonth = Double.parseDouble(reader.readLine());
			System.out.print("Lease length             : ");
			tempLeaseLength = Integer.parseInt(reader.readLine());
			System.out.print("Status                   : ");
			tempStatus = reader.readLine();
			CarLease c1 = new CarLease(tempCarCode, tempMake, tempModel, tempSeats, tempEngineSize, bPetrol,
					tempCustomerReference, tempLeasePerMonth, tempLeaseLength, tempStatus);

			cList[intRecordCount] = c1;
			intRecordCount++;

			System.out.println("\nInformation saved ");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

	private static void AcceptSaleDetails() {
		int tempCustomerReference;
		int tempCarCode;
		String tempMake;
		String tempModel;
		int tempSeats;
		int tempEngineSize;
		String tempPetrol;
		double tempPrice;
		String tempStatus;

		try {
			System.out.print("Enter customer reference : ");
			tempCustomerReference = Integer.parseInt(reader.readLine());
			System.out.print("Enter Car Code           : ");
			tempCarCode = Integer.parseInt(reader.readLine());
			System.out.print("Enter Make of Car        : ");
			tempMake = reader.readLine();
			System.out.print("Enter Model              : ");
			tempModel = reader.readLine();
			System.out.print("Seats                    : ");
			tempSeats = Integer.parseInt(reader.readLine());
			System.out.print("Engine Size              : ");
			tempEngineSize = Integer.parseInt(reader.readLine());
			System.out.print("Petrol (Yes / No)        : ");
			tempPetrol = reader.readLine();
			Boolean bPetrol = false;
			if (tempPetrol.toLowerCase().startsWith("y")) {
				bPetrol = true;
			}
			System.out.print("Price                    : ");
			tempPrice = Double.parseDouble(reader.readLine());
			System.out.print("Status                   : ");
			tempStatus = reader.readLine();
			CarSale c1 = new CarSale(tempCarCode, tempMake, tempModel, tempSeats, tempEngineSize, bPetrol,
					tempCustomerReference, tempPrice, tempStatus);

			cList[intRecordCount] = c1;
			intRecordCount++;

			System.out.println("\nInformation saved ");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

	private static void CarSearch() {
		int CarSearchID = 0;
		Car data = null;
		try {
			System.out.println("Enter search car code : ");
			CarSearchID = Integer.parseInt(reader.readLine());
			outerfor: for (int intLoopCounter = 0; intLoopCounter < intRecordCount; intLoopCounter++) {
				if (CarSearchID == cList[intLoopCounter].getCarCode()) {
					data = cList[intLoopCounter];
					break outerfor;
				}
			}
			if (data == null) {
				System.out.println("No match found");
			} else {
				data.display();
			}
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
}
