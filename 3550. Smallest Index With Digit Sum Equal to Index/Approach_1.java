class Solution {
    static int digitsum(int n1){
        int res=0;
        while(n1!=0){
            int rem=n1%10;
            res+=rem;
            n1/=10;
        }
        return res;
    }
    public int smallestIndex(int[] nums) {
        int res1=-1;
        for(int i=0;i<nums.length;i++){
            int res3=digitsum(nums[i]);
            if(res3==i){
                res1=i;
                break;
            }
        }
        return res1;
        
    }
}