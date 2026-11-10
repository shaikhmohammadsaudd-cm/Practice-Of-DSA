package MathsDSA;

public class bit {
    static void main(String[] args) {

    }
    static char findKthBit(int n, int k) {
        return helper(n,k,"0");
    }

    private static char helper(int n, int k, String s) {
        int i = 2;
        while (i <= n){
            StringBuilder inverted = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                inverted.append(s.charAt(j) == '0' ? '1' : '0');
            }
            String revers = inverted.reverse().toString();
            s = s + '1' + revers;
            i++;
        }
        return s.charAt(k-2);
    }
}
