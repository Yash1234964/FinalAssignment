package pr.project.Main;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter an integer: ");
	            int num = scanner.nextInt();

	            if (num < 0) {
	                throw new IllegalArgumentException("Number cannot be negative");
	            }

	            System.out.println("Entered number: " + num);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Exception: " + e.getMessage());
	        }

	}

}
