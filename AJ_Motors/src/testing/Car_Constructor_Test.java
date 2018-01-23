package testing;

import static org.junit.Assert.*;
import org.junit.Test;
import classes.Car;

public class Car_Constructor_Test {

	@Test
	public void test1() {
		try {
			Car c1 = new Car(101, "Ford", "Focus", 4, 1300, true);
			int result = c1.getCarCode();
			assertEquals(101, result);
			
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

	@Test
	//Test the no-argument constructor
	public void test2() {
		try {
			Car c1 = new Car();
			String result = c1.getMake();
			assertEquals("dftmake", result);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
}
