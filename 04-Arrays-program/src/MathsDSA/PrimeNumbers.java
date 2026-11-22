package MathsDSA;

public class PrimeNumbers {
    static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (check(i)){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
    static boolean check(int n){
        if (n <= 1) return false;
        for (int i = 2; i < n / i; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
