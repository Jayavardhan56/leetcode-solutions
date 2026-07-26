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