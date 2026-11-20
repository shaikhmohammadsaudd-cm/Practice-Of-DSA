package MathsDSA;

public class Palindrome {
    static void main(String[] args) {
        int n = 121;
        palindromic(n);
    }
    static void palindromic(int n){
        int rev = 0;
        int pali = n;
        while (n != 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        if (rev==pali){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

    }
}
