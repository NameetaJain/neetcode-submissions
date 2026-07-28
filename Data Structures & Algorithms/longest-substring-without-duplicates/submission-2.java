class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> smap = new HashMap<>();
        int maxLen = 1, left = 0, right = 0;

        if(s.isEmpty() || s.length() == 1) return s.length();
        smap.put(s.charAt(0),0);
        
        for(right = 1; right < s.length(); right++){
            char c = s.charAt(right);
            if(smap.containsKey(c)){
                left = Math.max(left, smap.get(c) + 1);
            }
            smap.put(c,right);
            maxLen = Math.max(maxLen, right - left + 1);

        }
        return maxLen;
    }
}
