package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Car_CarCode_Test.class, Car_Constructor_Test.class, Car_EngineSize_Test.class,
		Car_FuelType_Test.class, Car_Make_Test.class, Car_Model_Test.class, Car_NumberofSeats_Test.class })
public class AllTests {

}
