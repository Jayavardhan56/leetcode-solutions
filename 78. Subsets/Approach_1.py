class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        l=len(nums)
        res=[]
        for i in range(l+1):
            res+=combinations(nums,i)
        return res

        