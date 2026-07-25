class Solution {
    public int maxProduct(int n) {
        String s=String.valueOf(n);
        int l=s.length();
        int arr[]=new int[l];
        int i=0;
        while(n>0){
            arr[i++]=n%10;
            n/=10;
        }
        Arrays.sort(arr);
        int res=arr[l-1]*arr[l-2];
        return res;
    }
}