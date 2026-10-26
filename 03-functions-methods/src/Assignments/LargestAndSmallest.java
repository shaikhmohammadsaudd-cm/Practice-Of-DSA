package Assignments;

import java.util.Scanner;

public class LargestAndSmallest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first Number :");
        int first = sc.nextInt();
        System.out.print("Enter a second Number :");
        int second = sc.nextInt();
        FindNumber(first,second);
    }
    static void FindNumber(int first,int second){


        if(first>second){
            System.out.println("First is larget");
        } else if (second>first) {
            System.out.println("second is largest");
        } else {
            System.out.println("Not a number");
        }
    }
}
