package MathsDSA;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        System.out.println(number(n));
    }

    static boolean number(int n) {
        int copySum = n;
        int cubeOfSum = 0;

        while (n > 0) {
            int digit = n % 10;
            cubeOfSum += digit * digit * digit;
            n = n / 10;
        }

        return copySum == cubeOfSum;
    }
}