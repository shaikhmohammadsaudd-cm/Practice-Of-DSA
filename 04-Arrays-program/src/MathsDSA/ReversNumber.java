package MathsDSA;

public class ReversNumber {
    static void main(String[] args) {
        int n = 123;
        System.out.println(revers(n));
    }
    static int revers(int n){
        int rev = 0;
        while (n != 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }
}
