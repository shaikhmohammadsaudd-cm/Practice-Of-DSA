package Assignments;

import java.util.Scanner;

public class CheckAge {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a age");
        int age = sc.nextInt();
        find(age);
    }
    static void find(int age){
        if(age>=18){
            System.out.println("He/She is Eligible for vote");
        }else {
            System.out.println("He/She is NOT Eligible for vote");
        }
    }
}
