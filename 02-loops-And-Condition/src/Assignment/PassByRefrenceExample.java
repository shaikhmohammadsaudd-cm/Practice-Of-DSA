package Assignment;
import java.util.Arrays;
public class PassByRefrenceExample {
    public static void main(String[] args) {
        int x = 10;
        modifyPrimitive(x);
        System.out.println("x ki value: " + x); // Output: 10 (No change)

        int[] nums = {1, 2, 3};
        modifyArray(nums);
        System.out.println("Array after method: " + Arrays.toString(nums)); // Output: [99, 2, 3]
    }
    // 1. Primitive Type (int): Change nahi hoga
        static void modifyPrimitive(int num) {
            num = 100; // Yeh local copy hai
        }

        // 2. Reference Type (Array): Original array change ho jayega
        static void modifyArray(int[] arr) {
            arr[0] = 99; // Directly memory location par modify karta hai
    }


}
