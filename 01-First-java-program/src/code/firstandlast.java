package code;

import java.util.Arrays;

public class firstandlast {
    static void main(String[] args) {
        int []nums={5,7,7,8,8,10};
        int target = 8;
        int ans[]=searchingRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int [] searchingRange(int []nums,int target){
        int []ans={-1,-1};
        int Start = searching(nums,target,true);
        int End = searching(nums,target,false);
        ans[0]=Start;
        ans[1]=End;
        return ans;
    }
    static int searching(int[] nums,int target,boolean FirstIndex) {
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            } else if (target>nums[mid]) {
                start=mid+1;
            }else{
                ans=mid;
                if(FirstIndex){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }


        }
        return ans;
    }

}