package Assignment;

import java.util.Scanner;

public class StringPalindrome {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String rev = "";
        for (int i=0;i<str.length();i++){
            rev += str.charAt(i);
        }
        if (str.equalsIgnoreCase(rev)){
            System.out.println("palindrome");
        }else {
            System.out.println("NOT palindrome");
        }
    }
}
