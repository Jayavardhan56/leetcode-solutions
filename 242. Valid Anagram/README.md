# 242. Valid Anagram

### Difficulty: Easy

## Description
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 
Example 1:


Input: s = "anagram", t = "nagaram"

Output: true


Example 2:


Input: s = "rat", t = "car"

Output: false


 
Constraints:


	1 <= s.length, t.length <= 5 * 104
	s and t consist of lowercase English letters.


 
Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## Submission Details
- **Status**: Accepted
- **Runtime**: 11
- **Memory**: 19272000
- **Language**: python3

## Code
```python3
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        chcount={}
        for c in s:
            chcount[c]=chcount.get(c,0)+1
        for c in t:
            chcount[c]=chcount.get(c,0)-1
        for i in chcount.values():
            if i!=0:
                return False
        return True
        
```
