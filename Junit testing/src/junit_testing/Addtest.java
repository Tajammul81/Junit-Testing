package junit_testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class Addtest {

	@Test
	public void test() {
		// creating an object of the class for which method needs to be tested.
		Junit_testing junit= new Junit_testing();
		int result= junit.add(23, 2);
		assertEquals(25, result);
		/*
		 * it order to run the test case, right click on the junit class, then Debug As 
		 * choose JUnit Test
		 */
	}

}
