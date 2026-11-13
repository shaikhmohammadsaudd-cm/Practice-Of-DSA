package MathsDSA;

public class DigitCount {
    static void main(String[] args) {
        int n = 1234;
        System.out.println(print(n));
    }
    static int print(int n) {
        int couunt = 0;
            for (int i = 0; i < n; i++) {
                n = n % 10;
                couunt++;
            }
        return couunt;
    }
}
