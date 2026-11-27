package MathsDSA;

public class Rotations {
    static void main(String[] args) {
        int[]nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
    }
    static void rotate(int[] nums, int k) {
        previce(nums,0,k-1);
    }

    private static void previce(int[]nums,int start, int end) {
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
    }
}
