package Assignment;

import java.util.Scanner;

public class Leapyear {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();

        if((year%400==0) || (year%4==0 && year%100!=0)){
            System.out.println(year+"is a leap Year.");

        }else {
            System.out.println(year+"is Not a leap Year");
        }
    }

}
