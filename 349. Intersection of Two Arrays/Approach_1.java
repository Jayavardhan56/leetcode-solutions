class Solution {
    public static boolean find(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n1;i++){
            int temp=nums1[i];
            if(find(nums2,temp)){
                if(!res.contains(temp)){
                    res.add(temp);
                }
            }
            temp=0;
        }
        int[] res2=new int[res.size()];
        for(int i=0;i<res.size();i++){
            res2[i]=res.get(i);
        }
        return res2;
        
    }
}