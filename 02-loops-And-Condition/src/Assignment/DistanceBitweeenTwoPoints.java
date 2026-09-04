package Assignment;
import java.util.Scanner;
public class DistanceBitweeenTwoPoints {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter x1 and y1: ");
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();

            System.out.print("Enter x2 and y2: ");
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();

            // Formula: sqrt((x2 - x1)^2 + (y2 - y1)^2)
            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            System.out.println("Distance between points: " + distance);

            sc.close();
        }
    }
