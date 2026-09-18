class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res=new ArrayList<>();
        HashSet<Integer> res2=new HashSet<>();
        int len=nums.length;
        for(int i:nums){
            res2.add(i);
        }
        for(int i=1;i<=len;i++){
            if(!res2.contains(i)){
                res.add(i);
            }
        }
        return res;       
    }
}