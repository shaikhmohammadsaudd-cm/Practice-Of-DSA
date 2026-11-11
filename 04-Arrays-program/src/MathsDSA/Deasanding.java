package MathsDSA;

import java.util.Arrays;

public class Deasanding {
    static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        desa(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void desa(int[]arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1 ; j < arr.length - i; j++) {
                if (arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
