package MathsDSA;

public class SecondLargest {
    static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 35};
        largest(arr);
    }
    static void largest(int[]arr){
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                second = max;
                max = arr[i];
            } else if (arr[i] > second && arr[i] < max) {
                second = arr[i];
            }
        }
        if (second==Integer.MIN_VALUE){
            System.out.println("Seocnd Largest is not ");
        }else {
            System.out.println(second);
        }
    }
}
