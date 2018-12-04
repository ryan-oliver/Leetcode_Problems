/*  Check if string is a valid palindrome. Check only alphanumeric characters **/

public class ValidPalindrome {

    // Test method
    public static void main(String[] args) {
        String str = "A man, a  plan, a canal: Panama";
        System.out.print(isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {
        int charIndex; // Holds char value
        char[] charArray = s.toCharArray(); // Array of input string
        int index = 0; // Index for input to new char array
        char[] newStr = new char[charArray.length]; // Array to hold only alphanumeric characters
        for (int i = 0; i < charArray.length; i++) { // Scan entire input string
            charIndex = charArray[i];
            if (charIndex >= 48 && charIndex <= 57 || charIndex >= 65 && charIndex <= 90
                    || charIndex >= 97 && charIndex <= 122) { // Check if charIndex is alphanumeric
                if (charArray[i] >= 65 && charArray[i] <= 90)
                    charArray[i] += 32; // Change capital characters to lowercase
                newStr[index] = charArray[i]; // Add to new char array
                index++; // Increase new array index
            }
        }
        // Compare characters in new array in both directions simultaneously
        for (int i = 0, j = index - 1; i < index; i++, j--) {
            if (newStr[i] != newStr[j])
                return false;
        }
        return true;
    }
}
