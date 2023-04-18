import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class BankAccountTestParam {

	
	private double initialBalance;
	private int initialAccNo;
	private int interest;
	private double lodgement;
	private double balanceAfterLodgement;
	private double withdrawl;
	private double balanceAfterWithdrawl;
	private double balanceAferInterest;
	
	@Test
	public final void testMakeLodgement() {
		System.out.println("In MakeLodgement");
		
		BankAccount acc = new BankAccount(this.initialBalance,this.initialAccNo, this.interest);
		
		acc.makeLodgement((float)this.lodgement);
		
		double expected = this.balanceAfterLodgement;
		double actual = acc.getBalance();
		
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public final void testMakeWithdrawal() {
		System.out.println("In MakeWithdrawl");
		
		BankAccount acc = new BankAccount(this.initialBalance, this.initialAccNo, this.interest);
		
		acc.makeWithdrawal((float)this.withdrawl);
		
		double expectedBalance = this.balanceAfterWithdrawl;
		double actual = acc.getBalance();
		
		assertEquals(expectedBalance, actual, 0.0); 
	}

	@Test
	public final void testGetBalance() {
		System.out.println("In GetBalance");
		
		BankAccount acc = new BankAccount(this.initialBalance, this.initialAccNo, this.interest);
		
		double expectedBalance = this.initialBalance;
		double actual = acc.getBalance();
		
		assertEquals(expectedBalance, actual, 0.0);
		
	}

	@Test
	public final void testAddInterest() {
		System.out.println("In AddInterest");
		
		BankAccount acc = new BankAccount(this.initialBalance, this.initialAccNo, this.interest);
		
		acc.addInterest();
		
		double expected =this.balanceAferInterest;
		
		double actual = acc.getBalance();
		
		assertEquals(expected, actual, 0.0);
	}

	public BankAccountTestParam(double initialBalance, int initialAccNo, int interest, double lodgement,
			double balanceAfterLodgement, double withdrawl, double balanceAfterWithdrawl, double balanceAferInterest) {
		super();
		this.initialBalance = initialBalance;
		this.initialAccNo = initialAccNo;
		this.interest = interest;
		this.lodgement = lodgement;
		this.balanceAfterLodgement = balanceAfterLodgement;
		this.withdrawl = withdrawl;
		this.balanceAfterWithdrawl = balanceAfterWithdrawl;
		this.balanceAferInterest = balanceAferInterest;
		
		System.out.println("In Constructor " + initialAccNo);
	}
	@Parameters
	public static Collection<Object[]> getDate(){
		Object[][] data = new Object[3][8];
		
		data[0][0] = 100;
		data[0][1] = 123;
		data[0][2] = 2;
		data[0][3] = 120;
		data[0][4] = 220;
		data[0][5] = 20;
		data[0][6] = 80;
		data[0][7] = 102;
		

		data[1][0] = 200;
		data[1][1] = 456;
		data[1][2] = 2;
		data[1][3] = 120;
		data[1][4] = 320;
		data[1][5] = 20;
		data[1][6] = 180;
		data[1][7] = 204;
		

		data[2][0] = 200;
		data[2][1] = 789;
		data[2][2] = 2;
		data[2][3] = 120;
		data[2][4] = 320;
		data[2][5] = 20;
		data[2][6] = 180;
		data[2][7] = 204;
		
		return Arrays.asList(data);
		
	}

}
