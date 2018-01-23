package testing;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import classes.Car;

public class Car_All_Methods {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void cleanUpStreams() {
		System.setOut(null);
	}

	@Test
	// default constructor No parameters
	public void test1() {
		try {
			Car c1 = new Car();
			int code = c1.getCarCode();
			String make = c1.getMake();
			String model = c1.getModel();
			int seats = c1.getNumberofSeats();
			String petrol = c1.getPetrol();
			assertEquals(999, code);
			assertEquals("dftmake", make);
			assertEquals("dftmodel", model);
			assertEquals(3, seats);
			assertEquals("Diesel", petrol);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

	@Test
	// Constructor with variables
	public void test2() {
		try {
			Car c1 = new Car(101, "Ford", "Ka", 4, 1100, true);
			int code = c1.getCarCode();
			String make = c1.getMake();
			String model = c1.getModel();
			int seats = c1.getNumberofSeats();
			String petrol = c1.getPetrol();
			assertEquals(101, code);
			assertEquals("Ford", make);
			assertEquals("Ka", model);
			assertEquals(4, seats);
			assertEquals("Petrol", petrol);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

	@Test
	// Test all setter methods
	public void test3() {
		try {
			Car c1 = new Car();
			c1.setCarCode(101);
			int code = c1.getCarCode();
			c1.setMake("Ford");
			String make = c1.getMake();
			c1.setModel("Ka");
			String model = c1.getModel();
			c1.setNumberofSeats(4);
			int seats = c1.getNumberofSeats();
			c1.setPetrol(true);
			String petrol = c1.getPetrol();
			assertEquals(101, code);
			assertEquals("Ford", make);
			assertEquals("Ka", model);
			assertEquals(4, seats);
			assertEquals("Petrol", petrol);
			c1.display();
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

	@Test
	// Test range for car code
	public void test4() {
		try {
			Car c1 = new Car();
			c1.setCarCode(99);
			fail("Should throw exception if out of range");
			c1.setCarCode(1000);
			fail("Should throw exception if out of range");
		} catch (Exception ex) {
		}
	}

	@Test
	public void test5() {
		try {
			Car c1 = new Car(101, "Ford", "Ka", 4, 1100, false);
			String expectedOutput = "Car Details" + System.getProperty("line.separator") + "*************"
					+ System.getProperty("line.separator") + "Car Code        " + "101"
					+ System.getProperty("line.separator") + "Make            " + "Ford"
					+ System.getProperty("line.separator") + "Model           " + "Ka"
					+ System.getProperty("line.separator") + "Number of Seats " + "4"
					+ System.getProperty("line.separator") + "Engine Size     " + "1100"
					+ System.getProperty("line.separator") + "Fuel Type       " + "Diesel"
					+ System.getProperty("line.separator");
			c1.display();
			assertEquals(expectedOutput, outContent.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
