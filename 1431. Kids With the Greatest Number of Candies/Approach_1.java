class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxi=0;
        for(int i:candies){
            maxi=Math.max(i,maxi);
        }
        List<Boolean> res=new ArrayList<>();
        for(int j:candies){
            res.add(j+extraCandies>=maxi);
        }
        return res;
        
    }
}