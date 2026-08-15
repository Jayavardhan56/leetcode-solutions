# 2239. Find Closest Number to Zero

### Difficulty: Easy

## Description
Given an integer array nums of size n, return the number with the value closest to 0 in nums. If there are multiple answers, return the number with the largest value.
 
Example 1:


Input: nums = [-4,-2,1,4,8]
Output: 1
Explanation:
The distance from -4 to 0 is |-4| = 4.
The distance from -2 to 0 is |-2| = 2.
The distance from 1 to 0 is |1| = 1.
The distance from 4 to 0 is |4| = 4.
The distance from 8 to 0 is |8| = 8.
Thus, the closest number to 0 in the array is 1.


Example 2:


Input: nums = [2,-1,1]
Output: 1
Explanation: 1 and -1 are both the closest numbers to 0, so 1 being larger is returned.


 
Constraints:


	1 <= n <= 1000
	-105 <= nums[i] <= 105

## Submission Details
- **Status**: Accepted
- **Runtime**: 2
- **Memory**: 46752000
- **Language**: java

## Code
```java
class Solution {
    public int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        int res=0;
        for(int i=0;i<nums.length;i++){
            int temp=Math.abs(nums[i]-0);
            if(temp<min || (temp==min && nums[i]>res)){
                min=temp;
                res=nums[i];
            }
            
        }
        return res;
    }
}
```
