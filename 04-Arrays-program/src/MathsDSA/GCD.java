package MathsDSA;
public class GCD {
    public static void main(String[] args) {
        int a = 20;
        int b = 28;

        gcd(a, b);
    }

    static void gcd(int a, int b) {
        for (int i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
