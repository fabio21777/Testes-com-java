package teste.entites;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;
import teste.entites.factory.AccountFactory;

public class AccountTest {
	@Test
	public void depositShouldIncreaseBalanceWhenPositiveAmount() {
		Double amount = 200.00;
		Double expectedValue = 196.00;
		Account account = AccountFactory.createEmptyAccount();
		account.deposit(amount);
		Assertions.assertEquals(expectedValue, account.getBalance());
	}
	@Test
	public void depositShouldDonothingWhenNegativeAmount() {
		Double expectedValue = 100.00;
		Account account = AccountFactory.createAccount(expectedValue);
		Double amount = -200.00;
		account.deposit(amount);
		Assertions.assertEquals(expectedValue, account.getBalance());
		
	}
	@Test
	public void fullWithDrawShouldClearBalanceAndReturnFullBalance() {
		double expectedValue = 0.00;
		Double initialBalance = 800.00;
		
		Account account = AccountFactory.createAccount(initialBalance);
		Double result =  account.fullWithDraw();
		
		Assertions.assertEquals(expectedValue, account.getBalance());
		Assertions.assertTrue(expectedValue ==  account.getBalance());
		Assertions.assertTrue(result == initialBalance);
 	}
	
}
