package MathsDSA;

public class countCheck {
    static void main(String[] args) {
        int[] arr = {4, 2, 4, 3, 2, 4, 2, 5};
        int[]a = {2,4,6,8};
        check(arr);
    }
    static void check(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean allReadyCount = false;
            for (int k = 0; k < i; k++) {
                if (arr[i]==arr[k]){
                    allReadyCount = true;
                    break;
                }
            }
            if (allReadyCount) continue;
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i] + "Count  " + count);
        }
    }
}
