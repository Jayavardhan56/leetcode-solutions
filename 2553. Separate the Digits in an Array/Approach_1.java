class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> li=new ArrayList<>();
        for(int i:nums){
            for (char c:String.valueOf(i).toCharArray()) {
                li.add(c -'0');
            }
        }
        int res[]=new int[li.size()];
        for(int i=0;i<li.size();i++){
            res[i]=li.get(i);
        }
        return res;
    }
}