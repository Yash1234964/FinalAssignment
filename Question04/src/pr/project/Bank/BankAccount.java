package pr.project.Bank;

public class BankAccount {
	
	 private String accountNumber;
	    private double balance;

	    public BankAccount(String accountNumber) {
	        this.accountNumber = accountNumber;
	        this.balance = 0.0;
	    }

	    public String getAccountNumber() {
	        return accountNumber;
	    }

	    public double getBalance() {
	        return balance;
	    }
	    
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit successful. New balance: " + balance);
	        } else {
	            System.out.println("Invalid amount. Deposit failed.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal successful. New balance: " + balance);
	        } else {
	            System.out.println("Invalid amount or insufficient balance. Withdrawal failed.");
	        }
	    }

}
