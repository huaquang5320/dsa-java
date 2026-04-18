package array;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode #217 - Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/
 *
 * Time: O(n)
 * Space: O(n)
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
