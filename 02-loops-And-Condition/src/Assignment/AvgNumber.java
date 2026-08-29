package Assignment;
import java.util.Scanner;
public class AvgNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter total number of elements (N): ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("N must be greater than 0.");
            } else {
                double sum = 0;
                System.out.println("Enter " + n + " numbers:");
                for (int i = 1; i <= n; i++) {
                    double num = sc.nextDouble();
                    sum += num;
                }

                double average = sum / n;
                System.out.println("Average: " + average);
            }

            sc.close();
        }

}
