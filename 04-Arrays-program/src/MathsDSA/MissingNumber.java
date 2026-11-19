package MathsDSA;

public class MissingNumber {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        System.out.println(mising(arr));
    }
    static int mising(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i+1){
                return i+1;
            }
        }
        return -1;
    }
}
