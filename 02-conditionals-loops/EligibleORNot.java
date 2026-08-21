package Assignment;

import java.util.Scanner;

public class EligibleORNot {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("The Person is Eligible");
        }else {
            System.out.println("The Person is NotEligible");
        }
    }
}
