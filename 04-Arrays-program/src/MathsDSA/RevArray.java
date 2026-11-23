package MathsDSA;

import java.util.Arrays;

public class RevArray {
    static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void rev(int[]arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
