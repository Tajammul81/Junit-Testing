package junit_testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class Junit_concat_test {

	@Test
	public void test() {
		Junit_testing Junit= new Junit_testing();
		String result= Junit.concat("Syed", " Tajammul");
		assertEquals("Syed Tajammul", result);// first argument is the result you expect, and second is the actual result.
	}

}
