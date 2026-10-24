package Assignments;

import java.util.Scanner;

public class Factorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = sc.nextInt();
        factorial(num);
    }
    static void factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;

        }
        System.out.println(fact);
       // return fact;
    }
}
