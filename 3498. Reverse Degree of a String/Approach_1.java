class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int a=26-(ch-'a');
            a*=i+1;
            sum+=a;
        }
        return sum;
    }
}