package Assignments;

import java.util.Arrays;

public class swap {
    static void main(String[] args) {
        int[]arr = {9,8,7,5,7,5,5,10};
        swap(arr,0,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
