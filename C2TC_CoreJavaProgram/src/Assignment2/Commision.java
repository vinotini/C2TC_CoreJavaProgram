package Assignment2;

import java.util.Scanner;

public class Commision {

	String name;
    String address;
    String phone;
    double salesAmount;

    // Method to accept details of the sales employee
    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Phone: ");
        phone = sc.nextLine();

        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextDouble();
    }

    
    public void calculateCommision() {
        double commision;

        if (salesAmount >= 100000) {
            commision = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commision = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commision = salesAmount * 0.03;
        } else {
            commision = 0;
        }

        System.out.println("Commision for " + name + " is: ₹" + commision);
    }


}