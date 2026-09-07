class Solution {
    public int[] diStringMatch(String s) {
        char ch[]=s.toCharArray();
        int n=s.length();
        int res[]=new int[n+1];
        int low=0,high=n;
        for(int i=0;i<n;i++){
            if(ch[i]=='I'){
                res[i]=low++;
            }else{
                res[i]=high--;
            }
        }
        res[n]=low;
        return res;
        
    }
}