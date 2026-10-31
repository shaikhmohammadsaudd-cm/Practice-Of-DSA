package Assignments;

public class PrintString {
    static void main(String[] args) {
        String series = "";
       alphabet(series);
        System.out.print(series);
    }

    static void alphabet(String series) {
        for (int i=0;i<26;i++){
            char ch = (char)('a' + i);
            System.out.println(ch);
        }
    }
}