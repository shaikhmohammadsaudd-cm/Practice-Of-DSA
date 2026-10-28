//https://leetcode.com/problems/palindrome-number/description/
//9. Palindrome Number
package Assignments;

public class Palindrom {
    static void main(String[] args) {
        int x = 1111;
        System.out.println(name(x));
    }
    static boolean name(int x){
        if(x < 0){
            return false;
        }
        int rev = 0;
        int xcopy = x;
        while (x > 0){
            rev = (rev * 10) + (x % 10);
            x = x / 10;
        }
        return rev ==  xcopy;
    }
}
