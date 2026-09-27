package Assignment;

import java.util.Scanner;

public class PositiveNegative {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        if(num>0){
            System.out.println("Positiv");
        }else if(num <0) {
            System.out.println("Negative");
        }else {
            System.out.println("zero");
        }
    }
}
