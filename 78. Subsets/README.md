# 78. Subsets

### Difficulty: Medium

## Description
Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 
Example 1:


Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]


Example 2:


Input: nums = [0]
Output: [[],[0]]


 
Constraints:


	1 <= nums.length <= 10
	-10 <= nums[i] <= 10
	All the numbers of nums are unique.

## Submission Details
- **Status**: Accepted
- **Runtime**: 0 ms
- **Memory**: 19512000
- **Language**: python3

## Code
```python3
class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        l=len(nums)
        res=[]
        for i in range(l+1):
            res+=combinations(nums,i)
        return res

        
```
