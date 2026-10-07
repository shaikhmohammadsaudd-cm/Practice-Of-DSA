package Assignments;
import java.util.Scanner;
public class AverageOfNMethod {
    public static double calculateAverage(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
                return 0.0;
            }

            double sum = 0;
        for (double num : numbers) {
                sum += num;
            }

            return sum / numbers.length;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter total number of elements (N): ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("N must be greater than 0.");
            } else {
                double[] arr = new double[n];
                System.out.println("Enter " + n + " numbers:");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextDouble();
                }

                double avg = calculateAverage(arr);
                System.out.println("Average: " + avg);
            }

            sc.close();
        }
    }
