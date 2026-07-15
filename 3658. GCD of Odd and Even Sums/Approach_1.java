class Solution {
    public int gcdOfOddEvenSums(int n) {
        int esum=n*(n+1);
        int osum=(n*n);
        while(osum!=0){
            int temp=osum;
            osum=esum%osum;
            esum=temp;
        }
        return esum;
    }
}