package jUnitTestPacckage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	testAddnumbers.class, testAddstrings.class
})
public class AllTests {

}
