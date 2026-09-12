class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> res=new Stack<>();
        int sum=0;
        for(String s:operations){
            if(s.equals("+")){
                int a=res.pop();
                int b=res.peek();
                res.push(a);
                res.push(a+b);
            }else if(s.equals("D")){
                res.push(res.peek()*2);
            }else if(s.equals("C")){
                res.pop();
            }else{
                res.push(Integer.parseInt(s));
            }
        }
        for(int i:res){
            sum+=i;
        }
        return sum;
    }
}