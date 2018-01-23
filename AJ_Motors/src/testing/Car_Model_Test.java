package testing;

import static org.junit.Assert.*;
import org.junit.Test;
import classes.Car;

public class Car_Model_Test {

	@Test
	public void test() {
		try {
			Car c1 = new Car();
			c1.setModel("Focus");
			String result = c1.getModel();
			assertEquals("objects should be identical", "Focus", result);
			System.out.println("Car Model Test passed");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
}
