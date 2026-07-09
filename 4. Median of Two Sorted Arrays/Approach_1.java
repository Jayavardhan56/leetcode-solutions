class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int l3=l1+l2;
        double med;
        int nums3[]=new int[l3];
        int i=0,j=0,k=0;
        while(i<l1 && j<l2){
            if(nums1[i]<nums2[j]){
                nums3[k]=nums1[i];
                i++;
                k++;
            }
            else{
                nums3[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<l1){
            nums3[k++]=nums1[i++];
        }
        while(j<l2){
            nums3[k++]=nums2[j++];
        }
        int mid=(l3)/2;
        if(l3%2==0){
            med=(float)(nums3[mid-1]+nums3[mid])/2;
        }
        else{
            med=nums3[mid];
        }
        return med;
    }
}