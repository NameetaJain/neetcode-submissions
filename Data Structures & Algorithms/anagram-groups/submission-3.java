class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> resultMap = new HashMap<>();

        for(String s:strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String str = String.valueOf(chars);

            resultMap.computeIfAbsent(str, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(resultMap.values());

    }
}
