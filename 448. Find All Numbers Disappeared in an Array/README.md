# 448. Find All Numbers Disappeared in an Array

### Difficulty: Easy

## Description
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 
Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:
Input: nums = [1,1]
Output: [2]

 
Constraints:


	n == nums.length
	1 <= n <= 105
	1 <= nums[i] <= n


 
Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

## Submission Details
- **Status**: Accepted
- **Runtime**: 22
- **Memory**: 74652000
- **Language**: java

## Code
```java
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res=new ArrayList<>();
        HashSet<Integer> res2=new HashSet<>();
        int len=nums.length;
        for(int i:nums){
            res2.add(i);
        }
        for(int i=1;i<=len;i++){
            if(!res2.contains(i)){
                res.add(i);
            }
        }
        return res;       
    }
}
```
