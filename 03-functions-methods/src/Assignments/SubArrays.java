package Assignments;

public class SubArrays {
    static void main(String[] args) {
        int[]nums = {1};
        System.out.println(maxSubArray(nums));
    }
    static int maxSubArray(int[] nums) {
        int current = nums[0];
        int max = nums[0];
        for (int i=1;i<nums.length;i++){
            current = Math.max(nums[i],current+nums[i]);
            max = Math.max(max,current);
        }
        return max;
    }
}