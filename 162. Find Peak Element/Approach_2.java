class Solution {
    public int findPeakElement(int[] nums) {
        int max1=Arrays.stream(nums).max().getAsInt();
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max1){
                res=i;
            }
        }
        return res;
    }
}