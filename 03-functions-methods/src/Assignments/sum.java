package Assignments;

import java.util.Scanner;

public class sum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1:");
        int num1 = sc.nextInt();
        System.out.println("Enter a number 2:");
        int num2 = sc.nextInt();
        sum(num1,num2);
    }
    static void sum(int num1,int num2){
        int sum = num1 + num2;
        System.out.println(sum);
    }
}
