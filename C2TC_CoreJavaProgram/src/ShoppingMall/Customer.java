package ShoppingMall;

import java.util.Scanner;

public class Customer {
	    public static void main(String[] args) {
	        
	    	Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to Dmart!");
	        System.out.println("Choose your shopping area:");
	        System.out.println("1. Foodcourt");
	        System.out.println("2. Trends");

	        int choice = scanner.nextInt();
	        DMART dmart;

	        switch (choice) {
	            case 1:
	                dmart = new Foodcourt();
	                break;
	            case 2:
	                dmart = new Trends();
	                break;
	            default:
	                System.out.println("Invalid choice. Please try again.");
	                return;
	        }

	        dmart.shopping();
	        
	    }
}