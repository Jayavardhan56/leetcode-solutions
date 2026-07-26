# 628. Maximum Product of Three Numbers

### Difficulty: Easy

## Description
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

 
Example 1:
Input: nums = [1,2,3]
Output: 6
Example 2:
Input: nums = [1,2,3,4]
Output: 24
Example 3:
Input: nums = [-1,-2,-3]
Output: -6

 
Constraints:


	3 <= nums.length <= 104
	-1000 <= nums[i] <= 1000

## Submission Details
- **Status**: Accepted
- **Runtime**: 16
- **Memory**: 48132000
- **Language**: java

## Code
```java
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int m1=nums[len-1];
        int m2=nums[len-2];
        int m3=nums[len-3];
        int s1=nums[0];
        int s2=nums[1];
        int res1=m1*m2*m3;
        int res2=s1*s2*m1;
        if(res1>res2){
            return res1;
        }
        return res2;
        
    }
}
```
