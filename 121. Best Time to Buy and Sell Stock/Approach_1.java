class Solution {
    public int maxProfit(int[] prices) {
        int res=0;
        int min=prices[0];
        int n=prices.length;
        for(int i=0;i<n;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            int n2=prices[i]-min;
            if(n2>res){
                res=n2;
            }
        }
        return res;
        
    }
}