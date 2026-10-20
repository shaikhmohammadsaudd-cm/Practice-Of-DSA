package Assignments;
import java.util.Scanner;
public class DiscountMethods {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter original price of the product: ");
            double price = sc.nextDouble();

            System.out.print("Enter discount percentage: ");
            double discount = sc.nextDouble();

            double finalPrice = calculateFinalPrice(price, discount);

      if (finalPrice == -1) {
                System.out.println("Invalid input! Check price and discount values.");
        } else {
                System.out.println("Final Price after Discount: Rs. " + finalPrice);
            }

            sc.close();
        }
        public static double calculateFinalPrice(double originalPrice, double discountPercentage) {
        if (originalPrice < 0 || discountPercentage < 0 || discountPercentage > 100) {
            return -1; // Return -1 for invalid input
        }

        double discountAmount = (originalPrice * discountPercentage) / 100;
        return originalPrice - discountAmount;
    }
    }

