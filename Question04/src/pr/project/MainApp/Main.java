package pr.project.MainApp;

import java.util.Scanner;

import pr.project.Bank.BankAccount;

public class Main {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Create a bank account
	        BankAccount account = new BankAccount("123456789");

	        // Menu loop
	        boolean exit = false;
	        while (!exit) {
	            System.out.println("\nBank Account Menu:");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            
	            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("Current balance: " + account.getBalance());
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

}
