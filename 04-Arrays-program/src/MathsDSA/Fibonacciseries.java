package MathsDSA;

public class Fibonacciseries {
    static void main(String[] args) {
        int a = 0; int b = 1;
        for (int i = 1; i <= 7; i++) {
            System.out.println(a+" ");
            int temp = a+b;
            a = b;
            b = temp;
        }
    }
}
