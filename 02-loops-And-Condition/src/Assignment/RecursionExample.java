package Assignment;

public class RecursionExample {
    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println(number + " ka Factorial: " + result);
    }
    // Factorial count karne ka recursive method (5! = 5 * 4 * 3 * 2 * 1)
        static int factorial(int n) {
            // Base Case: Jahan recursion rukega
            if (n == 1 || n == 0) {
                return 1;
            }

            // Recursive Call: Method apne aap ko call kar raha hai (n - 1 ke sath)
            return n * factorial(n - 1);
        }

      // Output: 120}
}

