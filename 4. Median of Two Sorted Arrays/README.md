# 4. Median of Two Sorted Arrays

### Difficulty: Hard

## Description
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 
Example 1:


Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.


Example 2:


Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


 
Constraints:


	nums1.length == m
	nums2.length == n
	0 <= m <= 1000
	0 <= n <= 1000
	1 <= m + n <= 2000
	-106 <= nums1[i], nums2[i] <= 106

## Submission Details
- **Status**: Accepted
- **Runtime**: 1
- **Memory**: 46404000
- **Language**: java

## Code
```java
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int l3=l1+l2;
        double med;
        int nums3[]=new int[l3];
        int i=0,j=0,k=0;
        while(i<l1 && j<l2){
            if(nums1[i]<nums2[j]){
                nums3[k]=nums1[i];
                i++;
                k++;
            }
            else{
                nums3[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<l1){
            nums3[k++]=nums1[i++];
        }
        while(j<l2){
            nums3[k++]=nums2[j++];
        }
        int mid=(l3)/2;
        if(l3%2==0){
            med=(float)(nums3[mid-1]+nums3[mid])/2;
        }
        else{
            med=nums3[mid];
        }
        return med;
    }
}
```
