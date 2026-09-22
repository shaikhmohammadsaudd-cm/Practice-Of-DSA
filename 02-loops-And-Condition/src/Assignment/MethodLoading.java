package Assignment;

public class MethodLoading {
    public static void main(String[] args) {
        System.out.println("2 numbers ka sum: " + add(10, 20));          // Output: 30
        System.out.println("3 numbers ka sum: " + add(10, 20, 30));      // Output: 60
        System.out.println("Double values ka sum: " + add(5.5, 4.5));   // Output: 10.0
    }
    // 1. Do integers ko add karne ke liye
        static int add(int a, int b) {
            return a + b;
        }

        // 2. Teen integers ko add karne ke liye (Same name, 3 parameters)
        static int add(int a, int b, int c) {
            return a + b + c;
        }

        // 3. Double values ko add karne ke liye (Same name, double type parameters)
        static double add(double a, double b) {
            return a + b;
        }


    }
