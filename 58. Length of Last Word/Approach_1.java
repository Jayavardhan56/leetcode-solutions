class Solution {
    public int lengthOfLastWord(String s) {
        String res1[]=s.trim().split(" ");
        return res1[res1.length-1].length();
        
    }
}