import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	int a;
	int b;
	@Test
	public void testAdd() {
		//Arrange
		a = 4321;
		b = 1234;
		Calculator cal = new Calculator();
				
		//Act
		int actual = cal.add(a, b);
		
		//Assert
		int expected = 5555;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testSubtract() {
		//Arrange
		a = 4321;
		b = 1234;
		Calculator cal = new Calculator();
				
		//Act
		int actual = cal.subtract(a, b);
		
		//Assert
		int expected = 3087;
		assertEquals (expected, actual);
	}
	
	
	@Test
	public void testMultiply() {
		//Arrange
		a = 4;
		b = 4;
		Calculator cal = new Calculator();
				
		//Act
		int actual = cal.multiply(a, b);
		
		//Assert
		int expected = 16;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivide() {
		//Arrange
		a = 4;
		b = 4;
		Calculator cal = new Calculator();
				
		//Act
		int actual = cal.divide(a, b);
		
		//Assert
		int expected = 1;
		assertEquals (expected, actual);
	}

}
