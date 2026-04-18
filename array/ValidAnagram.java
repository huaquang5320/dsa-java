package array;

/**
 * LeetCode #242 - Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 *
 * Time: O(n)
 * Space: O(1) (or O(k) where k is alphabet size, constant for fixed alphabet)
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] counts = new int[26]; // for lowercase English letters
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
