package jUnitTestPacckage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddnumbers {

	@Test
	void test() {
		jUnitFunctions junit = new jUnitFunctions();
		int result = junit.AddNumbers(100, 200);
		assertEquals (300, result);
	}

}
