package Calculator.Eg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	Calculator cl; // Initialize the object
	
	
	@BeforeAll
	static void beforeAll() { 
		System.out.println("Before All : test case "); // should be executed before all tests in the current test class. 
		
	}
	@AfterAll
	static void afterAll() {
		System.out.println("After All : test case");  //should be executed after all tests in the current test class. 
	}

	@BeforeEach
	void cleanup() {
		 cl = new Calculator();
	} 
	
	
	@AfterEach
	void cleanUp()
	{
		cl=null; //null referencing
		System.out.println("Clean up....");
	}
	
	@Test
	@DisplayName("Testing Addition")  // display names of test case
	void testAddition() {
		assertEquals(10, cl.add(5, 5));   // using asset equals to get value
	}
	
	@Test
	@DisplayName("Testing Subraction") 
	void testSubraction() {
		assertEquals(10, cl.subtract(30, 20));  
	}
	
	@Test
	@DisplayName("Testing Multiplication")  
	void testMultiplication() {
		assertEquals(64,cl.multiply(8, 8));
	}
	
	@Test
	@DisplayName("Testing Division")  
	void testDivision() {
		assertEquals(5, cl.divide(25, 5));
		
	}
	
}
