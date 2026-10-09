package Code;

public class Palindrome {
    static void main(String[] args) {
        int x = 12321;
        System.out.println(palin(x));
    }
    static boolean palin(int x){
        int temp = x;
        int rev = 0;
        while (temp > 0){
            int lastDegit = temp%10;
            rev = (rev*10) + lastDegit;
            temp = temp /10;
        }
        return rev == x;
    }
}
