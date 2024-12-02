/*
* https://leetcode.com/problems/subsets
*/

import java.util.*;

class Subsets {

    public List<List<Integer>> subSets = new ArrayList<>();
    public List<Integer> arr = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        generateSubsets(0, nums);
        return subSets;
    }
    public void generateSubsets(int index, int[] nums) {
        if (index == nums.length) {
            subSets.add(arr);
            return;
        }
        arr.add(nums[index]);
        generateSubsets(index + 1, nums);
        arr.remove(nums.length - 1);
        generateSubsets(index + 1, nums);
    }
}
