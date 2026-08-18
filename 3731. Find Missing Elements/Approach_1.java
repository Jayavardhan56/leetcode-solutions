class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> res=new ArrayList<>();
        int i=nums[0];
        for(int j=0;j<nums.length;j++){
            while(i<nums[j]){
                res.add(i++);
            }
            i++;
        }
        return res;
        
    }
}