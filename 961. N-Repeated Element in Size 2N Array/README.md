# 961. N-Repeated Element in Size 2N Array

### Difficulty: Easy

## Description
You are given an integer array nums with the following properties:


	nums.length == 2 * n.
	nums contains n + 1 unique values, n of which occur exactly once in the array.
	Exactly one element of nums is repeated n times.


Return the element that is repeated n times.

 
Example 1:
Input: nums = [1,2,3,3]
Output: 3
Example 2:
Input: nums = [2,1,2,5,3,2]
Output: 2
Example 3:
Input: nums = [5,1,5,2,5,3,5,4]
Output: 5

 
Constraints:


	2 <= n <= 5000
	nums.length == 2 * n
	0 <= nums[i] <= 104
	nums contains n + 1 unique elements and one of them is repeated exactly n times.

## Submission Details
- **Status**: Accepted
- **Runtime**: 17
- **Memory**: 47436000
- **Language**: java

## Code
```java
class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> h=new HashMap<>();
        int res=0;
        for(int i:nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(int i:h.keySet()){
            if(h.get(i)>1){
                return i;
            }
        }
        return -1;
    }
}
```
