package Assignment;

import java.util.Scanner;

public class CurrencyConvert {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            double inr = sc.nextDouble();
            double usd = inr / 83.0; //Assume 1 USD = 83 INR

        System.out.println("USD"+usd);
    }
}
