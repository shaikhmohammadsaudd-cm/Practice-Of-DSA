package Assignments;

import java.util.HashSet;
import java.util.Set;

public class Alphabet {
    static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isPangram(str));
        //   System.out.println(isPangram("Hello world"));

    }
    static boolean isPangram(String str){

        Set<Character> set = new HashSet<>();
        for (char c: str.toCharArray()){
            if (c>='a' && c<='z'){
                set.add(c);
            }
        }
        return set.size()==26;
    }
}
