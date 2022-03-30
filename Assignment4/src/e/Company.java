package e;

public class Company implements Runnable {
	public Account account;
	
	public Company(Account account) {
		this.account = account;
	}
	public void run() {
		for (int i = 0; i < 100; i++) {
			account.addAmount(1000);
		}
	}

}
