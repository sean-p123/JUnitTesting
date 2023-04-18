import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	

	@Test
	public final void testMakeLodgement() {
	
		BankAccount acc = new BankAccount(200.0, 123, 5);
		
		acc.makeLodgement(100);
		
		double expected = 300.0;
		double actual = acc.getBalance();
		
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public final void testMakeWithdrawal() {
		BankAccount acc = new BankAccount(200.0,123, 5);
		
		acc.makeWithdrawal(50);
		
		double expectedBalance = 150.0;
		double actual = acc.getBalance();
		
		assertEquals(expectedBalance, actual, 0.0); 
		
		
	}

	@Test
	public final void testGetBalance() {
		BankAccount acc = new BankAccount(200.0, 123, 5);
		
		double expectedBalance = 200.0;
		double actual = acc.getBalance();
		
		assertEquals(expectedBalance, actual, 0.0);
		
	}

	@Test
	public final void testAddInterest() {
		BankAccount acc = new BankAccount(200.0, 123, 5);
		
		acc.addInterest();
		
		double expected =210.0;
		double actual = acc.getBalance();
		
		assertEquals(expected, actual, 0.0);
	}

}
