class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> res=new HashSet<>();
        for(int i:nums){
            res.add(i);
        }
        int ans=k;
        while(true){
            if(!res.contains(ans)){
                return ans;
            }
            ans+=k;
        }
    }
}