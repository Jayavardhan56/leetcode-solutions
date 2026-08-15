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