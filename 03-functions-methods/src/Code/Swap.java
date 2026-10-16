package Code;

public class Swap {
    public static void main(String[] args) {
            int a = 10;
            int b = 20;
            swap(a, b);

            System.out.println(a + " " + b);

            String name = "Saud Shaikh";
            changeName(name);
            System.out.println(name);
        }
        //Changing Process Saud Shaikh-> Mohammad
        static void changeName(String naam) {
            naam = "Mohammad"; // creating a new object
        }
        //Swapping Process
        static void swap(int num1, int num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
    }
}
// swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;
