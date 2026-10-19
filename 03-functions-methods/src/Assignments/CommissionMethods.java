package Assignments;
import java.util.Scanner;
public class CommissionMethods {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total sales amount: ");
        double sales = sc.nextDouble();

        System.out.print("Enter total commission earned: ");
        double commission = sc.nextDouble();

        double percentage = calculateCommissionPercentage(sales, commission);

        if (percentage == -1) {
            System.out.println("Invalid input! Sales amount must be greater than zero.");
        } else {
            System.out.println("Commission Percentage: " + percentage + "%");
        }

        sc.close();
    }
    static double calculateCommissionPercentage(double salesAmount, double commissionAmount) {
        if (salesAmount <= 0 || commissionAmount < 0) {
            return -1; // Return -1 for invalid input
        }
        return (commissionAmount / salesAmount) * 100;
    }
}