import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class MatrixTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		
		Matrix obj1 = new Matrix(4);
		Matrix obj2 = new Matrix(5);
		
		Matrix expected = new Matrix(9);
		
		Matrix actual = obj1.Add(obj2);
		
		assertEquals(expected,actual);
		
	}

	@Test
	public void testSubtract() {
		Matrix obj1 = new Matrix(4);
		Matrix obj2 = new Matrix(5);
		
		Matrix expected = new Matrix(-1);
		
		Matrix actual = obj1.Subtract(obj2);
		
		assertEquals(expected,actual);
	}

	@Test
	public void testEqualsObject() {
		
		
		Matrix obj1 = new Matrix(3);
		Matrix obj2 = new Matrix(3);
		
		//Option 1
		//assertEquals(obj1, obj2);
		
		//Option 2
		boolean answer = obj1.equals(obj2);
		assertEquals(answer,true);
	}
	
	@Test
	public void testNotEqualsObject() {
		
		
		Matrix obj1 = new Matrix(2);
		Matrix obj2 = new Matrix(3);
		
		//Option 1
		//assertEquals(obj1, obj2);
		
		//Option 2
		boolean answer = obj1.equals(obj2);
		assertEquals(answer,false);
	}

}