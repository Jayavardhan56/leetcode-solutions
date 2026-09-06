class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String s=Integer.toString(i);
            int len=s.length();
            if(len%2!=0){
                continue;
            }
            int mid=len/2;
            int lsum=0;
            int rsum=0;
            for(int j=0;j<mid;j++){
                lsum+=s.charAt(j)-'0';
            }
            for(int j=mid;j<len;j++){
                rsum+=s.charAt(j)-'0';
            }
            if(lsum==rsum){
                count++;
            }
        }
        return count;
    }
}