package Assignment;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        char op = sc.next().charAt(0);

        if (op=='=') System.out.println(num1+num2);
        else if (op=='-') System.out.println(num1-num1);
        else if (op=='*') System.out.println(num1*num2);
        else if (op=='/'){
            if (num1!=0) System.out.println(num1/num2);
            else System.out.println("canot divide by zero");
        }else {
            System.out.println("invalid operator");
        }
    }
}
