import static org.junit.Assert.*;

import org.junit.Test;

public class OddNumberCheckTests {

	
	@Test
	public final void testValidateOdd() {
		OddNumberCheck test1 = new OddNumberCheck();
		
		
		boolean result = test1.validate(3);
		
		boolean odd = true;
		assertEquals(result, odd);
	}
	
	@Test
	public final void testValidateEven() {
		OddNumberCheck test1 = new OddNumberCheck();
		
		boolean result = test1.validate(4);
		boolean odd = false;
		assertEquals(result, odd);
	}

}
