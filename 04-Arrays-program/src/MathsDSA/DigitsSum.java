package MathsDSA;

public class DigitsSum {
    static void main(String[] args) {
        System.out.println(addDigits(38));
    }
    static int addDigits(int num) {
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i <= num; i++) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        for (int i = 0; i <= sum; i++) {
            int digit2 = sum%10;
            sum1 += digit2;
            sum/=10;
        }
         return sum1;
    }
}
