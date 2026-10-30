package Assignments;

import java.util.Scanner;

public class PrimeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        prime(number);
    }
    static void prime(int number){
        if(number%2!=0 && number %number==0){
            System.out.println("Prime Number");
        }else {
            System.out.println("NOT Prime");
        }
    }
}
