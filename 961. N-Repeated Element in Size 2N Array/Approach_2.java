class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> h=new HashMap<>();
        for(int i:nums){
            h.put(i,h.getOrDefault(i,0)+1);
            if(h.get(i)>1){
                return i;
            }
        }
        return -1;
    }
}