/* Given an input string, reverse the string word by word. */

public class ReverseWords {

    public static void main(String[] args) {
        String str = "run test  a is this";
        System.out.print(reverseWords(str));
    }

    public static String reverseWords(String s) {
        boolean lastLetter = false, firstLetter = false; // Track word locations
        int lastIndex = 0, firstIndex = 0;
        char[] sArray = s.toCharArray(); // Convert string to char array
        String str = "";
        for (int i = sArray.length - 1; i >= 0; i--) { // Scan char array
            if (sArray[i] != 32 && !lastLetter) { // Check for last letter of word
                lastLetter = true;
                lastIndex = i;
            }
            if ((lastLetter && !firstLetter && sArray[i] == 32)) { // Check for first letter by finding leading spcae
                firstLetter = true;
                firstIndex = i + 1;
            }
            if (i == 0 && lastLetter && !firstLetter) { // Check for last letter of array if lastLetter is true
                firstLetter = true;
                firstIndex = i;
            }
            if (lastLetter && firstLetter) { // If first and last letter found add to new String
                if (str.length() == 0)
                    str = new String(sArray, firstIndex, ((lastIndex - firstIndex) + 1));
                else {
                    String newString = new String(sArray, firstIndex, ((lastIndex - firstIndex) + 1));
                    str = str + " " + newString;
                }
                lastLetter = false; // reset found letters
                firstLetter = false;
            }
        }
        return str;
    }
}

