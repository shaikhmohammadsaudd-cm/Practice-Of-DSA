package Assignment;
import java.util.Scanner;

public class CalcDiscount {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter original price of the product: ");
            double originalPrice = sc.nextDouble();

            System.out.print("Enter discount percentage: ");
            double discountPercentage = sc.nextDouble();

            if (originalPrice < 0 || discountPercentage < 0 || discountPercentage > 100) {
                System.out.println("Invalid input! Price and discount must be positive, and discount cannot exceed 100%.");
            } else {
                double discountAmount = (originalPrice * discountPercentage) / 100;
                double finalPrice = originalPrice - discountAmount;

                System.out.println("Discount Amount: Rs. " + discountAmount);
                System.out.println("Final Price after Discount: Rs. " + finalPrice);
            }

            sc.close();
        }
    }
