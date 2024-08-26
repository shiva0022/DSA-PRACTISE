/* problem link ::
https://neetcode.io/problems/is-anagram */

#include<bits/stdc++.h>
using namespace std;
bool isAnagram(string s, string t) {
    if (s.size() != t.size()) return false;
    unordered_map<char, int> s_map;
    unordered_map<char, int> t_map;
    for (int i = 0; i < s.size(); i++) {
        s_map[s[i]]++;
        t_map[t[i]]++;
    }
    for (auto pair : s_map) 
        if (pair.second != t_map[pair.first]) return false;
    return true;
}