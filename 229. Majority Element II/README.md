# 229. Majority Element II

### Difficulty: Medium

## Description
Given an integer array of size n, find all elements that appear more than ⌊n / 3⌋ times.

 
Example 1:


Input: nums = [3,2,3]
Output: [3]


Example 2:


Input: nums = [1]
Output: [1]


Example 3:


Input: nums = [1,2]
Output: [1,2]


 
Constraints:


	1 <= nums.length <= 5 * 104
	-109 <= nums[i] <= 109


 
Follow up: Could you solve the problem in linear time and in O(1) space?

## Submission Details
- **Status**: Accepted
- **Runtime**: 2
- **Memory**: 52040000
- **Language**: java

## Code
```java
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int e1=-1;
        int e2=-1;
        int c1=0;
        int c2=0;
        int n=nums.length;
        for(int i:nums){
            if(i==e1){
                c1+=1;
            }
            else if(i==e2){
                c2+=1;
            }
            else if(c1==0){
                e1=i;
                c1+=1;
            }
            else if(c2==0){
                e2=i;
                c2+=1;
            }
            else{
                c1-=1;
                c2-=1;
            }
        }
        List<Integer> res=new ArrayList<>();
        c1=0;
        c2=0;
        for(int i:nums){
            if(i==e1){
                c1+=1;
            }
            else if(i==e2){
                c2+=1;
            }
        }
        if(c1>n/3){
            res.add(e1);
        }
        if((c2>n/3) && (e2!=e1)){
            res.add(e2);
        }
        if(res.size()==2 && res.get(0)>res.get(1)){
            int temp=res.get(0);
            res.set(0,res.get(1));
            res.set(1,temp);
        }
        return res;
    }
}
```
