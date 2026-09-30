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
        