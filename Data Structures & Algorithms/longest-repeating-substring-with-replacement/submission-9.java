class Solution {
    public int characterReplacement(String s, int k) {
        int result = 0, maxFreq = 0;
        int start = 0, end = 0;
        int[] freq = new int[26];

        for(end = 0; end < s.length(); end++){
            
            char c = s.charAt(end);
            freq[c - 'A']++;
            maxFreq = Math.max(maxFreq, freq[c - 'A']);

            int winSize = end - start + 1;
            int gap = winSize - maxFreq;
            if(gap <= k){ //expand window
                result = Math.max(result, winSize);
            } else {
                while((end - start + 1) - maxFreq > k){
                    freq[s.charAt(start) - 'A']--;
                    maxFreq = Math.max(maxFreq, freq[c - 'A']);
                    start++;
                }
            }
        }
        return result;
    }
}
