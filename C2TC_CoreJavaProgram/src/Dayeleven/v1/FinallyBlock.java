package Dayeleven.v1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter the number : ");
			int number = scanner.nextInt();
			System.out.println(number+number % 2 == 0 ? " is Even" : " is Odd");
			return;
		} catch (InputMismatchException e) {
			System.err.println("Invalid input...");

		} finally {
			System.out.println("In Finally....");
			scanner.close(); 
		}
	}
}