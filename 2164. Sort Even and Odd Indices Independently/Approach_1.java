class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int res[]=new int[nums.length];
        if(nums.length<3){
            return nums;
        }
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                a.add(nums[i]);
            }else{
                b.add(nums[i]);
            }
        }
        Collections.sort(a);
        Collections.sort(b);
        Collections.reverse(b);
        int j=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                res[i]=a.get(j++);
            }else{
                res[i]=b.get(k++);
            }
        }
        return res;
    }
}