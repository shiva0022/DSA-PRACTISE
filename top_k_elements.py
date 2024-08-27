'''
  :problem link : https://neetcode.io/problems/top-k-elements-in-list
'''
from typing import List
from collections import Counter

# time complexity O(nlogn)
def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freqs = Counter(nums)
        res = dict(sorted(freqs.items(), key=lambda x: x[1], reverse=True))
        res = list(res.keys())[:k]
        return res
      
      
# time complexity O(n)
def topKFrequent(self, nums: List[int], k: int) -> List[int]:
    freqs = Counter(nums)
    orderd_freqs = [[] for _ in range(len(nums)+1)]
    for val, idx in freqs.items():
        orderd_freqs[idx].append(val)
    res = []
    for ls in orderd_freqs[::-1]:
        for num in ls:
            res.append(num)
            if len(res) == k: return res