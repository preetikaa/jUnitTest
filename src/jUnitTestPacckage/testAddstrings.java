package jUnitTestPacckage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddstrings {

	@Test
	void test() {
		jUnitFunctions junitstring = new jUnitFunctions();
		String result = junitstring.AddStrings("hello","world");
		assertEquals("helloworld", result);
	}

}
