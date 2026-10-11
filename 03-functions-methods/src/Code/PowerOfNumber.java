package Code;

public class PowerOfNumber {
    static void main(String[] args) {
       int base = 2;
       int exponent = -2;
       pow(base,exponent);
    }
    static void pow(int base ,int exponent){
       if (exponent < 0){
           base = 1/base;
           exponent = -exponent;
       }
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Final Result is "+ result);
    }
}
