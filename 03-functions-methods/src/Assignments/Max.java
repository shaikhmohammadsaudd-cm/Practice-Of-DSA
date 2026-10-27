package Assignments;

import java.util.Arrays;

public class Max {
    static void main(String[] args) {
        int[] arr = {4, 5, 34, 34, 23, 56, 34, 567};
        System.out.println(maxreturn(arr));
    }
    static int maxreturn(int[] arr) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i] ;
            }
        }
        return maxValue;
    }

}