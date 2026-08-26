class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
            List<Integer> res=new ArrayList<>();
            HashSet<Integer> s=new HashSet<>();
            for(int i:bulbs){
                if(!s.contains(i)){
                    s.add(i);
                }else{
                    s.remove(i);
                }
            }
            for(int i:s){
                res.add(i);
            }
            Collections.sort(res);
            return res;
    }
}