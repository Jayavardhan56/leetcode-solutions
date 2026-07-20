class Solution {
    public int mostWordsFound(String[] sentences) {
        int a[]=new int[sentences.length];
        for(int i=0;i<sentences.length;i++){
            a[i]=sentences[i].trim().split("\\s+").length;
        }
        Arrays.sort(a);
        return a[sentences.length-1];
    }
}