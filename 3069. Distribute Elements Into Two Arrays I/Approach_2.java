class Solution {
    public int[] resultArray(int[] nums) {
        int n1[]=new int[nums.length];
        int n2[]=new int[nums.length];
        int a1=0,a2=0;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                n1[a1++]=nums[i];
            }else if(i==1){
                n2[a2++]=nums[i];
            }else{
                if(n1[a1-1]>n2[a2-1]){
                    n1[a1++]=nums[i];
                }else{
                    n2[a2++]=nums[i];
                }
            }
        }
        for(int i=0;i<a2;i++){
            n1[a1++]=n2[i];
        }
        return n1;
    }
    
}