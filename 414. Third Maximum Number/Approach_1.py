class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        li1=set(nums)
        li1=sorted(li1)
        if len(li1)<3:
            return li1[-1]
        return li1[-3]
        