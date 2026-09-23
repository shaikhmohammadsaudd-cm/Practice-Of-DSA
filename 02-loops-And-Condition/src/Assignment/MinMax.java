package Assignment;

import java.util.Scanner;

public class MinMax {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        find(n);
    }
    static  void find(int n){
       if (n>0){
           System.out.println("Positive");
       }else if (n<0){
           System.out.println("Negtive");
       }else {
           System.out.println("Zero");
       }
    }
}
