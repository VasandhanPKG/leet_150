class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Set<String> used = new HashSet<>();
        
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;
        
        for (int i = 0; i < words.length; i++) {
            char ch = pattern.charAt(i);
            String word = words[i];
            
            if (map.containsKey(ch)) {
               
                if (!map.get(ch).equals(word)) {
                    return false;
                }
            } else {
                
                if (used.contains(word)) {
                    return false;
                }
                map.put(ch, word);
                used.add(word);
            }
        }
        return true;
    }
}