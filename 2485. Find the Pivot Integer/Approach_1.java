class Solution {
    public int pivotInteger(int n) {
        for(int i=1;i<=n;i++){
            int lsum=0;
            int rsum=0;
            for(int j=1;j<=i;j++){
                lsum+=j;
            }
            for(int k=i;k<=n;k++){
                rsum+=k;
            }
            if(lsum==rsum){
                return i;
            }
        }
        return -1;
        
    }
}