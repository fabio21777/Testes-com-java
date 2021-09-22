package entities;

public class Account {
	private Long id;
	private Double balance;
	public static double DEPOSIT_FEE_PERCENTAGE = 0.02;
	

	public Account(Long id, Double balance) {
		this.id = id;
		this.balance = balance;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(Double amount) {
		if (amount > 0) {
			amount -= amount * DEPOSIT_FEE_PERCENTAGE;
			balance+=amount;
		}
		
	}
	
	public void withDraw(Double amount) {
		if (amount > balance) {
			throw new IllegalArgumentException();
		}
		balance-= amount;
		
	}
	public Double fullWithDraw() {
		Double withDraw = balance;
		balance = 0.00;
		return withDraw;
	}


}
