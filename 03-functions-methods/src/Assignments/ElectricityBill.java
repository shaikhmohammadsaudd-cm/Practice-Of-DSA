package Assignments;

import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();
        double totalBill = calculateBill(units);
        if (totalBill == -1) {
            System.out.println("Invalid input! Units cannot be negative.");
        } else {
            System.out.println("Total Electricity Bill: Rs. " + totalBill);
            }

            sc.close();
        }
        public static double calculateBill(int units) {
        if (units < 0) {
            return -1; // Return -1 for invalid negative units
            }

           double bill = 0;
        if (units <= 100) {
            bill = units * 5.0;
        } else if (units <= 200) {
               bill = (100 * 5.0) + ((units - 100) * 7.0);
        } else if (units <= 300) {
                bill = (100 * 5.0) + (100 * 7.0) + ((units - 200) * 10.0);} else {
            bill = (100 * 5.0) + (100 * 7.0) + (100 * 10.0) + ((units - 300) * 12.0);
        }

        return bill;
        }
}

