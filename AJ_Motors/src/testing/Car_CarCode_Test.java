package testing;

import static org.junit.Assert.*;
import org.junit.Test;
import classes.Car;

public class Car_CarCode_Test {

	@Test
	public void test1() {
		try {
			Car c1 = new Car();
			c1.setCarCode(100);
			int result = c1.getCarCode();
			assertEquals(100, result);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

	@Test
	public void test2() {
		try {
			Car c1 = new Car(101, "Ford", "Ka", 4, 1100, true);
			int result = c1.getCarCode();
			assertEquals(101, result);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

	@Test

	public void test3() {
		try {
			Car c2 = new Car();
			c2.setCarCode(99);
			fail("Should throw exception if out of range");
		} catch (Exception ex) {
		}
	}
}
