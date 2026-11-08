//https://leetcode.com/problems/compute-alternating-sum/description/?envType=problem-list-v2&envId=array
//3701. Compute Alternating Sum

package Assigment;

public class AlternatingSum {
    static void main(String[] args) {
        int[]nums={1,3,5,7};
        System.out.println(ComputeAlternatingSum(nums));

    }
    static int ComputeAlternatingSum(int[]nums){
        int ans=0;
        for (int i=0;i< nums.length;i++) {
            if (i % 2 == 0) {
               ans = ans + nums[i];
            } else {
                ans = ans - nums[i];
            }
        }
        return ans;
    }

}
