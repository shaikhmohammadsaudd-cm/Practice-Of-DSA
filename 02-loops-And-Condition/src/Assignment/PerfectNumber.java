package Assignment;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num <= 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                int sumOfDivisors = 0;

                for (int i = 1; i <= num / 2; i++) {
                    if (num % i == 0) {
                        sumOfDivisors += i;
                    }
                }

                if (sumOfDivisors == num) {
                    System.out.println(num + " is a Perfect Number.");
                } else {
                    System.out.println(num + " is NOT a Perfect Number.");
                }
            }

            sc.close();
        }
    }
