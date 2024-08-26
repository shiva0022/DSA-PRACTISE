/* PROBLEM LINK ::
https://neetcode.io/problems/duplicate-integer */

import java.util.*;
class ContainsDuplicates {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> unq = new HashSet<>();
        for (int num : nums) {
            if (unq.contains(num)) return true;
            else unq.add(num);
        }
        return false;
    }
}
