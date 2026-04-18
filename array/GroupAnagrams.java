package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode #49 - Group Anagrams
 * https://leetcode.com/problems/group-anagrams/
 *
 * Time: O(n * k) — n strings, k = max string length
 * Space: O(n * k) — storing all strings in map
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // 1. tính key cho s bằng int[26]
            int[] counts = new int[26];
            for (int i = 0; i < s.length(); i++) {
                counts[s.charAt(i) - 'a']++;
            }
            // 2. convert key thành String
            String key = Arrays.toString(counts);
            // 3. add s vào map theo key
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        // 4. return tất cả values
        return new ArrayList<>(map.values());
    }
}
