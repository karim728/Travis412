package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	
	@Test
	public void testSusbstraction() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.substraction(5, 3), 2);
	}
}
