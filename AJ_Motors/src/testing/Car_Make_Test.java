package testing;

import static org.junit.Assert.*;
import org.junit.Test;
import classes.Car;

public class Car_Make_Test {

	@Test
	public void test() {
		try {
			Car c1 = new Car();
			c1.setMake("Ford");
			String result = c1.getMake();
			assertEquals("Ford", result);
			System.out.println("Car Make passed");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
}
