class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> smap = new HashMap<>();

        if(s.length() != t.length())
            return false;
            
        for(char c : s.toCharArray()){
            smap.put(c, smap.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray()){
            if(smap.containsKey(c)){
                int n = smap.get(c);
                if(n == 1)
                    smap.remove(c);
                else
                    smap.put(c, n - 1);
            } else 
                return false;
        }

        return smap.isEmpty();
    }
}
