package MathsDSA;

public class DigitsOfNumber {
    static void main(String[] args) {
        int n = 3586;
        print(n);
    }

    static void print(int n) {
        if (n != 0) {
            for (int i = 0; i <= n; i++) {
                int digit = n % 10;
                n = n / 10;
                System.out.println(digit);
            }
        }
    }
}
