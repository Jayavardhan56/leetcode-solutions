class Solution {
    public int numberOfChild(int n, int k) {
        int ch=1;
        int b=1;
        for(int i=0;i<k;i++){
            ch+=b;
            if(ch==n){
                b=-1;
            }
            if(ch==1){
                b=1;
            }
        }
        return ch-1;
    }
}