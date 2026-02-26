class Solution {
    public int lengthOfLastWord(String s) {
        int i;
        s=s.trim();
        for(i=s.length()-1;i>=0 &&( s.charAt(i)!=' ');i--);
        return s.length()-i-1;
        
    }
}