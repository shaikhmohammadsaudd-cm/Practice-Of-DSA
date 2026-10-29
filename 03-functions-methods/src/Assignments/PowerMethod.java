package Assignments;
import java.util.Scanner;
public class PowerMethod {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter base: ");
            int base = sc.nextInt();

            System.out.print("Enter exponent: ");
            int exponent = sc.nextInt();

            if (exponent < 0) {
                System.out.println("Please enter a non-negative exponent.");
            } else {
                long ans = calculatePower(base, exponent);
                System.out.println(base + "^" + exponent + " = " + ans);
            }

            sc.close();
        }
        public static long calculatePower(int base, int exponent){
    long result = 1;
    for (int i = 1; i <= exponent; i++) {
        result *= base;
    }
    return result;
        }
}
