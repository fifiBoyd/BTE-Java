package testing;

import static org.junit.Assert.*;
import org.junit.Test;
import classes.Car;

public class Car_FuelType_Test {

	@Test
	public void test1() {
		try {
			Car c1 = new Car();
			c1.setPetrol(true);
			String result = c1.getPetrol();
			assertEquals("Petrol", result);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	@Test
	public void test2() {
		try {
			Car c1 = new Car();
			c1.setPetrol("Yes");
			String result = c1.getPetrol();
			assertEquals("Petrol", result);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	@Test
	public void test3() {
		try {
			Car c1 = new Car();
			c1.setPetrol("No");
			String result = c1.getPetrol();
			assertEquals("Diesel", result);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
}
