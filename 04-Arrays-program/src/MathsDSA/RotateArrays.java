package MathsDSA;

import java.util.Arrays;

public class RotateArrays {
    static void main(String[] args) {
        int[]nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
    static void rotate(int[] nums, int k) {
        revers(nums,0, nums.length-1);
        revers(nums,k, nums.length-1);
        revers(nums,0, k-1);

    }
    private static void revers(int[] nums, int start, int end) {
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
