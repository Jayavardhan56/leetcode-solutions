class Solution {
    public int[] numberGame(int[] nums) {
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        for(int i=0;i<nums.length;i+=2){
            res[i]=nums[i+1];
            res[i+1]=nums[i];
        }
        return res;
        
    }
}