package junit_testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Addtest.class, Junit_concat_test.class })
public class AllTests {
/*
 * to make a test suite (to have a few test cases, and combine them in a suite)
 * write click on the project, then new , then other, then Java, then JUnit and the 
 * JUnit Test Suite
 */
}
