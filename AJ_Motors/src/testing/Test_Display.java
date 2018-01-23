package testing;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.Car;

public class Test_Display {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void cleanUpStreams() {
		System.setOut(null);
		System.setErr(null);
	}

	@Test
	public void out() {
		try {
			Car c1 = new Car(101, "Ford", "Ka", 4, 1100, true);
			String expectedOutput = "Car Details" + System.getProperty("line.separator") + "*************"
					+ System.getProperty("line.separator") + "Car Code        " + "101"
					+ System.getProperty("line.separator") + "Make            " + "Ford"
					+ System.getProperty("line.separator") + "Model           " + "Ka"
					+ System.getProperty("line.separator") + "Number of Seats " + "4"
					+ System.getProperty("line.separator") + "Engine Size     " + "1100"
					+ System.getProperty("line.separator") + "Fuel Type       " + "Petrol"
					+ System.getProperty("line.separator");
			c1.display();
			assertEquals(expectedOutput, outContent.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
