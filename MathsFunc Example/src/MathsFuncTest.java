import static org.junit.Assert.*;

import org.junit.Test;

public class MathsFuncTest {

	@Test
	public final void testDivide() {
		MathsFunc testObj = new MathsFunc(2,5);
		
		float actual = testObj.divide();
		
		float expected = 0.4f;
		
		assertEquals(actual, expected, 0.0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public final void testDivideException() {
		MathsFunc testObj = new MathsFunc(2,0);
		testObj.divide();
	//	System.out.println(result);
	}

	@Test
	public final void testSquare_root() {
		MathsFunc testObj = new MathsFunc(4,5);
		float result = testObj.square_root();
		float expected = 2;
		
		assertEquals(result, expected, 0.0);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public final void testSquare_rootException() {
		MathsFunc testObj = new MathsFunc(-4,5);
		testObj.square_root();
	}

}
