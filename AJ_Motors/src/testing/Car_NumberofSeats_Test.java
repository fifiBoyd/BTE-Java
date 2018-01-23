package testing;

import static org.junit.Assert.*;
import org.junit.Test;
import classes.Car;

public class Car_NumberofSeats_Test {

	@Test
	public void test() {
		try {
			Car c1 = new Car();
			c1.setNumberofSeats(4);
			int result = c1.getNumberofSeats();
			assertEquals(4, result);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
}
