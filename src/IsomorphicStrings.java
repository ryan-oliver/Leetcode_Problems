/* Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters.
No two characters may map to the same character but a character may map to itself.
*/

public class IsomorphicStrings {

    // Test method
    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        System.out.print(isIsomorphic(s ,t));
    }

    public static boolean isIsomorphic(String s, String t) {
        int[] charMap = new int[128]; // Map String s chars to String t chars
        int[] useCt = new int[128]; // Only map chars that have not already been mapped
        boolean[] isMapped = new boolean[128]; // Prevent mapping to the same char
        for (int i = 0; i < s.length(); i++) {
            if (useCt[s.charAt(i)] == 0) {
                if (!isMapped[t.charAt(i)]) {
                    charMap[s.charAt(i)] = t.charAt(i);
                    useCt[s.charAt(i)]++;
                    isMapped[t.charAt(i)] = true;
                }
            }
            if (t.charAt(i) != charMap[s.charAt(i)])
                return false;
        }
        return true;
    }
}
