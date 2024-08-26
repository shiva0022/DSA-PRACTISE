/*
 *problem link : https://neetcode.io/problems/anagram-groups
 */


import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>();
        for (String str : strs) {
            int[] hash = new int[26];
            for (char ch : str.toCharArray()) hash[ch - 'a']++;
            String key = Arrays.toString(hash);
            if (groups.containsKey(key) == false) 
                groups.put(key, new ArrayList<>());
            groups.get(key).add(str);
        }
        return new ArrayList<>(groups.values());
    }
}
