class Solution {
    public int[] numberGame(int[] nums) {
        int res[]=new int[nums.length];
        Arrays.sort(nums);
        int j=0;
        for(int i=1;i<nums.length;i+=2){
            res[j++]=nums[i];
            j++;
        }
        j=1;
        for(int i=0;i<nums.length;i+=2){
            res[j++]=nums[i];
            j++;
        }
        return res;
        
    }
}