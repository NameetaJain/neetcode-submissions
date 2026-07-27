class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new LinkedList<>();

        Map<String,List<String>> strMap = new HashMap<>();

        for(String s: strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String str = new String(c);
            List l = strMap.getOrDefault(str, new ArrayList<>());
            l.add(s);
            strMap.put(str,l);
        }

        return new ArrayList<>(strMap.values());
    }
}
