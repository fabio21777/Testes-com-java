package teste.entites.factory;

import entities.Account;

public class AccountFactory {
	public static Account createEmptyAccount() {
		return new Account(1L, 0.00);
	}
	
	public static Account createAccount(Double initialDoubleBalance) {
		return new  Account(1L, initialDoubleBalance);
	}
}
