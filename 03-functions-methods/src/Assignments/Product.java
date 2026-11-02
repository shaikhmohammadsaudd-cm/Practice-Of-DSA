package Assignments;

import java.util.Scanner;

public class Product {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a product 1");
        int product1 = sc.nextInt();
        System.out.print("Enter a product 2");
        int product2 = sc.nextInt();
        System.out.print("Enter a product 3");
        int product3 = sc.nextInt();
        product(product1,product2,product3);
    }
    static void product(int product1,int product2,int product3){
        int finalproduct = (product1+product2+product3)/3;
        System.out.println(finalproduct);
    }
}
