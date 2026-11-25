package MathsDSA;

public class rob {
    static void main(String[] args) {
        int[]nums = {1,2,3,1};
        System.out.println(rob(nums));
    }
    static int rob(int[] nums) {
        int prev2 = 0;
        int prev1 = 0;
        int curr;
        for (int i = 0; i < nums.length; i++) {
            curr = Math.max(nums[i] + prev2,prev1);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
