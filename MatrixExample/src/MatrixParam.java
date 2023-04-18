import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MatrixParam {

	private int firstAddition;
	private int secondAddition;
	private int additionEquals;
	private int firstSubtraction;
	private int secondSubtraction;
	private int subtractionEquals;
	private int firstEquals;
	private int secondEquals;
	private int firstNotEquals;
	private int secondNotEquals;
	
	@Test
	public final void testAdd() {
		System.out.println("In Addition Method");
		Matrix obj1 = new Matrix(this.firstAddition);
		Matrix obj2 = new Matrix(this.secondAddition);
		
		Matrix expected = new Matrix(this.additionEquals);
		
		Matrix actual = obj1.Add(obj2);
		
		assertEquals(expected,actual);
	}

	@Test
	public final void testSubtract() {
		System.out.println("In Subtraction Method");
		Matrix obj1 = new Matrix(this.firstSubtraction);
		Matrix obj2 = new Matrix(this.secondSubtraction);
		
		Matrix expected = new Matrix(this.subtractionEquals);
		
		Matrix actual = obj1.Subtract(obj2);
		
		assertEquals(expected,actual);
	}

	@Test
	public final void testEqualsObject() {
		fail("Not yet implemented"); // TODO
		Matrix obj1 = new Matrix(this.firstEquals);
		Matrix obj2 = new Matrix(this.secondEquals);
		
		//Option 1
		//assertEquals(obj1, obj2);
		
		//Option 2
		boolean answer = obj1.equals(obj2);
		assertEquals(answer,true);
	}
	@Test
	public void testNotEqualsObject() {
		
		
		Matrix obj1 = new Matrix(this.firstNotEquals);
		Matrix obj2 = new Matrix(this.secondNotEquals);
		
		//Option 1
		//assertEquals(obj1, obj2);
		
		//Option 2
		boolean answer = obj1.equals(obj2);
		assertEquals(answer,false);
	}

	public MatrixParam(int firstAddition, int secondAddition, int additionEquals, int firstSubtraction,
			int secondSubtraction, int subtractionEquals, int firstEquals,
			int secondEquals, int firstNotEquals, int secondNotEquals) {
		super();
		this.firstAddition = firstAddition;
		this.secondAddition = secondAddition;
		this.additionEquals = additionEquals;
		this.firstSubtraction = firstSubtraction;
		this.secondSubtraction = secondSubtraction;
		this.subtractionEquals = subtractionEquals;
		this.firstEquals = firstEquals;
		this.secondEquals = secondEquals;
		this.firstNotEquals = firstNotEquals;
		this.secondNotEquals = secondNotEquals;
	}
	
	@Parameters
	public static Collection<Object[]> getDate(){
		Object[][] data = new Object[1][10];
		
		data[0][0] = 4;
		data[0][1] = 5;
		data[0][2] = 9;
		data[0][3] = 4;
		data[0][4] = 5;
		data[0][5] = -1;
		data[0][6] = 3;
		data[0][7] = 3;
		data[0][8] = 2;
		data[0][9] = 3;
		

	
		return Arrays.asList(data);
		
	}

}
