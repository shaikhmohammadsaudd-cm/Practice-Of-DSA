package LinearSearch;

import java.util.Arrays;

public class FindMax2D {
    static void main(String[] args) {
        int arr[][] = {
                {99,78,67,78},
                {46,57},
                {78,97,35,68}
        };
        System.out.println(max(arr));
    }
    static int max(int[][]arr){
        int maxValue = Integer.MIN_VALUE;
        for (int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(maxValue>arr[row][col]){
                    maxValue=arr[row][col];
                }
            }
        }
        return maxValue;
    }
}
