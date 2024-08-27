/*
 * problem link : https://leetcode.com/problems/top-k-frequent-elements/description/
 */


import java.util.*;

public class TopKElements {
        public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        for (int num : nums) {
           if (map.containsKey(num)) map.put(num, map.get(num) + 1);
           else map.put(num, 1);
        }
        List<Integer>[] freqs = new List[nums.length + 1];
        for (int i = 0; i < freqs.length; i++) freqs[i] = new ArrayList<>();
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) 
            freqs[pair.getValue()].add(pair.getKey());
        int[] res = new int[k];
        int idx = 0;
        for (int i = freqs.length - 1; i >= 0; i--) {
            for (int num : freqs[i]) {
                res[idx++] = num;
                if (idx == k) return res;
            }
        }
        return res;
    }
}