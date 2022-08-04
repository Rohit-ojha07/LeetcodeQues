class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] letter=new int[26];
        for(int i=0;i<26;i++){
            letter[i]=-1;
        }
         for(int i=0;i<sentence.length();i++){
             char ch = sentence.charAt(i);
            // System.out.println(ch);
            letter[ch - 97]++;
        }
        for(int i : letter){
            if(i == -1)return false;
        }
        return true;
        
    }
}