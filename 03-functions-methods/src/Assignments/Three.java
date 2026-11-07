package Assignments;

import java.util.Arrays;

public class Three {
    static void main(String[] args) {
        int[]nums={7,5,6,4,23,3,56,76,-98,-789,-97,98};
        System.out.println(maximum(nums));
    }
    static int maximum(int[] nums) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k= j+1; k < nums.length; k++) {
                    max = Math.max(max,nums[i] * nums[j ] * nums[k]);
                }
            }
        }
        return max;
    }
}
