/* Write a function that takes a string as input and returns the string reversed. */

public class ReverseString {

    // Test method
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.print(reverseString(str));
    }

    public static String reverseString(String s) {
        char[] arry = s.toCharArray();
        char[] arry2 = new char[arry.length];
        for (int i = arry.length - 1, j = 0; i >= 0; i--, j++)
            arry2[j] = arry[i];
        return new String(arry2);
    }
}
