package testing;

import static org.junit.Assert.*;
import org.junit.Test;
import classes.Car;

public class Car_EngineSize_Test {

	@Test
	public void test() {
		try {
			Car c1 = new Car();
			c1.setEngineSize(1200);
			int result = c1.getEngineSize();
			assertEquals(1200, result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
