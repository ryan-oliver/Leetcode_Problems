/* Given a positive integer, check whether it has alternating bits:
namely, if two adjacent bits will always have different values.
 */

public class BinaryNumberWithAlternatingBits {
    // Test method
    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(1));
        System.out.println(hasAlternatingBits(5));
        System.out.println(hasAlternatingBits(7));
        System.out.println(hasAlternatingBits(10));
        System.out.println(hasAlternatingBits(11));
        System.out.println(hasAlternatingBits(21));
        System.out.println(hasAlternatingBits(170));
    }

    public static boolean hasAlternatingBits(int n) {
        double result = 0;
        int index = 2;
        while (result <= n) {
            result = Math.ceil((2.0/3.0)*(Math.pow(2,index) - 1));
            if (result == n)
                return true;
            index++;
        }
        return false;
    }
}
