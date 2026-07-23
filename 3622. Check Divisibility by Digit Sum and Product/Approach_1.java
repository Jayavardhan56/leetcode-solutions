class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,prod=1;
        // if(n<9){
        //     return false;
        // }
        int temp=n;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            prod*=rem;
            n/=10;
        }
        if(temp%(sum+prod)==0){
            return true;
        }
        return false;
    }
}