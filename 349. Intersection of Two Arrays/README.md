# 349. Intersection of Two Arrays

### Difficulty: Easy

## Description
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 
Example 1:


Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]


Example 2:


Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.


 
Constraints:


	1 <= nums1.length, nums2.length <= 1000
	0 <= nums1[i], nums2[i] <= 1000

## Submission Details
- **Status**: Accepted
- **Runtime**: 3
- **Memory**: 44528000
- **Language**: java

## Code
```java
class Solution {
    public static boolean find(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n1;i++){
            int temp=nums1[i];
            if(find(nums2,temp)){
                if(!res.contains(temp)){
                    res.add(temp);
                }
            }
            temp=0;
        }
        int[] res2=new int[res.size()];
        for(int i=0;i<res.size();i++){
            res2[i]=res.get(i);
        }
        return res2;
        
    }
}
```
