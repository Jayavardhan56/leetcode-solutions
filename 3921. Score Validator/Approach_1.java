class Solution {
    public int[] scoreValidator(String[] events) {
        int res[]=new int[2];
        int score=0,count=0;
            for(String s:events){
                if(s.equals("W")){
                    count+=1;
                }
                else if(s.equals("WD") || s.equals("NB")){
                    score+=1;
                }else{
                    int num=Integer.parseInt(s);
                    score+=num;
                }
                if(count>=10){
                    break;
                }
            }
        res[0]=score;
        res[1]=count;
        return res;
    }
}