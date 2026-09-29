//https://leetcode.com/problems/reverse-integer/description/
//7. Reverse Integer

package Assignment;

public class ReversIntegr {
    static void main(String[] args) {
        int x = 123;
        System.out.println(revers(x));
    }
    static int revers(int x){
        int rev = 0;
        while (x != 0){
            int digit = x%10;
            rev = (rev*10)+digit;
            x = x / 10;
        }
        return rev;
    }
}
