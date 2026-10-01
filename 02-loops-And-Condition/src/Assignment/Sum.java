package Assignment;

import java.util.Scanner;

public class Sum {
    static void main(String[] args) {
        int result = addNumber(10,20);
        System.out.println("Sum is :"+result);

        printMassage("Mohammad");
    }
    static int addNumber(int a, int b){
        int sum = a + b;
        return sum;
    }
    static void printMassage(String name){
        System.out.println("Hello "+name+"welcome to my life ");
    }
}
