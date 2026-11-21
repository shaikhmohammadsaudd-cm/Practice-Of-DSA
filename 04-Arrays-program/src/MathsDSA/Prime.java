package MathsDSA;

public class Prime {
    static void main(String[] args) {
       int n = 17;
        for (int i = 0; i < n; i++) {
            System.out.println(i +" "+ check(i));
        }
    }
    static String check(int n) {
        boolean prime;
        for (int i = 2; i < n; i++) {
            if (n % i==0){
                return "Not prime";
            }
        }
        return "Prime";
    }
}
