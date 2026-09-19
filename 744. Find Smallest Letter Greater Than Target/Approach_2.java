class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int asc1=(int)target;
        int res=-1;
        for(char c:letters){
            int asc2=(int)c;
            if(asc2>asc1){
                res=asc2;
                break;
            }
        }
        char s='\0';
        if(res==-1){
            s=letters[0];
        }
        else{
            s=(char)res;
        }
        return s;        
    }
}