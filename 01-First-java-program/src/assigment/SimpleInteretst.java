package assigment;

import java.util.Scanner;

public class SimpleInteretst {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double t = sc.nextDouble();
        double r = sc.nextDouble();
        double si = (p*t*r)/100;
        System.out.println("Simple interest"+ si);



    }
}
